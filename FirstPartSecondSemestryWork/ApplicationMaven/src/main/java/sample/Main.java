package sample;

import Controllers.AbstractController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public class Main extends Application {

    private Stage currentStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        currentStage = primaryStage;
        primaryStage.setTitle("SS");
        changeScene("Login");
    }

    public void changeScene(String sceneName) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + sceneName + ".fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AbstractController controller = loader.getController();
        controller.setApp(this);

        assert root != null;
        currentStage.setScene(new Scene(root));
        currentStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
