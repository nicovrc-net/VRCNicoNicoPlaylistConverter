package net.nicovrc.dev;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import net.nicovrc.dev.data.NicoNicoCookie;
import net.nicovrc.dev.json.*;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
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

        if (!file.exists()){
            System.out.println("[Info] "+Function.langData.get("niconico_login_check_fail"));

            sub_stage.setResizable(false);
            sub_stage.setMaximized(false);
            sub_stage.setFullScreen(false);
            sub_stage.setTitle("ログイン");
            sub_stage.setWidth(400);
            sub_stage.setHeight(300);
            final AnchorPane root = new AnchorPane();

            Label login_label1 = new Label(Function.langData.get("niconico_login_risk"));
            login_label1.setLayoutX(5);
            login_label1.setLayoutY(5);
            login_label1.setFont(Size16Font);
            root.getChildren().add(login_label1);

            Label login_label2 = new Label(Function.langData.get("niconico_mail_tel"));
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

            Label login_label3 = new Label(Function.langData.get("niconico_password"));
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

            Label login_label4 = new Label(Function.langData.get("niconico_login_fail"));
            login_label4.setLayoutX(10);
            login_label4.setLayoutY(150);
            login_label4.setFont(DefaultFont);

            Label login_label5 = new Label(Function.langData.get("niconico_2fa_code"));
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
            Button mfw_button = new Button(Function.langData.get("niconico_2fa"));
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

            Button button = new Button(Function.langData.get("niconico_login"));
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

                    if (cookie[0].isLogin()){
                        Platform.runLater(sub_stage::close);
                    }

                });
            });
            root.getChildren().add(button);

            sub_stage.setScene(new Scene(root));
            sub_stage.showAndWait();

            if (cookie[0].isLogin()){
                Function.FileWrite_text("./tools/cookie.txt", Function.EncrypterText("nicosid="+cookie[0].getNicosid()+"; user_session="+cookie[0].getUser_session()));
                System.out.println("[Info] "+Function.langData.get("niconico_login_success"));
            }
        } else {
            System.out.println("[Info] "+Function.langData.get("niconico_login_check_found"));
        }

        if (!file.exists()){
            return;
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

                    File update_file = new File("./tools/update1.bat");
                    if (update_file.exists()) {
                        update_file.delete();
                    }
                    update_file = new File("./tools/update2.bat");
                    if (update_file.exists()) {
                        update_file.delete();
                    }

                    Function.FileWrite_text("./tools/update1.bat", "start ./tools/update2.bat".replaceAll("\\./", CurrentFolderPass + "/"));
                    String str = """
                        curl https://github.com/nicovrc-net/VRCNicoNicoPlaylistConverter/releases/download/#ver#/VRCNicoNicoPlaylistConverter.zip -L --output ./tools/VRCNicoNicoPlaylistConverter.zip
                        tar -xf ./tools/VRCNicoNicoPlaylistConverter.zip -C ./tools\\
                        del ./VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar
                        del ./start.bat
                        del /Q ./lang
                        move ./tools\\VRCNicoNicoPlaylistConverter-1.0-SNAPSHOT-all.jar ./
                        move ./tools\\start.bat ./
                        move ./tools\\lang ./
                        exit
                        """;
                    Function.FileWrite_text("./tools/update2.bat", str.replaceAll("#ver#", new_version).replaceAll("\\./", CurrentFolderPass.replaceAll("/", "\\\\\\\\") + "\\\\"));
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
                    File update_file = new File("./tools/update1.bat");
                    if (update_file.exists()) {
                        update_file.delete();
                    }
                    update_file = new File("./tools/update2.bat");
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
                    "KineL式(りら式) ("+Function.langData.get("main_prefab")+")",
                    "YamaPlayer ("+Function.langData.get("main_json")+")",
                    "YamaPlayer (v1,"+Function.langData.get("main_prefab")+")",
                    "YamaPlayer (v2,"+Function.langData.get("main_prefab")+")",
                    "VizVid ("+Function.langData.get("main_json")+")",
                    "あやぷれいやー2 ("+Function.langData.get("main_json")+")",
                    "Sliden"
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