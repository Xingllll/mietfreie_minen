package Client;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    public class ClientViewModel extends Application {
        public static Stage window = new Stage();
        @Override
        public void start(Stage window) throws Exception{
            this.window = window; //window can be used for next scenes
            Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
            window.setTitle("Love Letter");
            Scene scene = new Scene(root, 300,400);
            window.setScene(scene);
            window.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }


