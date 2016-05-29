package Controllers;

import Conn.ServerAuthentication;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public class LoginController extends AbstractController {

    public TextField login;
    public PasswordField passwordField;
    public Label errorLabel;


    public void login(ActionEvent actionEvent) throws IOException {
        ServerAuthentication auth = new ServerAuthentication();
        if (auth.tryAuth(login.getText(), passwordField.getText())) {
            app.changeScene("Menu");
        }
        else {
            errorLabel.setText("Error login or pwd");
            errorLabel.setVisible(true);
        }
    }


    public void logout(Stage stage) throws IOException {
        System.out.println("Logout");
    }
}
