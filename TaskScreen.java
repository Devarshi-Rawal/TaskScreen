import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;

public class TaskScreen extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override

    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(0, 0, 0, 0));

        Label user_id = new Label("Name");
        Label password = new Label("Password");
        TextField tf = new TextField();
        PasswordField pf = new PasswordField();
        pf.setPromptText("Enter Password");

        pane.add(user_id, 0, 1);
        pane.add(tf, 1, 1);
        pane.add(password, 0, 2);
        pane.add(pf, 1, 2);
        Button calc_button = new Button("Login");
        pane.add(calc_button, 1, 5);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);

        Scene scene = new Scene(borderPane, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Task Screen");
        primaryStage.show();

    }
}
