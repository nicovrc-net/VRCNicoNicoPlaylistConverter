package net.nicovrc.dev;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.sun.security.auth.module.NTSystem;
import com.sun.security.auth.module.UnixSystem;
import net.nicovrc.dev.data.NicoNicoCookie;
import net.nicovrc.dev.data.NicoNicoPlayList;
import net.nicovrc.dev.data.PlayListData;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Function {

    public static final String Version = "0.2.1-beta.1";

    public static final String UserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:144.0) Gecko/20100101 Firefox/144.0 VRCNicoNicoPlaylistConverter/"+Version;
    public static final String NicoNicoLoginUrl = "https://account.nicovideo.jp/login?site=niconico&next_url=%2F&sec=header_pc&cmnhd_ref=device%3Dpc%26site%3Dniconico%26pos%3Dheader_login%26page%3Dtop";
    public static final String LoginAfterUrl = "https://www.nicovideo.jp/";

    public static final Pattern mylist_url1 = Pattern.compile("https://www\\.nicovideo\\.jp/user/(\\d+)/mylist/(\\d+)");
    public static final Pattern mylist_url2 = Pattern.compile("https://www\\.nicovideo\\.jp/mylist/(\\d+)");
    public static final Pattern matcher_Json = Pattern.compile("<meta name=\"server-response\" content=\"\\{(.+)}\" />");
    public static final Pattern matcher_JsonNico = Pattern.compile("<script id=\"embedded-data\" data-props=\"(.+)\"></script><script id=\"");

    private static Pattern cookie_pattern1 = Pattern.compile("(.+)=(.+); Max-Age=");
    private static Pattern cookie_pattern2 = Pattern.compile("(.+)=(.+); expires=");
    private static Pattern cookie_pattern3 = Pattern.compile("(.+)=(.+); Path=");

    private static Pattern matcher_NicoNicoMyList = Pattern.compile("data-initial-data=\"\\{(.+)\\}");

    public static Gson gson = new Gson();

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
}
