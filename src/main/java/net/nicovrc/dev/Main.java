package net.nicovrc.dev;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.sun.security.auth.module.NTSystem;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import net.nicovrc.dev.data.NicoNicoCookie;
import net.nicovrc.dev.data.NicoNicoPlayList;
import net.nicovrc.dev.data.PlayListData;
import net.nicovrc.dev.json.iwaSync;
import net.nicovrc.dev.json.iwaSync_Tracks;
import net.nicovrc.dev.prefab.Kinel;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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
            // e.printStackTrace();
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
                    try (FileWriter file1 = new FileWriter("./lang/ja.txt");
                         PrintWriter pw = new PrintWriter(new BufferedWriter(file1))){

                        pw.print(send.body());
                    } catch (Exception e){
                        //e.printStackTrace();
                    }
                    try (FileWriter file1 = new FileWriter("./lang/default.txt");
                         PrintWriter pw = new PrintWriter(new BufferedWriter(file1))){

                        pw.print(send.body());
                    } catch (Exception e){
                        //e.printStackTrace();
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        } else {
            lang = "default";
        }

        final HashMap<String, String> langData = Function.getTextList(lang);

        // フォント
        System.out.println("[Info] Checking Fonts File");
        file = new File("./fonts/");
        if (!file.exists()){
            file.mkdir();
            try (HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .connectTimeout(Duration.ofSeconds(5))
                    .build()) {

                if (System.getProperty("os.name").toLowerCase(Locale.ROOT).startsWith("windows")){
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(new URI("https://fonts.google.com/download/list?family=Noto%20Sans%20JP%2CNoto%20Sans%20KR%2CNoto%20Sans%20SC%2CNoto%20Sans%20TC"))
                            .headers("User-Agent", Function.UserAgent)
                            .headers("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                            .headers("Accept-Language", "ja,en;q=0.7,en-US;q=0.3")
                            .GET()
                            .build();

                    HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
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
                            FileOutputStream stream = new FileOutputStream("./fonts/"+filename.split("/")[filename.split("/").length - 1]);
                            stream.write(send2.body());
                            stream.close();
                            stream = null;
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
                    FileOutputStream stream = new FileOutputStream("./fonts/NotoSansCJK-Regular.ttc");
                    stream.write(send.body());
                    stream.close();
                    stream = null;
                }

            } catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("[Info] Setting Fonts File");
        String fontLang = "JP";
        try {
            if (langData.get("lang_name").startsWith("한국어")){
                fontLang = "KR";
            } else if (langData.get("lang_name").startsWith("简体中文")){
                fontLang = "SC";
            } else if (langData.get("lang_name").startsWith("繁體中文")){
                fontLang = "TC";
            }
        } catch (Exception e){
            //e.printStackTrace();
        }

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
        System.out.println("[Info] "+langData.get("niconico_login_check"));


        if (file.exists()){
            try {
                // 復号化できなかったら削除する

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

                String s = Function.DecrypterText(Text.substring(0, Text.length() - 1));

                //System.out.println(s);
                if (!s.startsWith("nicosid=")){
                    file.delete();
                }
            } catch (Exception e){
                e.printStackTrace();
                file.delete();
            }
        }

        if (!file.exists()){
            System.out.println("[Info] "+langData.get("niconico_login_check_fail"));

            sub_stage.setResizable(false);
            sub_stage.setMaximized(false);
            sub_stage.setFullScreen(false);
            sub_stage.setTitle("ログイン");
            sub_stage.setWidth(400);
            sub_stage.setHeight(300);
            final AnchorPane root = new AnchorPane();

            Label login_label1 = new Label(langData.get("niconico_login_risk"));
            login_label1.setLayoutX(5);
            login_label1.setLayoutY(5);
            login_label1.setFont(Size16Font);
            root.getChildren().add(login_label1);

            Label login_label2 = new Label(langData.get("niconico_mail_tel"));
            login_label2.setLayoutX(10);
            login_label2.setLayoutY(30);
            login_label2.setFont(DefaultFont);
            root.getChildren().add(login_label2);

            TextField mail_field = new TextField();
            mail_field.setLayoutX(10);
            mail_field.setLayoutY(45);
            mail_field.setEditable(true);
            mail_field.setFocusTraversable(false);
            mail_field.setPrefWidth(350);
            mail_field.setFont(DefaultFont);
            root.getChildren().add(mail_field);

            Label login_label3 = new Label(langData.get("niconico_password"));
            login_label3.setLayoutX(10);
            login_label3.setLayoutY(70);
            login_label3.setFont(DefaultFont);
            root.getChildren().add(login_label3);

            TextField password_field = new TextField();
            password_field.setLayoutX(10);
            password_field.setLayoutY(85);
            password_field.setEditable(true);
            password_field.setFocusTraversable(false);
            password_field.setPrefWidth(350);
            password_field.setFont(DefaultFont);
            root.getChildren().add(password_field);

            Label login_label4 = new Label(langData.get("niconico_login_fail"));
            login_label4.setLayoutX(10);
            login_label4.setLayoutY(150);
            login_label4.setFont(DefaultFont);

            Label login_label5 = new Label(langData.get("niconico_2fa_code"));
            login_label5.setLayoutX(10);
            login_label5.setLayoutY(170);
            login_label5.setDisable(false);
            login_label5.setFont(DefaultFont);

            TextField mfw_field = new TextField();
            mfw_field.setLayoutX(10);
            mfw_field.setLayoutY(190);
            mfw_field.setEditable(true);
            mfw_field.setFocusTraversable(false);
            mfw_field.setPrefWidth(350);
            mfw_field.setFont(DefaultFont);

            NicoNicoCookie[] cookie = new NicoNicoCookie[]{null};
            Button mfw_button = new Button(langData.get("niconico_2fa"));
            mfw_button.setLayoutX(10);
            mfw_button.setLayoutY(230);
            mfw_button.setFont(DefaultFont);
            mfw_button.setOnAction(e -> {
                Thread.ofVirtual().start(()->{
                    try {
                        cookie[0] = Function.NicoNicoLogin(cookie[0], mfw_field.getText());
                        if (cookie[0].isLogin()){
                            Platform.runLater(sub_stage::close);
                        }
                    } catch (Exception ex){
                        ex.printStackTrace();
                    }
                });
            });

            Button button = new Button(langData.get("niconico_login"));
            button.setLayoutX(10);
            button.setLayoutY(120);
            button.setFont(DefaultFont);
            button.setOnAction(e -> {
                Thread.ofVirtual().start(()->{
                    cookie[0] = Function.NicoNicoLogin(mail_field.getText(), password_field.getText());

                    if (!cookie[0].isLogin() && (cookie[0].getMfw_url() == null || cookie[0].getMfw_url().isEmpty())){
                        Platform.runLater(()->{
                            root.getChildren().remove(login_label4);
                            root.getChildren().add(login_label4);
                        });
                        return;
                    }

                    if (!cookie[0].isLogin() && !cookie[0].getMfw_url().isEmpty()){

                        Platform.runLater(()->{
                            root.getChildren().remove(login_label5);
                            root.getChildren().add(login_label5);
                            root.getChildren().remove(mfw_field);
                            root.getChildren().add(mfw_field);
                            root.getChildren().remove(mfw_button);
                            root.getChildren().add(mfw_button);
                        });
                    }
                });
            });
            root.getChildren().add(button);

            sub_stage.setScene(new Scene(root));
            sub_stage.showAndWait();

            if (cookie[0].isLogin()){
                try (FileWriter file1 = new FileWriter("./tools/cookie.txt");
                     PrintWriter pw = new PrintWriter(new BufferedWriter(file1))){

                    pw.print(Function.EncrypterText("nicosid="+cookie[0].getNicosid()+"; user_session="+cookie[0].getUser_session()));
                } catch (Exception e){
                    e.printStackTrace();
                    return;
                }
                System.out.println("[Info] "+langData.get("niconico_login_success"));
            }
        } else {
            System.out.println("[Info] "+langData.get("niconico_login_check_found"));
        }

        if (!file.exists()){
            return;
        }

        // アップデート確認
        System.out.println("[Info] "+langData.get("update_check"));
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
            System.out.println("[Info] "+langData.get("update_check_fail"));
        } else {
            System.out.println("[Info] "+langData.get("update_check_found"));
            NTSystem ntSystem = new NTSystem();

            if (isWindowsBatchStart || !ntSystem.getName().isEmpty()) {
                File c_file = new File("./");
                final String CurrentFolderPass = c_file.getCanonicalPath().replaceAll("\\\\", "/");

                File update_file = new File("./tools/update1.bat");
                if (update_file.exists()) {
                    update_file.delete();
                }
                update_file = new File("./tools/update2.bat");
                if (update_file.exists()) {
                    update_file.delete();
                }

                FileWriter file1 = new FileWriter("./tools/update1.bat");
                PrintWriter pw = new PrintWriter(new BufferedWriter(file1));
                pw.print("start ./tools/update2.bat".replaceAll("\\./", CurrentFolderPass + "/"));
                pw.close();
                file1.close();
                pw = null;
                file1 = null;

                file1 = new FileWriter("./tools/update2.bat");
                pw = new PrintWriter(new BufferedWriter(file1));
                String str = """
                        curl https://github.com/nicovrc-net/VRCNicoNicoPlaylistConverter/releases/download/#ver#/VRCNicoNicoPlaylistConverter.zip -L --output ./tools/VRCNicoNicoPlaylistConverter.zip
                        tar -xf ./tools/VRCNicoNicoPlaylistConverter.zip -C ./tools\\
                        del ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
                        del ./start.bat
                        move ./tools\\VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar ./
                        move ./tools\\start.bat ./
                        exit
                        """;
                pw.print(str.replaceAll("#ver#", new_version).replaceAll("\\./", CurrentFolderPass.replaceAll("/", "\\\\\\\\") + "\\\\"));
                pw.close();
                file1.close();
                pw = null;
                file1 = null;
            }

            sub_stage.setResizable(false);
            sub_stage.setMaximized(false);
            sub_stage.setFullScreen(false);
            sub_stage.setTitle(langData.get("update_notify"));
            sub_stage.setWidth(400);
            sub_stage.setHeight(200);

            AnchorPane root = new AnchorPane();
            Scene scene = new Scene(root);

            Button button = new Button(langData.get("update_close"));
            button.setLayoutX(300);
            button.setLayoutY(10);
            button.setFont(DefaultFont);
            button.setOnAction(e -> {
                sub_stage.close();
            });
            root.getChildren().add(button);

            Label update_label1 = new Label(langData.get("update_notify"));
            update_label1.setLayoutX(5);
            update_label1.setLayoutY(5);
            update_label1.setFont(Size16Font);
            root.getChildren().add(update_label1);

            Label update_label2 = new Label(langData.get("update_notify_update_found"));
            update_label2.setLayoutX(10);
            update_label2.setLayoutY(40);
            update_label2.setFont(DefaultFont);
            root.getChildren().add(update_label2);

            Label update_label3 = new Label(langData.get("update_notify_now_version").replaceAll("#ver#", Function.Version));
            update_label3.setLayoutX(10);
            update_label3.setLayoutY(80);
            update_label3.setFont(DefaultFont);
            root.getChildren().add(update_label3);

            Label update_label4 = new Label(langData.get("update_notify_new_version").replaceAll("#ver#", new_version));
            update_label4.setLayoutX(10);
            update_label4.setLayoutY(100);
            update_label4.setFont(DefaultFont);
            root.getChildren().add(update_label4);

            if (isWindowsBatchStart || !ntSystem.getName().isEmpty()) {
                Button update_button = new Button(langData.get("update_notify_update"));
                update_button.setLayoutX(10);
                update_button.setLayoutY(120);
                update_button.setFont(DefaultFont);
                update_button.setOnAction(e -> {
                    try {
                        final Runtime runtime = Runtime.getRuntime();
                        final Process exec0 = runtime.exec(new String[]{"./tools/update1.bat"});
                        Thread.ofVirtual().start(() -> {
                            try {
                                Thread.sleep(5000L);
                            } catch (Exception ex) {
                                //ex.printStackTrace();
                            }

                            if (exec0.isAlive()) {
                                exec0.destroy();
                            }
                        });
                        exec0.waitFor();
                    } catch (Exception ex){
                        // ex.printStackTrace();
                    }
                    sub_stage.close();
                });
                root.getChildren().add(update_button);
            }

            sub_stage.setScene(scene);
            sub_stage.showAndWait();
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

        Label url_input_text = new Label(langData.get("main_mylist").replaceAll("\\\\n", "\n"));
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

        Label output_mode_text = new Label(langData.get("main_output"));
        output_mode_text.setLayoutX(5);
        output_mode_text.setLayoutY(380);
        output_mode_text.setFont(DefaultFont);
        main_root.getChildren().add(output_mode_text);

        ComboBox<String> output_combo = new ComboBox<>();
        output_combo.setLayoutX(5);
        output_combo.setLayoutY(400);
        output_combo.getItems().addAll("",
                "iwaSync ("+langData.get("main_json")+")",
                "iwaSync ("+langData.get("main_prefab")+")",
                "KineL式(りら式) ("+langData.get("main_prefab")+")"//,
        //        "YamaPlayer ("+langData.get("main_json")+")",
        //        "VizVid ("+langData.get("main_json")+")"
        );
        output_combo.setPrefWidth(300);
        main_root.getChildren().add(output_combo);

        Label site_select_text = new Label(langData.get("main_output_site"));
        site_select_text.setLayoutX(5);
        site_select_text.setLayoutY(440);
        site_select_text.setFont(DefaultFont);
        main_root.getChildren().add(site_select_text);

        ComboBox<String> site_select = new ComboBox<>();
        site_select.setLayoutX(5);
        site_select.setLayoutY(460);
        site_select.getItems().addAll("",
                "nicovrc.net",
                "tool.suzumebachi.xyz"
        );
        site_select.setPrefWidth(300);
        main_root.getChildren().add(site_select);

        Label status = new Label(langData.get("main_status_idle"));
        status.setLayoutX(5);
        status.setLayoutY(550);
        //status.setFont(new Font(16));
        status.setFont(DefaultFont);
        main_root.getChildren().add(status);

        Button run_button = new Button(langData.get("main_output_button"));
        run_button.setLayoutX(5);
        run_button.setLayoutY(500);
        run_button.setFont(DefaultFont);
        run_button.setOnAction((event)->{
            Thread.ofVirtual().start(()->{
                String Text = null;
                String cookieText = null;
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("./tools/cookie.txt")), StandardCharsets.UTF_8))){
                    String str;
                    StringBuilder sb = new StringBuilder();
                    while ((str = reader.readLine()) != null) {
                        sb.append(str).append("\n");
                    }
                    Text = sb.toString();
                    cookieText = Function.DecrypterText(Text.substring(0, Text.length() - 1));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                String text = url_input.getText();
                String[] split = text.split("\n");
                if (split.length == 0 || text.isEmpty()){
                    Platform.runLater(()->status.setText(langData.get("main_status_empty_error")));
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
                    } else if (Function.mylist_url.matcher(url).find()) {
                        playListData.setTitle("プレイリスト");
                        playListData.setVideoURL(url);
                        list.add(playListData);
                    }
                }

                // 動画情報取得
                List<PlayListData> temp = new ArrayList<>();
                String playlistTitle = null;
                for (PlayListData data : list) {
                    //System.out.println(data.getTitle() + " / " + data.getVideoURL());
                    if (data.getTitle().equals("動画")){
                        PlayListData tempData = new PlayListData();
                        tempData.setTitle(Function.getVideoTitle(data.getVideoURL(), cookieText));
                        if (site_select.getSelectionModel().getSelectedItem().equals("nicovrc.net")){
                            tempData.setVideoURL("https://nicovrc.net/?url="+data.getVideoURL());
                        } else if (site_select.getSelectionModel().getSelectedItem().equals("tool.suzumebachi.xyz")) {
                            tempData.setVideoURL("https://testniconicomment.suzumebachi.xyz/nicovideo/"+data.getVideoURL().split("/")[data.getVideoURL().split("/").length - 1]);
                        }
                        temp.add(tempData);
                        if (list.size() == 1){
                            playlistTitle = tempData.getTitle();
                        }
                    } else {
                        Platform.runLater(()->status.setText(langData.get("main_status_get_mylist")));
                        NicoNicoPlayList playList = Function.getPlayList(data.getVideoURL(), cookieText);
                        if (list.size() == 1){
                            playlistTitle = playList.getPlaylistTitle();
                        }

                        int i = 0;
                        for (PlayListData d : playList.getPlaylistData()) {
                            final String finalI = ""+i;
                            Platform.runLater(()->status.setText(langData.get("main_status_get_mylist_get_list").replaceAll("#now#", finalI).replaceAll("#max#", ""+playList.getPlaylistData().size())));
                            if (site_select.getSelectionModel().getSelectedItem().equals("nicovrc.net")){
                                d.setVideoURL("https://nicovrc.net/?url="+d.getVideoURL());
                            } else if (site_select.getSelectionModel().getSelectedItem().equals("tool.suzumebachi.xyz")) {
                                d.setVideoURL("https://testniconicomment.suzumebachi.xyz/nicovideo/"+d.getVideoURL().split("/")[data.getVideoURL().split("/").length - 1]);
                            }
                            temp.add(d);
                            i++;
                        }

                        Platform.runLater(()->status.setText(langData.get("main_status_get_mylist_get_success")));
                    }
                }

                // JSON or Prefabへ
                int min = 0;
                final String maxText = ""+temp.size();

                Platform.runLater(()->status.setText(langData.get("main_status_get_mylist_assembly").replaceAll("#player#", output_combo.getSelectionModel().getSelectedItem())));

                String jsonText = "";
                if (output_combo.getSelectionModel().getSelectedItem().equals("iwaSync ("+langData.get("main_json")+")")){
                    iwaSync json = new iwaSync();
                    iwaSync_Tracks[] iwaSyncTracks = new iwaSync_Tracks[temp.size()];

                    for (PlayListData data : temp) {
                        int finalMin = min;
                        Platform.runLater(()->status.setText(langData.get("main_status_get_list").replaceAll("#now#", ""+ finalMin).replaceAll("#max#", maxText)));
                        iwaSyncTracks[min] = new iwaSync_Tracks();
                        iwaSyncTracks[min].setMode(1);
                        iwaSyncTracks[min].setTitle(data.getTitle());
                        iwaSyncTracks[min].setUrl(data.getVideoURL());
                        min++;
                    }

                    json.setTracks(iwaSyncTracks);
                    jsonText = Function.gson.toJson(json);
                } else if (output_combo.getSelectionModel().getSelectedItem().equals("iwaSync ("+langData.get("main_prefab")+")")){

                    net.nicovrc.dev.prefab.iwaSync iwaSync = new net.nicovrc.dev.prefab.iwaSync();
                    iwaSync.setUrls(temp);

                    jsonText = iwaSync.getPrefab();

                } else if (output_combo.getSelectionModel().getSelectedItem().equals("KineL式(りら式) ("+langData.get("main_prefab")+")")){

                    Kinel kinel = new Kinel();
                    kinel.setUrls(temp);

                    jsonText = kinel.getPrefab();

                }

                String jsonFileName = "./NicoNicoJson" + (output_combo.getSelectionModel().getSelectedItem().endsWith(langData.get("main_json") + ")") ? ".json" : ".prefab");
                if (playlistTitle != null){
                    jsonFileName = playlistTitle + (output_combo.getSelectionModel().getSelectedItem().endsWith(langData.get("main_json") + ")") ? ".json" : ".prefab");
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

                Platform.runLater(()->status.setText(langData.get("main_status_get_success").replaceAll("#player#", output_combo.getSelectionModel().getSelectedItem())));


            });
        });
        main_root.getChildren().add(run_button);


        main_stage.setScene(main_scene);
        main_stage.showAndWait();

    }
}