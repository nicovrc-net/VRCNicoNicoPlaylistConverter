package net.nicovrc.dev;


import com.sun.security.auth.module.NTSystem;
import com.sun.security.auth.module.UnixSystem;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import net.nicovrc.dev.data.NicoNicoCookie;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
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
        System.out.println("VRCNicoNicoPlayerlistConverter Ver " + Function.Version);

        // Cookie情報
        File file = new File("./tools/cookie.txt");
        System.out.println("[Info] ニコニコ動画のログイン情報確認");

        // 暗号化 / 復号化鍵
        String key_str = new String(Base64.getEncoder().encode("VRCNicoNicoPlayListConverter".getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
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

        if (file.exists()){
            try {
                // 復号化できなかったら削除する
                Cipher decrypter = Cipher.getInstance("AES/CBC/PKCS5Padding");

                decrypter.init(Cipher.DECRYPT_MODE, key, iv);

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

                byte[] byteToken = Base64.getDecoder().decode(Text);
                String s = new String(decrypter.doFinal(byteToken), StandardCharsets.UTF_8);
                if (!s.startsWith("nicosid=")){
                    file.delete();
                }
            } catch (Exception e){
                //e.printStackTrace();
                file.delete();
            }
        }

        if (!file.exists()){
            System.out.println("[Info] ログイン情報が見つかりませんでした。 ログイン画面を表示します。");

            sub_stage.setResizable(false);
            sub_stage.setMaximized(false);
            sub_stage.setFullScreen(false);
            sub_stage.setTitle("ログイン");
            sub_stage.setWidth(400);
            sub_stage.setHeight(300);
            final AnchorPane root = new AnchorPane();

            Label login_label1 = new Label("※何があっても自己責任でお願いします。");
            login_label1.setLayoutX(5);
            login_label1.setLayoutY(5);
            login_label1.setFont(new Font(16));
            root.getChildren().add(login_label1);

            Label login_label2 = new Label("メールアドレスまたは電話番号");
            login_label2.setLayoutX(10);
            login_label2.setLayoutY(30);
            root.getChildren().add(login_label2);

            TextField mail_field = new TextField();
            mail_field.setLayoutX(10);
            mail_field.setLayoutY(45);
            mail_field.setEditable(true);
            mail_field.setFocusTraversable(false);
            mail_field.setPrefWidth(350);
            root.getChildren().add(mail_field);

            Label login_label3 = new Label("パスワード");
            login_label3.setLayoutX(10);
            login_label3.setLayoutY(70);
            root.getChildren().add(login_label3);

            TextField password_field = new TextField();
            password_field.setLayoutX(10);
            password_field.setLayoutY(85);
            password_field.setEditable(true);
            password_field.setFocusTraversable(false);
            password_field.setPrefWidth(350);
            root.getChildren().add(password_field);

            Label login_label4 = new Label("メールアドレスまたは電話番号　または　パスワードが間違えています。");
            login_label4.setLayoutX(10);
            login_label4.setLayoutY(150);

            Label login_label5 = new Label("認証コード");
            login_label5.setLayoutX(10);
            login_label5.setLayoutY(170);
            login_label5.setDisable(false);

            TextField mfw_field = new TextField();
            mfw_field.setLayoutX(10);
            mfw_field.setLayoutY(190);
            mfw_field.setEditable(true);
            mfw_field.setFocusTraversable(false);
            mfw_field.setPrefWidth(350);

            NicoNicoCookie[] cookie = new NicoNicoCookie[]{null};
            Button mfw_button = new Button("認証");
            mfw_button.setLayoutX(10);
            mfw_button.setLayoutY(230);
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

            Button button = new Button("ログイン");
            button.setLayoutX(10);
            button.setLayoutY(120);
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

                    Cipher encrypter = Cipher.getInstance("AES/CBC/PKCS5Padding");

                    encrypter.init(Cipher.ENCRYPT_MODE, key, iv);
                    byte[] byteToken = encrypter.doFinal(("nicosid="+cookie[0].getNicosid()+"; user_session="+cookie[0].getUser_session()).getBytes(StandardCharsets.UTF_8));

                    pw.print(new String(Base64.getEncoder().encode(byteToken), StandardCharsets.UTF_8));
                } catch (Exception e){
                    e.printStackTrace();
                    return;
                }
                System.out.println("[Info] ログイン成功");
            }
        } else {
            System.out.println("[Info] ログイン情報が見つかりました。");
        }

        if (!file.exists()){
            return;
        }

        // アップデート確認
        System.out.println("[Info] アップデート確認");
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
            System.out.println("[Info] アップデートが見つかりませんでした。");
        } else {
            System.out.println("[Info] アップデートが見つかりました。");
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
            sub_stage.setTitle("アップデートのお知らせ");
            sub_stage.setWidth(400);
            sub_stage.setHeight(200);

            AnchorPane root = new AnchorPane();
            Scene scene = new Scene(root);

            Button button = new Button("閉じる");
            button.setLayoutX(300);
            button.setLayoutY(10);
            button.setOnAction(e -> {
                sub_stage.close();
            });
            root.getChildren().add(button);

            Label update_label1 = new Label("アップデートのお知らせ");
            update_label1.setLayoutX(5);
            update_label1.setLayoutY(5);
            update_label1.setFont(new Font(16));
            root.getChildren().add(update_label1);

            Label update_label2 = new Label("アップデートがあります。");
            update_label2.setLayoutX(10);
            update_label2.setLayoutY(40);
            root.getChildren().add(update_label2);

            Label update_label3 = new Label("現在のバージョン : " + Function.Version);
            update_label3.setLayoutX(10);
            update_label3.setLayoutY(80);
            root.getChildren().add(update_label3);

            Label update_label4 = new Label("最新のバージョン : " + new_version);
            update_label4.setLayoutX(10);
            update_label4.setLayoutY(100);
            root.getChildren().add(update_label4);

            if (isWindowsBatchStart || !ntSystem.getName().isEmpty()) {
                Button update_button = new Button("アップデート");
                update_button.setLayoutX(10);
                update_button.setLayoutY(120);
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
        main_stage.setWidth(400);
        main_stage.setHeight(600);
        main_stage.setTitle("VRCNicoNicoPlayListConverter Ver" + Function.Version);
        final AnchorPane main_root = new AnchorPane();
        final Scene main_scene = new Scene(main_root);

        Label url_input_text = new Label("マイリストのURLまたは再生リスト化したいURLを入れてください\n※マイリストのURLの場合は1つだけ入れてください\n※再生リスト化したい場合は1つの行には1つURLを入れてください。");
        url_input_text.setLayoutX(5);
        url_input_text.setLayoutY(5);
        //url_input_text.setFont(new Font(16));
        main_root.getChildren().add(url_input_text);

        TextArea url_input = new TextArea();
        //url_input.setFont(DefaultFont);
        url_input.setLayoutX(5);
        url_input.setLayoutY(65);
        url_input.setPrefSize(350, 300);
        url_input.setWrapText(false);
        main_root.getChildren().add(url_input);

        Label output_mode_text = new Label("出力形式を選択してください。");
        output_mode_text.setLayoutX(5);
        output_mode_text.setLayoutY(380);
        //output_mode_text.setFont(new Font(16));
        main_root.getChildren().add(output_mode_text);

        ComboBox<String> output_combo = new ComboBox<>();
        output_combo.setLayoutX(5);
        output_combo.setLayoutY(400);
        output_combo.getItems().addAll("",
                "iwaSync (json形式)",
                "KineL式(りら式) (prefab形式)",
                "YamaPlayer (json形式)",
                "VizVid (json形式)"
        );
        output_combo.setPrefWidth(250);
        main_root.getChildren().add(output_combo);

        Label site_select_text = new Label("変換するサイトを選択してください");
        site_select_text.setLayoutX(5);
        site_select_text.setLayoutY(440);
        //site_select_text.setFont(new Font(16));
        main_root.getChildren().add(site_select_text);

        ComboBox<String> site_select = new ComboBox<>();
        site_select.setLayoutX(5);
        site_select.setLayoutY(460);
        site_select.getItems().addAll("",
                "nicovrc.net",
                "tool.suzumebachi.xyz"
        );
        site_select.setPrefWidth(250);
        main_root.getChildren().add(site_select);

        Button run_button = new Button("実行");
        run_button.setLayoutX(5);
        run_button.setLayoutY(500);
        main_root.getChildren().add(run_button);

        main_stage.setScene(main_scene);
        main_stage.showAndWait();

    }
}