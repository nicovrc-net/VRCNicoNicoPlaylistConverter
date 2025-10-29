package net.nicovrc.dev;

import com.google.gson.Gson;
import net.nicovrc.dev.JsonData.*;
import net.nicovrc.dev.data.NicoNicoCookie;

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

    public static final String Version = "0.0.1-alpha.1";

    public static final String UserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:144.0) Gecko/20100101 Firefox/144.0 VRCNicoNicoPlaylistConverter/"+Version;
    public static final String NicoNicoLoginUrl = "https://account.nicovideo.jp/login?site=niconico&next_url=%2F&sec=header_pc&cmnhd_ref=device%3Dpc%26site%3Dniconico%26pos%3Dheader_login%26page%3Dtop";
    public static final String LoginAfterUrl = "https://www.nicovideo.jp/";

    private static Pattern cookie_pattern1 = Pattern.compile("(.+)=(.+); expires=");
    private static Pattern cookie_pattern2 = Pattern.compile("(.+)=(.+); Path=/;");

    public static Gson gson = new Gson();

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
            // 1761743071200
            // 1761739825135
            // 1617687725
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
                    Matcher matcher = cookie_pattern1.matcher(s);
                    if (matcher.find() && matcher.group(1).equals("user_session") && !matcher.group(2).equals("deleted")){
                        cookie.setLogin(true);
                        cookie.setUser_session(matcher.group(2));

                        break;
                    }
                }
            } else if (send.headers().firstValue("location").isPresent() && send.headers().firstValue("location").get().startsWith("https://account.nicovideo.jp/mfa?")) {
                cookie.setMfw_url(send.headers().firstValue("location").get());
                for (String s : map.get("set-cookie")) {
                    Matcher matcher = cookie_pattern2.matcher(s);
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

    public static NicoNicoCookie NicoNicoLogin(NicoNicoCookie cookie, String code){

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

            Map<String, List<String>> map = send.headers().map();
            map.forEach((name, value)->{
                System.out.println("--- " + name + " ---");
                for (String str : value){
                    System.out.println(str);
                }
            });

            if (send.headers().firstValue("location").isPresent() && send.headers().firstValue("location").get().startsWith("https://account.nicovideo.jp/login/mfa/callback")){
                String location = send.headers().firstValue("location").get();
                System.out.println("url : "+ location);
                System.out.println("cookie : " + "nicosid="+cookie.getNicosid()+"; mfa_session="+cookie.getMfa_session());

                request = HttpRequest.newBuilder()
                        .uri(new URI(location))
                        .headers("User-Agent", Function.UserAgent)
                        .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                        .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                        .headers("Cookie", "nicosid="+cookie.getNicosid())
                        .GET()
                        .build();

                send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
                Map<String, List<String>> map1 = send.headers().map();
                map1.forEach((name, value)->{
                    System.out.println("--- " + name + " ---");
                    for (String str : value){
                        System.out.println(str);
                    }
                });
                //System.out.println(send.body());


            }

            // https://account.nicovideo.jp/mfa?site=niconico&continue=https%3A%2F%2Faccount.nicovideo.jp%2Flogin%2Fmfa%2Fcallback%3Fcsrf_token%3D1761751102422_sHRISwU0wCuY3eusmAIlx9hjY9OhFDRW0VE6f_Pscx8%26facebook%3D1%26site%3Dniconico%26sec%3Dheader_pc%26next_url%3D%252Fwatch%252Fsm9%253F%26twitter%3D1
            // https://account.nicovideo.jp/login/mfa/callback?csrf_token=1761751102422_sHRISwU0wCuY3eusmAIlx9hjY9OhFDRW0VE6f_Pscx8&facebook=1&site=niconico&sec=header_pc&next_url=%2Fwatch%2Fsm9%3F&twitter=1&mfa_result=131256034_bJRSlhOubgPKkP8k2WO6wijbtvHjFPmG&site=niconico
            // https://account.nicovideo.jp/login/mfa/callback?csrf_token=1761751102422_sHRISwU0wCuY3eusmAIlx9hjY9OhFDRW0VE6f_Pscx8&facebook=1&site=niconico&sec=header_pc&next_url=%2Fwatch%2Fsm9%3F&twitter=1&mfa_result=131256034_bJRSlhOubgPKkP8k2WO6wijbtvHjFPmG&site=niconico

        } catch (Exception e){
            // e.printStackTrace();
        }

        return null;
    }

}
