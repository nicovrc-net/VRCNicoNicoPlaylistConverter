package net.nicovrc.dev;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import me.friwi.jcefmaven.CefAppBuilder;
import me.friwi.jcefmaven.MavenCefAppHandlerAdapter;
import me.friwi.jcefmaven.impl.progress.ConsoleProgressHandler;
import net.nicovrc.dev.json.*;
import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.CefSettings;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefFrame;
import org.cef.callback.CefCookieVisitor;
import org.cef.handler.CefLoadHandlerAdapter;
import org.cef.misc.BoolRef;
import org.cef.network.CefCookie;
import org.cef.network.CefCookieManager;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends Application {

    private static final Stage main_stage = new Stage();
    private static final Stage sub_stage = new Stage();

    private static final Pattern matcher_version = Pattern.compile("<id>tag:github\\.com,2008:Repository/(\\d+)/(.+)</id>");

    public static void main(String[] args) {

        try {
            launch();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void start(Stage stage) throws Exception {

        String lang = "";

        System.out.println("VRCNicoNicoPlayerlistConverter Ver " + Function.Version);

        File file = new File("./lang/default.txt");
        if (!file.exists()){
            file = new File("./lang/ja.txt");
            if (file.exists()){
                lang = "ja";
            } else {
                try (HttpClient client = HttpClient.newBuilder()
                        .version(HttpClient.Version.HTTP_2)
                        .followRedirects(HttpClient.Redirect.ALWAYS)
                        .connectTimeout(Duration.ofSeconds(5))
                        .build()) {

                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(new URI("https://raw.githubusercontent.com/nicovrc-net/VRCNicoNicoPlaylistConverter/refs/heads/master/lang/ja.txt"))
                            .headers("User-Agent", Function.UserAgent)
                            .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                            .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                            .GET()
                            .build();
                    HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
                    //System.out.println(send.body());
                    if (!new File("./lang").exists()){
                        new File("./lang").mkdir();
                    }
                    Function.FileWrite_text("./lang/ja.txt", send.body());
                    Function.FileWrite_text("./lang/default.txt", send.body());
                    lang = "ja";
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        } else {
            lang = "default";
        }

        Function.langData = Function.getTextList(lang);

        // フォント
        //System.out.println("[Info] Checking Fonts File");
        file = new File("./fonts/");
        if (!file.exists()){
            file.mkdir();
            try (HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .connectTimeout(Duration.ofSeconds(5))
                    .build()) {

                if (Function.isWindows){
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(new URI("https://fonts.google.com/download/list?family=Noto%20Sans%20JP%2CNoto%20Sans%20KR%2CNoto%20Sans%20SC%2CNoto%20Sans%20TC"))
                            .headers("User-Agent", Function.UserAgent)
                            .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                            .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                            .GET()
                            .build();

                    HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
                    if (send.statusCode() > 200 && send.statusCode() <= 399){
                        JsonElement json = Function.gson.fromJson(send.body(), JsonElement.class);
                        JsonArray array = json.getAsJsonObject().get("manifest").getAsJsonObject().get("fileRefs").getAsJsonArray();

                        for (JsonElement element : array.asList()) {
                            String filename = element.getAsJsonObject().get("filename").getAsString();

                            if  (filename.split("/")[filename.split("/").length - 1].endsWith("-Medium.ttf") && !new File("./fonts/"+filename.split("/")[filename.split("/").length - 1]).exists()){
                                request = HttpRequest.newBuilder()
                                        .uri(new URI(element.getAsJsonObject().get("url").getAsString()))
                                        .headers("User-Agent", Function.UserAgent)
                                        .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                                        .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                                        .GET()
                                        .build();

                                HttpResponse<byte[]> send2 = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
                                if (send2.statusCode() > 200 && send2.statusCode() <= 399){
                                    Function.FileWrite_binary("./fonts/"+filename.split("/")[filename.split("/").length - 1], send2.body());
                                }
                            }
                        }
                    }
                } else {
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(new URI("https://github.com/notofonts/noto-cjk/raw/main/Sans/Variable/OTC/NotoSansCJK-VF.ttf.ttc"))
                            .headers("User-Agent", Function.UserAgent)
                            .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                            .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                            .GET()
                            .build();

                    HttpResponse<byte[]> send = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
                    //System.out.println(send.statusCode());
                    if (send.statusCode() >= 200 && send.statusCode() <= 399){
                        FileOutputStream stream = new FileOutputStream("./fonts/NotoSansCJK-Regular.ttc");
                        stream.write(send.body());
                        stream.close();
                        stream = null;
                    }
                }

            } catch (Exception e){
                e.printStackTrace();
            }
        }

        //System.out.println("[Info] Setting Fonts File");
        String fontLang = Function.getFontLang();
        Font tempFont1 = Font.getDefault();
        try {
            if (new File("./fonts/NotoSansCJK-Regular.ttc").exists()){
                tempFont1 = Font.loadFont(new FileInputStream("./fonts/NotoSansCJK-Regular.ttc"), Font.getDefault().getSize());
            } else if (new File("./fonts/NotoSansCJK-Regular.ttf").exists()){
                tempFont1 = Font.loadFont(new FileInputStream("./fonts/NotoSansCJK-Regular.ttf"), Font.getDefault().getSize());
            } else if (new File("./fonts/NotoSans"+fontLang+"-Medium.ttf").exists()){
                tempFont1 = Font.loadFont(new FileInputStream("./fonts/NotoSans"+fontLang+"-Medium.ttf"), Font.getDefault().getSize());
            }
        } catch (Exception e){
            //e.printStackTrace();
        }

        Font tempFont2 = new Font(24);
        try {
            if (new File("./fonts/NotoSansCJK-Regular.ttc").exists()){
                tempFont2 = Font.loadFont(new FileInputStream("./fonts/NotoSansCJK-Regular.ttc"), 24);
            } else if (new File("./fonts/NotoSansCJK-Regular.ttf").exists()){
                tempFont2 = Font.loadFont(new FileInputStream("./fonts/NotoSansCJK-Regular.ttf"), 24);
            } else if (new File("./fonts/NotoSans"+fontLang+"-Medium.ttf").exists()){
                tempFont2 = Font.loadFont(new FileInputStream("./fonts/NotoSans"+fontLang+"-Medium.ttf"), 24);
            }
        } catch (Exception e){
            //e.printStackTrace();
        }

        Font tempFont3 = new Font(16);
        try {
            if (new File("./fonts/NotoSansCJK-Regular.ttc").exists()){
                tempFont3 = Font.loadFont(new FileInputStream("./fonts/NotoSansCJK-Regular.ttc"), 16);
            } else if (new File("./fonts/NotoSansCJK-Regular.ttf").exists()){
                tempFont3 = Font.loadFont(new FileInputStream("./fonts/NotoSansCJK-Regular.ttf"), 16);
            } else if (new File("./fonts/NotoSans"+fontLang+"-Medium.ttf").exists()){
                tempFont3 = Font.loadFont(new FileInputStream("./fonts/NotoSans"+fontLang+"-Medium.ttf"), 16);
            }
        } catch (Exception e){
            //e.printStackTrace();
        }
        final Font DefaultFont = tempFont1;
        final Font TitleFont = tempFont2;
        final Font Size16Font = tempFont3;

        // Cookie情報
        file = new File("./tools/cookie.txt");
        System.out.println("[Info] "+Function.langData.get("niconico_login_check"));


        if (file.exists()){
            try {
                // 復号化できなかったら削除する
                String s = Function.DecrypterText(Function.FileRead_text("./tools/cookie.txt"));

                //System.out.println(s);
                if (!s.startsWith("nicosid=")){
                    file.delete();
                }
            } catch (Exception e){
                e.printStackTrace();
                file.delete();
            }
        }

        HashMap<String, String> cookieList = new HashMap<>();
        JFrame frame_1 = new JFrame("ニコニコ動画 ログイン画面");
        if (!file.exists()){
            System.out.println("[Info] "+Function.langData.get("niconico_login_check_fail"));
            SwingUtilities.invokeLater(() -> {
                try {
                    frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    CefAppBuilder builder = new CefAppBuilder();

                    builder.setInstallDir(new File("./tools/jcef")); //Default
                    builder.setProgressHandler(new ConsoleProgressHandler()); //Default
                    builder.addJcefArgs("--disable-gpu"); //Just an example
                    builder.getCefSettings().windowless_rendering_enabled = false; //Default - select OSR mode

                    // Build a CefApp instance using the configuration above
                    CefApp cefApp = builder.build();
                    CefClient client = cefApp.createClient();
                    client.addLoadHandler(new CefLoadHandlerAdapter() {

                        @Override
                        public void onLoadEnd(CefBrowser browser, CefFrame frame, int httpStatusCode) {
                            if (browser.getURL().equals(Function.LoginAfterUrl)){
                                CefCookieManager manager = CefCookieManager.getGlobalManager();
                                manager.visitUrlCookies(browser.getURL(), true, (cookie, count, total, deleteCookie) -> {
                                    cookieList.put(cookie.name, cookie.value);
                                    //System.out.println("Cookie: " + cookie.name + "=" + cookie.value);
                                    if (cookieList.get("nicosid") != null && cookieList.get("user_session") != null){
                                        cefApp.dispose();
                                        frame_1.setVisible(false);
                                    }
                                    return true;
                                });
                            }
                        }
                    });
                    CefBrowser browser = client.createBrowser(Function.NicoNicoLoginUrl, false, false);
                    Component browserUI = browser.getUIComponent();
                    frame_1.add(browserUI, BorderLayout.CENTER);
                    frame_1.setSize(800, 800);
                    frame_1.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } else {
            System.out.println("[Info] "+Function.langData.get("niconico_login_check_found"));
            cookieList.put("nicosid", "dummy");
            cookieList.put("user_session", "dummy");
        }

        while (cookieList.get("nicosid") == null || cookieList.get("user_session") == null){
            continue;
        }

        if (!cookieList.get("nicosid").equals("dummy")){
            Function.FileWrite_text("./tools/cookie.txt", Function.EncrypterText("nicosid="+cookieList.get("nicosid")+"; user_session="+cookieList.get("user_session")));
            System.out.println("[Info] "+Function.langData.get("niconico_login_success"));
            frame_1.dispose();
        }

        file = new File("./input.txt");
        if (!file.exists()){
            // アップデート確認
            System.out.println("[Info] "+Function.langData.get("update_check"));
            final boolean isWindowsBatchStart = new File("./tools").exists() && new File("./tools/jdk-21.0.2").exists();
            String new_version = Function.Version;
            try (HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .connectTimeout(Duration.ofSeconds(5))
                    .build()) {

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI("https://github.com/nicovrc-net/VRCNicoNicoPlaylistConverter/releases.atom"))
                        .headers("User-Agent", Function.UserAgent)
                        .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                        .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                        .GET()
                        .build();
                HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
                //System.out.println(send.body());
                Matcher matcher = matcher_version.matcher(send.body());
                if (matcher.find()){
                    new_version = matcher.group(2);
                }
            } catch (Exception e){
                e.printStackTrace();
                return;
            }

            if (Function.Version.equals(new_version)){
                System.out.println("[Info] "+Function.langData.get("update_check_fail"));
            } else {
                System.out.println("[Info] "+Function.langData.get("update_check_found"));

                if (isWindowsBatchStart || Function.isWindows) {
                    File c_file = new File("./");
                    final String CurrentFolderPass = c_file.getCanonicalPath().replaceAll("\\\\", "/");

                    File update_file = new File("./tools/update.bat");
                    if (update_file.exists()) {
                        update_file.delete();
                    }
                    update_file = new File("./tools/update.ps1");
                    if (update_file.exists()) {
                        update_file.delete();
                    }

                    Function.FileWrite_text("./tools/update.bat", "@echo off\npowershell -NoProfile -ExecutionPolicy Unrestricted ./tools/update.ps1\nexit");
                    String str = """
                        
                        $check = "True";
                        while ($i -eq "True") {
                        
                          try {
                            $fileStream = [System.IO.File]::Open(".\\tools\\jdk-21\\bin\\java.exe", 'Open', 'ReadWrite', 'None')
                            $check = "False";
                          } catch {
                            $check = "True";
                          } finally {
                            if ($null -ne $fileStream) {
                              $fileStream.Close()
                            }
                          }
                        
                        }
                        
                        Invoke-WebRequest -Uri https://github.com/nicovrc-net/VRCNicoNicoPlaylistConverter/releases/download/#ver#/VRCNicoNicoPlaylistConverter.zip -OutFile ./tools/VRCNicoNicoPlaylistConverter.zip
                        Expand-Archive -Path ./tools/VRCNicoNicoPlaylistConverter.zip -DestinationPath ./tools/
                        Remove-Item ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
                        Remove-Item ./start.bat
                        Remove-Item ./start.ps1
                        Remove-Item ./readme*.txt -Force
                        Remove-Item ./lang -Recurse -Force
                        Move-Item -Path ./tools/key.txt ./key.txt
                        Move-Item -Path ./tools/cookie.txt ./cookie.txt
                        Move-Item -Path ./tools/VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar -Destination ./
                        Move-Item -Path ./tools/start.bat -Destination ./
                        Move-Item -Path ./tools/start.ps1 -Destination ./
                        New-Item -ItemType Directory -Path ./lang
                        Move-Item -Path ./tools/lang/* -Destination ./lang
                        Move-Item -Path ./tools/readme*.txt -Destination ./
                        
                        Remove-Item ./tools -Recurse -Force
                        New-Item -ItemType Directory -Path ./tools/
                        Move-Item -Path ./key.txt ./tools/key.txt
                        Move-Item -Path ./cookie.txt ./tools/cookie.txt
                        
                        exit
                        
                        # SIG # Begin signature block
                        # MIIIpQYJKoZIhvcNAQcCoIIIljCCCJICAQExCzAJBgUrDgMCGgUAMGkGCisGAQQB
                        # gjcCAQSgWzBZMDQGCisGAQQBgjcCAR4wJgIDAQAABBAfzDtgWUsITrck0sYpfvNR
                        # AgEAAgEAAgEAAgEAAgEAMCEwCQYFKw4DAhoFAAQUMCDYTd3PEqF8vNhZ8AcoovFe
                        # ZSqgggUuMIIFKjCCAxKgAwIBAgIQFu7PAOinJJxLTeEeaGSG+TANBgkqhkiG9w0B
                        # AQsFADAsMSowKAYDVQQDDCFuaWNvdnJjLm5ldCBPVT1TZWxmLXNpZ25lZCBSb290
                        # Q0EwIBcNMjYwNDIwMTIxNzA0WhgPMjA5ODEyMzExNTAwMDBaMCwxKjAoBgNVBAMM
                        # IW5pY292cmMubmV0IE9VPVNlbGYtc2lnbmVkIFJvb3RDQTCCAiIwDQYJKoZIhvcN
                        # AQEBBQADggIPADCCAgoCggIBALq2vwv7CZYo6E4uRw+dE1maw/ubYxBWjMD67SZU
                        # b6dHv4wz2h3sNwUoCBi7pemUJ/pGfEfr8Wr/NG3uJwjw9HOJYm12Wu3hjNYVHFwq
                        # SiEkkYXpfAlSEOPvwuGsINLLkf5TtWGZSr/4NkvbvAVVqWsli1EOYTceOaYmXXQ+
                        # VXfEaNYhpOX/KmAugCDAfEuAFWZBu0jAoXIC+DvvTn1qiiSCvD4jCbbUB5I1mCIb
                        # l4B4mHaMpt6GrZE8G5eif5vZXa0ikt+jWuwGCyNApQhfVuDGSZtHpq78PSgbms6D
                        # LhOhXzwVsgno6RzGpVDeyyBzqYFURup1btajOCH7T+3SQXS6PCEdyRsNnBmRP/WS
                        # uhD124ElhaHn7k9HxPiaM+Om4BYQJwMvOAcRkNDsBTvLKm7gM53dd+VaMYxLfZvc
                        # o1cK7zqGMGCqd8V1nOstkUGYSZViaUdvP9yCkO8IqZpJv63iCHlaTTw1RT/xXosx
                        # RrQCKUX+D5ZKUNnT52vNs6B5W7Ijyuwxdzrfu6g3+d2vVLwBgLlepLR9NeqZgzKF
                        # g64QzkJ5OQkJsExBEeKeqrVuaL3jQvrI7HRhy1XAMOJlq1gefdC+bQTLEENNrATb
                        # 02ZhMHvmYFxj6Ce9qXDHdLZxGuVqrYtCUz6f2MFR6Nd/ifTnCDg6Cd5bn+kgwyFz
                        # kOphAgMBAAGjRjBEMA4GA1UdDwEB/wQEAwIHgDATBgNVHSUEDDAKBggrBgEFBQcD
                        # AzAdBgNVHQ4EFgQUCQFMhKmdgTdjvy01UeIx8bj4dnQwDQYJKoZIhvcNAQELBQAD
                        # ggIBAFhcx3r2HS99DtbsnYuVsMMt3BPE9h83dY8o0gta20T7BVgukRMoVCnKVWxT
                        # cKKn6umGLFptCyQgf1p5MHh+hCOUAK/fu2v6s3WNu5/HW0P/EBGmsptl+ROT8hEc
                        # U7p2Q9kjMcxP6w7afHm78f8PZe9IXxOf9xL7vUzqTopgOjFArUE97o4LTNTuJP4G
                        # 1cMJHTKy6ZFRgCpupl2ktEe6/m9HSFz61+3xkotnwZozZ1yPfz/3Knd5QqiNtE+Z
                        # KdyPocIjxjo6opi9uex6qMPMnXAOLms/w2rlC44bbUF+7NxIBinIS0m1nNp00z0c
                        # qKVcnlkeaJnfyeQsocJG+/i+EXn7cIEO8+YZJH5bsv+XexiTP8SS4QlainVwb963
                        # oMCZRplbrMfbWufk9cpUsW8blqJIN4+f9T5hTf8+RaqUXKDmGMPlYpEHTy1mNIke
                        # B27qph5Cg2R5A/EZqVJyI00Qj8/WrfH/5wJCLB9C0sKovq99iFb/6I7Mo0GNs9rt
                        # ZoNUZDk5aZUQLQVGRq8kXhS3O7nfF+8FsfjiAHHVf33ioG/3wnDQBZICwn273Tui
                        # zbZ/fyXvu7mTKsv6SsmTjGoO0ql02ufChDZgD1j8NOGmm0C5l087o4gbUW9Z8hlM
                        # ctVq3PhmU9UfW/Efepk3tTRRwLde7Brs3PCzw8v1iqWsq9SoMYIC4TCCAt0CAQEw
                        # QDAsMSowKAYDVQQDDCFuaWNvdnJjLm5ldCBPVT1TZWxmLXNpZ25lZCBSb290Q0EC
                        # EBbuzwDopyScS03hHmhkhvkwCQYFKw4DAhoFAKB4MBgGCisGAQQBgjcCAQwxCjAI
                        # oAKAAKECgAAwGQYJKoZIhvcNAQkDMQwGCisGAQQBgjcCAQQwHAYKKwYBBAGCNwIB
                        # CzEOMAwGCisGAQQBgjcCARUwIwYJKoZIhvcNAQkEMRYEFKxYg+9v49XCib2sE2J2
                        # SwtQq6VVMA0GCSqGSIb3DQEBAQUABIICAGv7uMalY1vsVDqu2WhzvYtSOpw2sEuV
                        # sG3x7Myl4kTKMNXu5fw7u2vcBedEXiqjy0BM9RAxCpkyvQQQusXdbk8qtclBqdYQ
                        # cGl4cRKkiPFQpsOGNpIQj4w7EMGa11kpjZLOuJiUH3EsNGf3hA/NtW7gZswSX3v3
                        # 0+3Hi/NjMl+YBEwTvIMGd0FH4qNNo5QdHyv0HKY4fTrQaJblBsbAyl66wsylgbXY
                        # YTkGhHZX7B73BZ/lpOLd2FOcBhOh9YtZ755vGEXBIoP6iSUY4J9DAmOgiFEcMmHL
                        # HPFCtU3Yj2/vTE5qQKDdVkXYou9t+9QZDiZe1d2+gsl8D4HvBVpFvx9uUY6ESuxP
                        # 1qoM+s9+ia/0CS5Hz8soXCTU7Ljy8OwK3Wv7tYyRqvWB8o1loMOmiL3b01YZh/9K
                        # rwqo3mnXysonLXH/2e0l5AqTz04NHLiC0DdCWHiMhEXenZa8LNcso4AygRqGwZa4
                        # VL0imGb/c+1GhZpIm+xz5dT4/1u4+bG4q6FuZ+o/vl+Q2P+KwEqXnY8SwLhVKmWj
                        # q7KYlWXcAhHMvoAJzrExULqdKmoCKLMSxLTX97vM52gIWLm7fnvdCPVs4ahN2bMF
                        # vLDqUpdQG1fYrCkb3vhJ3OcoCCTNKWXX9139R02nygZ2jMjFeQ6qsn1+3ewtx7Dd
                        # kwteGAWwRBdO
                        # SIG # End signature block
                        """;
                    Function.FileWrite_text("./tools/update.ps1", str.replaceAll("#ver#", new_version));
                }

                sub_stage.setResizable(false);
                sub_stage.setMaximized(false);
                sub_stage.setFullScreen(false);
                sub_stage.setTitle(Function.langData.get("update_notify"));
                sub_stage.setWidth(400);
                sub_stage.setHeight(200);

                AnchorPane root = new AnchorPane();
                Scene scene = new Scene(root);

                Button button = new Button(Function.langData.get("update_close"));
                button.setLayoutX(300);
                button.setLayoutY(10);
                button.setFont(DefaultFont);
                button.setOnAction(e -> {
                    sub_stage.close();
                    File update_file = new File("./tools/update.bat");
                    if (update_file.exists()) {
                        update_file.delete();
                    }
                    update_file = new File("./tools/update.ps1");
                    if (update_file.exists()) {
                        update_file.delete();
                    }
                });
                root.getChildren().add(button);

                Label update_label1 = new Label(Function.langData.get("update_notify"));
                update_label1.setLayoutX(5);
                update_label1.setLayoutY(5);
                update_label1.setFont(Size16Font);
                root.getChildren().add(update_label1);

                Label update_label2 = new Label(Function.langData.get("update_notify_update_found"));
                update_label2.setLayoutX(10);
                update_label2.setLayoutY(40);
                update_label2.setFont(DefaultFont);
                root.getChildren().add(update_label2);

                Label update_label3 = new Label(Function.langData.get("update_notify_now_version").replaceAll("#ver#", Function.Version));
                update_label3.setLayoutX(10);
                update_label3.setLayoutY(80);
                update_label3.setFont(DefaultFont);
                root.getChildren().add(update_label3);

                Label update_label4 = new Label(Function.langData.get("update_notify_new_version").replaceAll("#ver#", new_version));
                update_label4.setLayoutX(10);
                update_label4.setLayoutY(100);
                update_label4.setFont(DefaultFont);
                root.getChildren().add(update_label4);

                if (isWindowsBatchStart || Function.isWindows) {
                    Button update_button = new Button(Function.langData.get("update_notify_update"));
                    update_button.setLayoutX(10);
                    update_button.setLayoutY(120);
                    update_button.setFont(DefaultFont);
                    update_button.setOnAction(e -> {
                        try {
                            final Runtime runtime = Runtime.getRuntime();
                            final Process exec0 = runtime.exec(new String[]{"./tools/update.bat"});
                            main_stage.close();
                            runtime.exit(0);
                        } catch (Exception ex){
                            // ex.printStackTrace();
                        }
                        sub_stage.close();
                    });
                    root.getChildren().add(update_button);
                }

                sub_stage.setScene(scene);
                sub_stage.showAndWait();

                File update_file = new File("./tools/update.bat");
                if (update_file.exists()) {
                    update_file.delete();
                }
                update_file = new File("./tools/update.ps1");
                if (update_file.exists()) {
                    update_file.delete();
                }
            }

            // 初期画面
            main_stage.setResizable(false);
            main_stage.setFullScreen(false);
            main_stage.setMaximized(false);
            main_stage.setWidth(450);
            main_stage.setHeight(650);
            main_stage.setTitle("VRCNicoNicoPlayListConverter Ver" + Function.Version);
            final AnchorPane main_root = new AnchorPane();
            final Scene main_scene = new Scene(main_root);

            Label url_input_text = new Label(Function.langData.get("main_mylist").replaceAll("\\\\n", "\n"));
            url_input_text.setLayoutX(5);
            url_input_text.setLayoutY(5);
            url_input_text.setFont(DefaultFont);
            //url_input_text.setFont(new Font(16));
            main_root.getChildren().add(url_input_text);

            TextArea url_input = new TextArea();
            //url_input.setFont(DefaultFont);
            url_input.setLayoutX(5);
            url_input.setLayoutY(65);
            url_input.setPrefSize(400, 300);
            url_input.setWrapText(false);
            url_input.setFont(DefaultFont);
            main_root.getChildren().add(url_input);

            Label output_mode_text = new Label(Function.langData.get("main_output"));
            output_mode_text.setLayoutX(5);
            output_mode_text.setLayoutY(380);
            output_mode_text.setFont(DefaultFont);
            main_root.getChildren().add(output_mode_text);

            ComboBox<String> output_combo = new ComboBox<>();
            ComboBox<String> site_select = new ComboBox<>();

            output_combo.setLayoutX(5);
            output_combo.setLayoutY(400);
            output_combo.getItems().addAll("",
                    "iwaSync ("+Function.langData.get("main_json")+")",
                    "iwaSync ("+Function.langData.get("main_prefab")+")",
                    "KineL式(りら式) v2 ("+Function.langData.get("main_prefab")+")",
                    "KineL式(りら式) v3 ("+Function.langData.get("main_prefab")+")",
                    "YamaPlayer ("+Function.langData.get("main_json")+")",
                    "YamaPlayer (v1,"+Function.langData.get("main_prefab")+")",
                    "YamaPlayer (v2,"+Function.langData.get("main_prefab")+")",
                    "VizVid ("+Function.langData.get("main_json")+")",
                    "あやぷれいやー2 ("+Function.langData.get("main_json")+")",
                    "Sliden",
                    "UnaSlides"
            );
            output_combo.setPrefWidth(300);
            output_combo.setOnAction((event)->{
                if (output_combo.getSelectionModel().getSelectedItem().equals("Sliden")){
                    site_select.getItems().clear();
                    site_select.setDisable(true);
                    url_input_text.setText(Function.langData.get("main_sliden").replaceAll("\\\\n", "\n"));
                } else {
                    site_select.getItems().clear();
                    site_select.getItems().addAll("",
                            "nicovrc.net",
                            "tool.suzumebachi.xyz"
                    );
                    site_select.setDisable(false);
                    url_input_text.setText(Function.langData.get("main_mylist").replaceAll("\\\\n", "\n"));
                }
            });

            output_combo.setCellFactory(list ->new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(empty ? null : item);
                    setFont(DefaultFont);
                }
            });

            if (new File("./fonts/NotoSansCJK-Regular.ttc").exists()){
                output_combo.setStyle("@font-face {\n" +
                        "  font-family: 'noto-cjk';\n" +
                        "  src: url('./fonts/NotoSansCJK-Regular.ttc'),ormat('truetype');\n" +
                        "  font-weight: normal;\n" +
                        "  font-style: normal;\n" +
                        "}\n" +
                        "-fx-font: 16px 'noto-cjk';"
                );
                site_select.setStyle("@font-face {\n" +
                        "  font-family: 'noto-cjk';\n" +
                        "  src: url('./fonts/NotoSansCJK-Regular.ttc'),format('truetype');\n" +
                        "  font-weight: normal;\n" +
                        "  font-style: normal;\n" +
                        "}\n" +
                        "-fx-font-family: 16px 'noto-cjk';"
                );

            } else if (new File("./fonts/NotoSansCJK-Regular.ttf").exists()){
                output_combo.setStyle("@font-face {\n" +
                        "  font-family: 'noto-cjk';\n" +
                        "  src: url('./fonts/NotoSansCJK-Regular.ttf'),format('truetype');\n" +
                        "  font-weight: normal;\n" +
                        "  font-style: normal;\n" +
                        "}\n" +
                        "-fx-font-family: 16px 'noto-cjk';"
                );
                site_select.setStyle("@font-face {\n" +
                        "  font-family: 'noto-cjk';\n" +
                        "  src: url('./fonts/NotoSansCJK-Regular.ttf'),format('truetype');\n" +
                        "  font-weight: normal;\n" +
                        "  font-style: normal;\n" +
                        "}\n" +
                        "-fx-font-family: 16px 'noto-cjk';"
                );
            } else if (new File("./fonts/NotoSans"+fontLang+"-Medium.ttf").exists()){
                output_combo.setStyle("@font-face {\n" +
                        "  font-family: 'noto-cjk';\n" +
                        "  src: url('./fonts/NotoSans"+fontLang+"-Medium.ttf'),format('truetype');\n" +
                        "  font-weight: normal;\n" +
                        "  font-style: normal;\n" +
                        "}\n" +
                        "-fx-font-family: 16px 'noto-cjk';"
                );
                site_select.setStyle("@font-face {\n" +
                        "  font-family: 'noto-cjk';\n" +
                        "  src: url('./fonts/NotoSans"+fontLang+"-Medium.ttf'),format('truetype');\n" +
                        "  font-weight: normal;\n" +
                        "  font-style: normal;\n" +
                        "}\n" +
                        "-fx-font-family: 16px 'noto-cjk';"
                );
            }

            main_root.getChildren().add(output_combo);

            Label site_select_text = new Label(Function.langData.get("main_output_site"));
            site_select_text.setLayoutX(5);
            site_select_text.setLayoutY(440);
            site_select_text.setFont(DefaultFont);
            main_root.getChildren().add(site_select_text);

            site_select.setLayoutX(5);
            site_select.setLayoutY(460);
            site_select.getItems().addAll("",
                    "nicovrc.net",
                    "tool.suzumebachi.xyz"
            );
            site_select.setPrefWidth(300);
            site_select.setCellFactory(list ->new ListCell<>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(empty ? null : item);
                    setFont(DefaultFont);
                }
            });
            main_root.getChildren().add(site_select);

            Label status = new Label(Function.langData.get("main_status_idle"));
            status.setLayoutX(5);
            status.setLayoutY(550);
            //status.setFont(new Font(16));
            status.setFont(DefaultFont);
            main_root.getChildren().add(status);

            Button run_button = new Button(Function.langData.get("main_output_button"));
            run_button.setLayoutX(5);
            run_button.setLayoutY(500);
            run_button.setFont(DefaultFont);
            run_button.setOnAction((event)->{
                Thread.ofVirtual().start(()->{
                    try {
                        Function.Convert(url_input.getText(), output_combo.getSelectionModel().getSelectedItem(), site_select.getSelectionModel().getSelectedItem(), status);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                });
            });
            main_root.getChildren().add(run_button);


            main_stage.setScene(main_scene);
            main_stage.showAndWait();


        } else {

            System.out.println("自動化モード～♪");

            String text = Function.FileRead_text("./input.txt");

            file = new File("./output_site.txt");
            if (!file.exists()){
                System.out.println("エラー: 出力形式が指定されていません！");
                return;
            }

            String outputSite = Function.FileRead_text("./output_site.txt");
            String outputMode = Function.FileRead_text("./output_mode.txt");

            Function.Convert(text, outputSite, outputMode, null);


        }
    }

}