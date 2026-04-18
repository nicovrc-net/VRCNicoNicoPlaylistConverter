package net.nicovrc.dev;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.sun.security.auth.module.NTSystem;
import com.sun.security.auth.module.UnixSystem;
import javafx.application.Platform;
import javafx.scene.control.Label;
import net.nicovrc.dev.data.NicoNicoCookie;
import net.nicovrc.dev.data.NicoNicoPlayList;
import net.nicovrc.dev.data.PlayListData;
import net.nicovrc.dev.json.*;
import net.nicovrc.dev.prefab.Kinel;
import net.nicovrc.dev.prefab.YamaPlayer1;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function {

    public static final String Version = "0.4.0-beta.1";

    public static final String UserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:149.0) Gecko/20100101 Firefox/149.0 VRCNicoNicoPlaylistConverter/"+Version;
    public static final String NicoNicoLoginUrl = "https://account.nicovideo.jp/login?site=niconico&next_url=%2F&sec=header_pc&cmnhd_ref=device%3Dpc%26site%3Dniconico%26pos%3Dheader_login%26page%3Dtop";
    public static final String LoginAfterUrl = "https://www.nicovideo.jp/";

    public static final Pattern mylist_url1 = Pattern.compile("https://www\\.nicovideo\\.jp/user/(\\d+)/mylist/(\\d+)");
    public static final Pattern mylist_url2 = Pattern.compile("https://www\\.nicovideo\\.jp/mylist/(\\d+)");
    public static final Pattern matcher_Json = Pattern.compile("<meta name=\"server-response\" content=\"\\{(.+)}\" />");
    public static final Pattern matcher_JsonNico = Pattern.compile("<script id=\"embedded-data\" data-props=\"(.+)\"></script><script id=\"");

    public static final Pattern matcher_imagefile = Pattern.compile("(\\.jpg|\\.jpeg|\\.png|\\.webp|\\.gif)");
    public static final Pattern matcher_ffmpeg = Pattern.compile("/(.+)/ffmpeg");

    private static Pattern cookie_pattern1 = Pattern.compile("(.+)=(.+); Max-Age=");
    private static Pattern cookie_pattern2 = Pattern.compile("(.+)=(.+); expires=");
    private static Pattern cookie_pattern3 = Pattern.compile("(.+)=(.+); Path=");

    private static Pattern matcher_NicoNicoMyList = Pattern.compile("data-initial-data=\"\\{(.+)\\}");

    public static Gson gson = new Gson();

    public static HashMap<String, String> langData = null;
    private static String key_str = new String(Base64.getEncoder().encode("VRCNicoNicoPlayListConverter".getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);

    public static NicoNicoCookie NicoNicoLogin(String email, String password){

        NicoNicoCookie cookie = new NicoNicoCookie();
        cookie.setLogin(false);

        try (HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NEVER)
                .connectTimeout(Duration.ofSeconds(5))
                .build()) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(NicoNicoLoginUrl))
                    .headers("User-Agent", Function.UserAgent)
                    .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                    .GET()
                    .build();

            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

            List<String> headers = send.headers().allValues("set-cookie");
            for (String str : headers){
                //System.out.println(str);
                Matcher matcher = cookie_pattern1.matcher(str);
                if (matcher.find()){
                    //System.out.println(matcher.group(1));
                    if (matcher.group(1).equals("nicosid")){
                        cookie.setNicosid(matcher.group(2));
                        break;
                    }

                    if (matcher.group(1).equals("registrationActionTrackId")){
                        cookie.setRegistrationActionTrackId(matcher.group(2));
                    }
                }
            }


            //System.out.println("mail_tel="+ URLEncoder.encode(email, StandardCharsets.UTF_8) +"&password="+URLEncoder.encode(password, StandardCharsets.UTF_8)+"&auth_id="+new Date().getTime());
            //System.out.println("registrationActionTrackId="+cookie.getRegistrationActionTrackId()+"; nicosid="+cookie.getNicosid());
            request = HttpRequest.newBuilder()
                    .uri(new URI("https://account.nicovideo.jp/login/redirector?show_button_twitter=1&show_button_facebook=1&site=niconico&sec=header_pc&next_url=%2F"))
                    .headers("User-Agent", Function.UserAgent)
                    .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                    .headers("Content-Type", "application/x-www-form-urlencoded")
                    .headers("Cookie", "registrationActionTrackId="+cookie.getRegistrationActionTrackId()+"; nicosid="+cookie.getNicosid())
                    .POST(HttpRequest.BodyPublishers.ofString("mail_tel="+ URLEncoder.encode(email, StandardCharsets.UTF_8) +"&password="+URLEncoder.encode(password, StandardCharsets.UTF_8)+"&auth_id="+new Date().getTime()))
                    .build();
            send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

            Map<String, List<String>> map = send.headers().map();
            /*send.headers().map().forEach((name, value)->{
                System.out.println("--- " + name + " ---");
                for (String str : value){
                    System.out.println(str);
                }
            });*/

            if (send.headers().firstValue("location").isPresent() && send.headers().firstValue("location").get().equals(LoginAfterUrl)){
                for (String s : map.get("set-cookie")) {
                    Matcher matcher = cookie_pattern2.matcher(s);
                    if (matcher.find() && matcher.group(1).equals("user_session") && !matcher.group(2).equals("deleted")){
                        cookie.setLogin(true);
                        cookie.setUser_session(matcher.group(2));

                        break;
                    }
                }
            } else if (send.headers().firstValue("location").isPresent() && send.headers().firstValue("location").get().startsWith("https://account.nicovideo.jp/mfa?")) {
                cookie.setMfw_url(send.headers().firstValue("location").get());
                for (String s : map.get("set-cookie")) {
                    Matcher matcher = cookie_pattern3.matcher(s);
                    if (matcher.find() && matcher.group(1).equals("mfa_session") && !matcher.group(2).equals("deleted")){
                        cookie.setMfa_session(matcher.group(2));
                        break;
                    }
                }
            }

        } catch (Exception e){
            //e.printStackTrace();
        }

        return cookie;

    }

    public static NicoNicoCookie NicoNicoLogin(NicoNicoCookie cookie, String code) throws Exception{

        // debug用
        if (code == null || code.isEmpty()){
            System.out.println("otp : ");
            Scanner scanner = new Scanner(System.in);
            code = scanner.next();
        }

        try (HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NEVER)
                .connectTimeout(Duration.ofSeconds(5))
                .build()) {

            //System.out.println(cookie.getMfw_url());
            //System.out.println("nicosid="+cookie.getNicosid()+"; mfa_session="+cookie.getMfa_session());
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(cookie.getMfw_url()))
                    .headers("User-Agent", Function.UserAgent)
                    .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                    .headers("Content-Type", "application/x-www-form-urlencoded")
                    .headers("Cookie", "nicosid="+cookie.getNicosid()+"; mfa_session="+cookie.getMfa_session())
                    .POST(HttpRequest.BodyPublishers.ofString("otp="+ code +"&loginBtn=%E3%83%AD%E3%82%B0%E3%82%A4%E3%83%B3&device_name=Firefox+%28Windows%29"))
                    .build();

            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

            /*Map<String, List<String>> map = send.headers().map();
            map.forEach((name, value)->{
                System.out.println("--- " + name + " ---");
                for (String str : value){
                    System.out.println(str);
                }
            });*/

            if (send.headers().firstValue("location").isPresent() && send.headers().firstValue("location").get().startsWith("https://account.nicovideo.jp/login/mfa/callback")){
                String location = send.headers().firstValue("location").get();
                //System.out.println("url : "+ location);
                //System.out.println("cookie : " + "nicosid="+cookie.getNicosid()+"; mfa_session="+cookie.getMfa_session());

                request = HttpRequest.newBuilder()
                        .uri(new URI(location))
                        .headers("User-Agent", Function.UserAgent)
                        .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                        .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                        .headers("Cookie", "nicosid="+cookie.getNicosid())
                        .GET()
                        .build();

                send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
                Map<String, List<String>> map = send.headers().map();
                /*map.forEach((name, value)->{
                    System.out.println("--- " + name + " ---");
                    for (String str : value){
                        System.out.println(str);
                    }
                });*/
                //System.out.println(send.body());

                if (send.headers().firstValue("location").isPresent() && send.headers().firstValue("location").get().equals(LoginAfterUrl)){
                    for (String str : map.get("set-cookie")) {
                        Matcher matcher = cookie_pattern1.matcher(str);
                        if (matcher.find() && matcher.group(1).equals("user_session") && !matcher.group(2).equals("deleted")){
                            cookie.setLogin(true);
                            cookie.setUser_session(matcher.group(2));
                            break;
                        }
                    }
                }

            }

        }

        return cookie;
    }
    public static String FileRead_text(String filePass){
        String Text = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePass), StandardCharsets.UTF_8))){
            String str;
            StringBuilder sb = new StringBuilder();
            while ((str = reader.readLine()) != null) {
                sb.append(str).append("\n");
            }
            Text = sb.substring(0, Text.length() - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Text;
    }

    public static byte[] FileRead_binary(String filePass){
        try (FileInputStream fis = new FileInputStream(filePass)) {

            return fis.readAllBytes();
        } catch (Exception e){
            return null;
        }
    }

    public static void FileWrite_text(String filePass, String text){
        try (FileWriter file1 = new FileWriter(filePass);
             PrintWriter pw = new PrintWriter(new BufferedWriter(file1))){

            pw.print(text);
        } catch (Exception e){
            //e.printStackTrace();
        }
    }

    public static void FileWrite_binary(String filePass, byte[] content){
        try (FileOutputStream stream = new FileOutputStream(filePass)){
            stream.write(content);
        } catch (Exception e){
            //e.printStackTrace();
        }
    }

    public static String DecrypterText(String text) throws Exception {

        if (System.getProperty("os.name").toLowerCase(Locale.ROOT).startsWith("windows")){
            key_str = new NTSystem().getName();
            key_str = (!key_str.isEmpty() ? key_str.substring(0, 1) : "") + (key_str.length() >= 3 ? key_str.substring(2, 3) : "") + (key_str.length() >= 5 ? key_str.substring(4, 5) : "") + (key_str.length() >= 7 ? key_str.substring(6, 7) : "");
        } else if (System.getProperty("os.name").toLowerCase(Locale.ROOT).equals("linux")){
            key_str = new UnixSystem().getUsername();
        } else {
            key_str = (!key_str.isEmpty() ? key_str.substring(0, 1) : "") + (key_str.length() >= 3 ? key_str.substring(2, 3) : "") + (key_str.length() >= 5 ? key_str.substring(4, 5) : "") + (key_str.length() >= 7 ? key_str.substring(6, 7) : "");
        }

        final IvParameterSpec iv = new IvParameterSpec(Arrays.copyOf(key_str.getBytes(StandardCharsets.UTF_8), 16));
        final String ENCRYPT_KEY = key_str.substring(0, 1) + key_str.substring(2, 3) + new String(Base64.getEncoder().encode("VRCNicoNicoPlayListConverter".getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final SecretKeySpec key = new SecretKeySpec(Arrays.copyOf(ENCRYPT_KEY.getBytes(StandardCharsets.UTF_8), 32), "AES");

        Cipher decrypter = Cipher.getInstance("AES/CBC/PKCS5Padding");
        decrypter.init(Cipher.DECRYPT_MODE, key, iv);

        byte[] byteToken = Base64.getDecoder().decode(text);
        String s = new String(decrypter.doFinal(byteToken), StandardCharsets.UTF_8);

        return s;
    }

    public static String EncrypterText(String text) throws Exception {

        if (System.getProperty("os.name").toLowerCase(Locale.ROOT).startsWith("windows")){
            key_str = new NTSystem().getName();
            key_str = (!key_str.isEmpty() ? key_str.substring(0, 1) : "") + (key_str.length() >= 3 ? key_str.substring(2, 3) : "") + (key_str.length() >= 5 ? key_str.substring(4, 5) : "") + (key_str.length() >= 7 ? key_str.substring(6, 7) : "");
        } else if (System.getProperty("os.name").toLowerCase(Locale.ROOT).equals("linux")){
            key_str = new UnixSystem().getUsername();
        } else {
            key_str = (!key_str.isEmpty() ? key_str.substring(0, 1) : "") + (key_str.length() >= 3 ? key_str.substring(2, 3) : "") + (key_str.length() >= 5 ? key_str.substring(4, 5) : "") + (key_str.length() >= 7 ? key_str.substring(6, 7) : "");
        }

        final IvParameterSpec iv = new IvParameterSpec(Arrays.copyOf(key_str.getBytes(StandardCharsets.UTF_8), 16));
        final String ENCRYPT_KEY = key_str.substring(0, 1) + key_str.substring(2, 3) + new String(Base64.getEncoder().encode("VRCNicoNicoPlayListConverter".getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final SecretKeySpec key = new SecretKeySpec(Arrays.copyOf(ENCRYPT_KEY.getBytes(StandardCharsets.UTF_8), 32), "AES");

        Cipher encrypter = Cipher.getInstance("AES/CBC/PKCS5Padding");
        encrypter.init(Cipher.ENCRYPT_MODE, key, iv);

        byte[] byteToken = encrypter.doFinal(text.getBytes(StandardCharsets.UTF_8));

        return new String(Base64.getEncoder().encode(byteToken), StandardCharsets.UTF_8);

    }

    public static HashMap<String, String> getTextList(String lang){
        File file = new File("./lang/"+lang+".txt");

        String Text = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))){
            String str;
            StringBuilder sb = new StringBuilder();
            while ((str = reader.readLine()) != null) {
                sb.append(str).append("\n");
            }
            Text = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String s = Text.substring(0, Text.length() - 1);

        HashMap<String, String> map = new HashMap<>();

        for (String str : s.split("\n")) {
            String[] split = str.split("=");
            map.put(split[0], split[1]);
        }

        return map;
    }

    public static String getVideoTitle(String url, String cookieText){
        String str = "";
        JsonElement json = null;

        try (HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .connectTimeout(Duration.ofSeconds(5))
                .build()) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .headers("User-Agent", Function.UserAgent)
                    .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                    .headers("Cookie", cookieText)
                    .GET()
                    .build();
            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            //System.out.println(send.body());
            String jsonText = send.body();

            Matcher matcher = Function.matcher_Json.matcher(jsonText);

            if (matcher.find()){
                json = Function.gson.fromJson("{" + matcher.group(1).replaceAll("&quot;", "\"") + "}", JsonElement.class);
            } else {
                matcher = Function.matcher_JsonNico.matcher(jsonText);
                if (matcher.find()){
                    //System.out.println(matcher.group(1).replaceAll("&quot;", "\""));
                    json = gson.fromJson(matcher.group(1).replaceAll("&quot;", "\""), JsonElement.class);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            return str;
        }

        if (json != null) {
            if (json.isJsonObject() && json.getAsJsonObject().has("data")) {
                str = json.getAsJsonObject().get("data").getAsJsonObject().get("response").getAsJsonObject().get("video").getAsJsonObject().get("title").getAsString();
            } else if (json.isJsonObject() && json.getAsJsonObject().has("program")) {
                str = json.getAsJsonObject().get("program").getAsJsonObject().get("title").getAsString();
            }
        }

        return str;
    }

    public static NicoNicoPlayList getPlayList(String url, String cookieText){
        final NicoNicoPlayList playList = new NicoNicoPlayList();
        List<PlayListData> list = new ArrayList<>();

        JsonElement json = null;
        try (HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .connectTimeout(Duration.ofSeconds(5))
                .build()) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .headers("User-Agent", Function.UserAgent)
                    .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                    .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                    .headers("Cookie", cookieText)
                    .GET()
                    .build();
            HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            //System.out.println(send.body());
            String html = send.body();

            Matcher matcher = matcher_NicoNicoMyList.matcher(html);

            if (matcher.find()){
                String jsonText = matcher.group(1).replaceAll("&quot;", "\"");
                //System.out.println(jsonText);
                //System.out.println("{"+jsonText+"}");
                json = gson.fromJson("{"+jsonText+"}", JsonElement.class);

                // このままだと最新20件しか取得しないので取り直す
                if (json.getAsJsonObject().has("nvapi") && json.getAsJsonObject().get("nvapi").getAsJsonArray().get(0).getAsJsonObject().has("body") && json.getAsJsonObject().get("nvapi").getAsJsonArray().get(0).getAsJsonObject().get("body").getAsJsonObject().get("meta").getAsJsonObject().get("status").getAsInt() == 200){
                    String uri = json.getAsJsonObject().get("nvapi").getAsJsonArray().get(0).getAsJsonObject().get("path").getAsString();

                    boolean isEnd = false;
                    int page = 1;
                    while (!isEnd){
                        if (page == 1){
                            playList.setPlaylistTitle(json.getAsJsonObject().get("nvapi").getAsJsonArray().get(0).getAsJsonObject().get("body").getAsJsonObject().get("data").getAsJsonObject().get("mylist").getAsJsonObject().get("name").getAsString());
                        }

                        request = HttpRequest.newBuilder()
                                .uri(new URI("https://nvapi.nicovideo.jp" + uri + "?pageSize=100&page="+page+"&sensitiveContents=mask"))
                                .headers("User-Agent", Function.UserAgent)
                                .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                                .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                                .headers("Cookie", cookieText)
                                .headers("X-Frontend-Id", "6")
                                .headers("X-Frontend-Version", "0")
                                .headers("X-Niconico-Language", "ja-jp")
                                .GET()
                                .build();

                        send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
                        //System.out.println(send.body());
                        jsonText = send.body();
                        json = gson.fromJson(jsonText, JsonElement.class);

                        //System.out.println("---");
                        //System.out.println(json);
                        //System.out.println("---");

                        if (json == null || !json.getAsJsonObject().get("data").getAsJsonObject().get("mylist").getAsJsonObject().has("items") || json.getAsJsonObject().get("data").getAsJsonObject().get("mylist").getAsJsonObject().get("items").getAsJsonArray().isEmpty()){
                            isEnd = true;
                            page++;
                            continue;
                        }

                        for (JsonElement element : json.getAsJsonObject().get("data").getAsJsonObject().get("mylist").getAsJsonObject().get("items").getAsJsonArray()) {
                            PlayListData data = new PlayListData();
                            data.setTitle(element.getAsJsonObject().get("video").getAsJsonObject().get("title").getAsString());
                            data.setVideoURL("https://www.nicovideo.jp/watch/"+element.getAsJsonObject().get("watchId").getAsString());
                            list.add(data);
                        }

                        page++;
                    }

                    //System.out.println(json);
                }
            }

        } catch (Exception e){
            e.printStackTrace();
            playList.setPlaylistData(list);
            return playList;
        }

        playList.setPlaylistData(list);
        return playList;
    }

    public static String getFontLang(){
        try {
            if (langData.get("lang_name").startsWith("한국어")){
                return  "KR";
            } else if (langData.get("lang_name").startsWith("简体中文")){
                return  "SC";
            } else if (langData.get("lang_name").startsWith("繁體中文")){
                return  "TC";
            }
        } catch (Exception e){
            //e.printStackTrace();
            return null;
        }
        return "JP";
    }

    public static void Convert(String inputText, String outputMode, String outputSiteName, Label status) throws Exception{

        if (!outputMode.equals("Sliden")){
            String cookieText = Function.DecrypterText(Function.FileRead_text("./tools/cookie.txt"));

            String[] split = inputText.split("\n");
            if (split.length == 0 || inputText.isEmpty()){
                if (status != null){
                    Platform.runLater(()->status.setText(langData.get("main_status_empty_error")));
                } else {
                    System.out.println(langData.get("main_status_empty_error"));
                }
                return;
            }

            // 仮組み立て
            List<PlayListData> list = new ArrayList<>();
            for (String url : split){
                url = url.split("\\?")[0];
                PlayListData playListData = new PlayListData();
                if (url.startsWith("https://nico.ms") || url.startsWith("http://nico.ms") || url.startsWith("https://www.nicovideo.jp/watch/") || url.startsWith("http://www.nicovideo.jp/watch/")){
                    playListData.setTitle("動画");
                    playListData.setVideoURL(url);
                    list.add(playListData);
                } else if (Function.mylist_url1.matcher(url).find()) {
                    playListData.setTitle("プレイリスト");
                    playListData.setVideoURL(url);
                    list.add(playListData);
                } else if (Function.mylist_url2.matcher(url).find()) {
                    playListData.setTitle("プレイリスト");
                    playListData.setVideoURL(url);
                    list.add(playListData);
                }
            }

            //
            String startURL = "";
            if (outputSiteName.equals("nicovrc.net")){
                startURL = "https://nicovrc.net/?url=";
            } else if (outputSiteName.equals("tool.suzumebachi.xyz")) {
                startURL = "https://testniconicomment.suzumebachi.xyz/nicovideo/#id#";
            }

            // 動画情報取得
            List<PlayListData> temp = new ArrayList<>();
            String playlistTitle = null;
            for (PlayListData data : list) {
                //System.out.println(data.getTitle() + " / " + data.getVideoURL());
                if (data.getTitle().equals("動画")){
                    PlayListData tempData = new PlayListData();
                    tempData.setTitle(Function.getVideoTitle(data.getVideoURL(), cookieText));
                    if (startURL.startsWith("https://testniconicomment")){
                        tempData.setVideoURL(startURL.replaceAll("#id", data.getVideoURL().split("/")[data.getVideoURL().split("/").length - 1]));
                    } else {
                        tempData.setVideoURL(startURL+data.getVideoURL());
                    }
                    temp.add(tempData);
                    if (list.size() == 1){
                        playlistTitle = tempData.getTitle();
                    }
                } else {
                    if (status != null){
                        Platform.runLater(()->status.setText(langData.get("main_status_get_mylist")));
                    } else {
                        System.out.println(langData.get("main_status_get_mylist"));
                    }
                    NicoNicoPlayList playList = Function.getPlayList(data.getVideoURL(), cookieText);
                    if (list.size() == 1){
                        playlistTitle = playList.getPlaylistTitle();
                    }

                    int i = 0;
                    for (PlayListData d : playList.getPlaylistData()) {
                        final String finalI = ""+i;
                        if (status != null){
                            Platform.runLater(()->status.setText(langData.get("main_status_get_mylist_get_list").replaceAll("#now#", finalI).replaceAll("#max#", ""+playList.getPlaylistData().size())));
                        } else {
                            System.out.println(langData.get("main_status_get_mylist_get_list").replaceAll("#now#", finalI).replaceAll("#max#", ""+playList.getPlaylistData().size()));
                        }

                        if (startURL.startsWith("https://testniconicomment")){
                            d.setVideoURL(startURL.replaceAll("#id", data.getVideoURL().split("/")[data.getVideoURL().split("/").length - 1]));
                        } else {
                            d.setVideoURL(startURL+data.getVideoURL());
                        }
                        temp.add(d);
                        i++;
                    }

                    if (status != null){
                        Platform.runLater(()->status.setText(langData.get("main_status_get_mylist_get_success")));
                    } else {
                        System.out.println(langData.get("main_status_get_mylist_get_success"));
                    }
                }
            }

            // JSON or Prefabへ
            int min = 0;
            final String maxText = ""+temp.size();

            if (status != null){
                Platform.runLater(()->status.setText(langData.get("main_status_get_mylist_assembly").replaceAll("#player#", outputMode)));
            } else {
                System.out.println(langData.get("main_status_get_mylist_assembly").replaceAll("#player#", outputMode));
            }

            String jsonText = "";
            String jsonBackupText = null;

            if (outputMode.equals("iwaSync ("+langData.get("main_json")+")")){
                iwaSync json = new iwaSync();
                iwaSync_Tracks[] iwaSyncTracks = new iwaSync_Tracks[temp.size()];

                for (PlayListData data : temp) {
                    int finalMin = min;
                    if (status != null){
                        Platform.runLater(()->status.setText(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalMin).replaceAll("#max#", maxText)));
                    } else {
                        System.out.println(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalMin).replaceAll("#max#", maxText));
                    }
                    iwaSyncTracks[min] = new iwaSync_Tracks();
                    iwaSyncTracks[min].setMode(1);
                    iwaSyncTracks[min].setTitle(data.getTitle());
                    iwaSyncTracks[min].setUrl(data.getVideoURL());
                    min++;
                }

                json.setTracks(iwaSyncTracks);
                jsonText = Function.gson.toJson(json);
            } else if (outputMode.equals("iwaSync ("+langData.get("main_prefab")+")")){

                net.nicovrc.dev.prefab.iwaSync iwaSync = new net.nicovrc.dev.prefab.iwaSync();
                iwaSync.setUrls(temp);

                jsonText = iwaSync.getPrefab();

            } else if (outputMode.equals("KineL式(りら式) ("+langData.get("main_prefab")+")")){

                Kinel kinel = new Kinel();
                kinel.setUrls(temp);

                jsonText = kinel.getPrefab();

            } else if (outputMode.equals("YamaPlayer ("+langData.get("main_json")+")")){

                YamaPlayer yamaPlayer = new YamaPlayer();
                YamaPlayer_playlists[] playlists = {new YamaPlayer_playlists()};
                if (playlistTitle != null){
                    playlists[0].setName(playlistTitle);
                }
                playlists[0].setTracks(new YamaPlayer_Tracks[temp.size()]);

                for (PlayListData data : temp) {
                    int finalMin = min;
                    Platform.runLater(()->status.setText(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalMin).replaceAll("#max#", maxText)));
                    playlists[0].getTracks()[min] = new YamaPlayer_Tracks();
                    playlists[0].getTracks()[min].setMode(1);
                    playlists[0].getTracks()[min].setTitle(data.getTitle());
                    playlists[0].getTracks()[min].setUrl(data.getVideoURL());
                    min++;
                }

                yamaPlayer.setPlaylists(playlists);

                jsonText = Function.gson.toJson(yamaPlayer);

            } else if (outputMode.equals("YamaPlayer (v1,"+langData.get("main_prefab")+")")){

                YamaPlayer1 yamaPlayer1 = new YamaPlayer1();
                yamaPlayer1.setUrls(temp);
                if (playlistTitle != null){
                    yamaPlayer1.setPlaylistName(playlistTitle);
                } else {
                    yamaPlayer1.setPlaylistName("NicoNicoPlaylist");
                }

                jsonText = yamaPlayer1.getPrefab();

            } else if (outputMode.equals("YamaPlayer (v2,"+langData.get("main_prefab")+")")){

                YamaPlayer1 yamaPlayer1 = new YamaPlayer1();
                yamaPlayer1.setUrls(temp);
                if (playlistTitle != null){
                    yamaPlayer1.setPlaylistName(playlistTitle);
                } else {
                    yamaPlayer1.setPlaylistName("NicoNicoPlaylist");
                }

                jsonText = yamaPlayer1.getPrefab();

            } else if (outputMode.equals("VizVid ("+langData.get("main_json")+")")){

                VizVid vizVid = new VizVid();
                if (playlistTitle != null){
                    vizVid.setTitle(playlistTitle);
                }
                VizVid_entries[] entries = new VizVid_entries[temp.size()];

                int i = 0;
                for (PlayListData playListData : temp) {
                    int finalI = i;
                    if (status != null){
                        Platform.runLater(()->status.setText(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalI).replaceAll("#max#", maxText)));
                    } else {
                        System.out.println(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalI).replaceAll("#max#", maxText));
                    }

                    entries[i] = new VizVid_entries();
                    entries[i].setTitle(playListData.getTitle());
                    entries[i].setUrl(playListData.getVideoURL());
                    entries[i].setUrlForQuest(playListData.getVideoURL());
                    entries[i].setPlayerIndex(0);

                    i++;
                }

                vizVid.setEntries(entries);
                jsonText = Function.gson.toJson(vizVid);

            } else if (outputMode.equals("あやぷれいやー2 ("+langData.get("main_json")+")")){

                ayaplayer ayaplayer = new ayaplayer();
                ayaplayer_backup backup = new ayaplayer_backup();

                ayaplayer.setPart(0);
                ayaplayer.setTotal_parts(1);
                ayaplayer.setCount(temp.size() + 1);
                ayaplayer.setTitles(new String[temp.size() + 1]);
                ayaplayer.setUrls(new String[temp.size()]);

                ayaplayer.getTitles()[0] = "Root";

                int[] temp1 = new int[temp.size() + 1];
                int[] temp2 = new int[temp.size() + 1];
                int[] temp3 = new int[temp.size() + 1];

                temp1[0] = 1;
                temp2[0] = -1;
                temp3[0] = -1;

                int i = 1;
                for (PlayListData playListData : temp) {
                    int finalI = i;
                    if (status != null){
                        Platform.runLater(()->status.setText(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalI).replaceAll("#max#", maxText)));
                    } else {
                        System.out.println(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalI).replaceAll("#max#", maxText));
                    }

                    ayaplayer.getTitles()[i] = playListData.getTitle();
                    ayaplayer.getUrls()[i - 1] = playListData.getVideoURL();

                    temp1[i] = 0;
                    temp2[i] = 0;
                    temp3[i] = i - 1;

                    i++;
                }

                ayaplayer.setTypes_base64(intArrayToBase64(temp1));
                ayaplayer.setParents_base64(intArrayToBase64(temp2));
                ayaplayer.setTargets_base64(intArrayToBase64(temp3));


                jsonText = Function.gson.toJson(ayaplayer);

                backup.setTitle("Root");
                backup.setType("folder");
                backup.setChildren(new ayaplayer_backup_children[temp.size()]);
                i = 0;
                for (PlayListData playListData : temp) {
                    int finalI = i;
                    if (status != null){
                        Platform.runLater(()->status.setText(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalI).replaceAll("#max#", maxText)));
                    } else {
                        System.out.println(langData.get("main_status_get_list").replaceAll("#player#", outputMode).replaceAll("#now#", ""+ finalI).replaceAll("#max#", maxText));
                    }

                    backup.getChildren()[i] = new ayaplayer_backup_children();
                    backup.getChildren()[i].setTitle(playListData.getTitle());
                    backup.getChildren()[i].setType("video");
                    backup.getChildren()[i].setUrl(playListData.getVideoURL());

                    i++;
                }

                jsonBackupText = Function.gson.toJson(backup);

            }

            String jsonFileName = "./NicoNicoJson" + (outputMode.endsWith(langData.get("main_json") + ")") ? ".json" : ".prefab");
            if (playlistTitle != null){
                jsonFileName = playlistTitle + (outputMode.endsWith(langData.get("main_json") + ")") ? ".json" : ".prefab");
            }

            if (new File(jsonFileName).exists()){
                new File(jsonFileName).delete();
            }

            try (FileWriter file1 = new FileWriter(jsonFileName);
                 PrintWriter pw = new PrintWriter(new BufferedWriter(file1))){

                pw.print(jsonText);
            } catch (Exception e){
                //e.printStackTrace();
            }

            if (jsonBackupText != null){
                try (FileWriter file1 = new FileWriter(jsonFileName.replaceAll("\\.json", "_backup.json"));
                     PrintWriter pw = new PrintWriter(new BufferedWriter(file1))){

                    pw.print(jsonBackupText);
                } catch (Exception e){
                    //e.printStackTrace();
                }
            }

            if (status != null){
                Platform.runLater(()->status.setText(langData.get("main_status_get_success").replaceAll("#player#", outputMode)));
            } else {
                System.out.println(langData.get("main_status_get_success").replaceAll("#player#", outputMode));
            }

        } else {
            // Sliden
            // ffmpeg
            String ffmpegPass = "";
            if (System.getProperty("os.name").toLowerCase(Locale.ROOT).startsWith("windows")) {
                File ffmpeg_file = new File("C:/Windows/ffmpeg.exe");
                if (!ffmpeg_file.exists()){
                    ffmpeg_file = new File("C:/Windows/System32/ffmpeg.exe");
                }
                if (!ffmpeg_file.exists()){
                    ffmpeg_file = new File("D:/Windows/ffmpeg.exe");
                }
                if (!ffmpeg_file.exists()){
                    ffmpeg_file = new File("D:/Windows/System32/ffmpeg.exe");
                }
                if (!ffmpeg_file.exists()){
                    ffmpeg_file = new File("./tools/ffmpeg.exe");
                }

                if (!ffmpeg_file.exists()){
                    try (HttpClient client = HttpClient.newBuilder()
                            .version(HttpClient.Version.HTTP_2)
                            .followRedirects(HttpClient.Redirect.ALWAYS)
                            .connectTimeout(Duration.ofSeconds(5))
                            .build()) {

                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(new URI("https://www.gyan.dev/ffmpeg/builds/ffmpeg-release-full.7z"))
                                .headers("User-Agent", Function.UserAgent)
                                .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                                .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                                .GET()
                                .build();
                        HttpResponse<byte[]> send = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

                        try (FileOutputStream fos = new FileOutputStream("./tools/ffmpeg.7z")){
                            fos.write(send.body());
                        }

                        final Runtime runtime = Runtime.getRuntime();
                        final Process exec0 = runtime.exec(new String[]{"cd ./tools/ && tar -xf ./ffmpeg.7z"});
                        Thread.ofVirtual().start(() -> {
                            try {
                                Thread.sleep(10000L);
                            } catch (Exception ex) {
                                //ex.printStackTrace();
                            }

                            if (exec0.isAlive()) {
                                exec0.destroy();
                            }
                        });
                        exec0.waitFor();

                        File file1 = new File("./tools");
                        for (File listFile : file1.listFiles()) {
                            if (listFile.getName().startsWith("ffmpeg")){
                                ffmpegPass = "./tools/"+listFile.getName()+"/bin/ffmpeg.exe";
                                break;
                            }
                        }

                    } catch (Exception e){
                        e.printStackTrace();
                        return;
                    }
                } else {

                    try {
                        ffmpegPass = ffmpeg_file.getCanonicalPath();
                    } catch (Exception e){
                        // e.printStackTrace();
                    }

                }
            } else {
                try {
                    ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", "which ffmpeg");
                    Process process = pb.start();
                    process.waitFor();

                    Matcher matcher = Function.matcher_ffmpeg.matcher(new String(process.getInputStream().readAllBytes(), StandardCharsets.UTF_8));
                    if (matcher.find()){
                        ffmpegPass = "/"+matcher.group(1)+"/ffmpeg";
                    } else {
                        if (status != null){
                            Platform.runLater(()->status.setText(langData.get("main_status_sliden_error_ffmpeg")));
                        } else {
                            System.out.println(langData.get("main_status_sliden_error_ffmpeg"));
                        }
                        return;
                    }

                } catch (Exception e){
                    // e.printStackTrace();
                }
            }

            if (!Function.matcher_imagefile.matcher(inputText).find()){
                if (status != null){
                    Platform.runLater(()->status.setText(langData.get("main_status_sliden_error")));
                } else {
                    System.out.println(langData.get("main_status_sliden_error"));
                }
                return;
            }

            File file1 = new File("./temp");
            if (file1.exists()){
                for (File f : file1.listFiles()) {
                    f.delete();
                }
                file1.delete();
            }

            file1.mkdir();

            String[] split = inputText.split("\n");
            String kaku = split[0].split("\\.")[split[0].split("\\.").length - 1];
            int size = split.length;

            if (status != null){
                Platform.runLater(()->status.setText(langData.get("main_status_get_mylist_assembly").replaceAll("#player#", "Sliden")));
            } else {
                System.out.println(langData.get("main_status_get_mylist_assembly").replaceAll("#player#", "Sliden"));
            }

            for (int i = 0; i < size; i++){

                String[] split1 = split[i].split("\\.");
                String newFileName = String.format("%08d", i) + "." + split1[split1.length - 1];

                FileWrite_binary("./temp/"+newFileName, FileRead_binary(split[i]));
            }

            try {

                File file2 = new File("./Sliden.mp4");
                if (file2.exists()){
                    file2.delete();
                }

                if (System.getProperty("os.name").toLowerCase(Locale.ROOT).startsWith("windows")) {

                    String command = "cd /D \""+new File("./temp").getCanonicalPath()+"\"\n"+ffmpegPass+" -framerate 1 -i %%08d."+kaku+" -c:v libx264 -r 60 -pix_fmt yuv420p ../Sliden.mp4";
                    FileWrite_text("./temp.bat", command);

                    final Runtime runtime = Runtime.getRuntime();
                    final Process exec0 = runtime.exec(new String[]{"./temp.bat"});
                    Thread.ofVirtual().start(() -> {
                        try {
                            Thread.sleep(15000L);
                        } catch (Exception ex) {
                            //ex.printStackTrace();
                        }

                        if (exec0.isAlive()) {
                            exec0.destroy();
                        }
                    });
                    exec0.waitFor();

                    //System.out.println(new String(exec0.getInputStream().readAllBytes(), StandardCharsets.UTF_8));
                    //System.out.println(new String(exec0.getErrorStream().readAllBytes(), StandardCharsets.UTF_8));
                    Platform.runLater(()->status.setText(langData.get("main_status_get_success").replaceAll("#player#", "Sliden")));
                } else {

                    ProcessBuilder pb = new ProcessBuilder(ffmpegPass, "-v", "quiet", "-framerate", "1", "-pattern_type", "glob", "-i", "'./temp/%08d.*'", "-c:v", "libx264", "-r", "60", "-pix_fmt", "yuv420p", "./Sliden.mp4");
                    Process process = pb.start();
                    process.waitFor();
                    Platform.runLater(()->status.setText(langData.get("main_status_get_success").replaceAll("#player#", "Sliden")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String intArrayToBase64(int[] ints) {
        if (ints == null || ints.length == 0) return "";
        ByteBuffer buf = ByteBuffer.allocate(ints.length * Integer.BYTES)
                .order(ByteOrder.LITTLE_ENDIAN);
        for (int v : ints) buf.putInt(v);
        byte[] bytes = buf.array();
        return Base64.getEncoder().encodeToString(bytes);
    }

}
