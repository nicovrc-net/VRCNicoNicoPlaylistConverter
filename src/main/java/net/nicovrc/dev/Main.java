package net.nicovrc.dev;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import net.nicovrc.dev.data.NicoNicoCookie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main extends Application {

    private static final Stage main_stage = new Stage();
    private static final Stage sub_stage = new Stage();

    public static void main(String[] args) {

        System.out.println("VRCNicoNicoPlayerlistConverter Ver " + Function.Version);

        try {
            launch();
        } catch (Exception e){
            // e.printStackTrace();
        }

    }

    @Override
    public void start(Stage stage) throws Exception {
        // Cookie情報
        File file = new File("./tools/cookie.txt");
        System.out.println("[Info] ニコニコ動画のログイン情報確認");
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
            login_label4.setDisable(true);

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

                    if (!cookie[0].isLogin() && cookie[0].getMfw_url().isEmpty()){
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

            try (FileWriter file1 = new FileWriter("./tools/cookie.txt");
                 PrintWriter pw = new PrintWriter(new BufferedWriter(file1))){

                pw.print("nicosid="+cookie[0].getNicosid()+"; user_session="+cookie[0].getUser_session());
            } catch (Exception e){
                e.printStackTrace();
                return;
            }
            System.out.println("[Info] ログイン成功");
        } else {
            System.out.println("[Info] ログイン情報が見つかりました。");
        }

        //
        System.out.println("[]");

    }
}