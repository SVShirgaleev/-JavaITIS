package Controllers;

import Entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Conn.ServerAuthentication.currentUser;

/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public class ProfileController extends AbstractController {

    public TextField userSurnameLabel;
    public TextField userLoginLabel;
    public Button editButton;
    public TextField userNameLabel;
    public Label errorName;
    public Label errorSurname;
    public Label erroLogin;
    private  UserEntity user = currentUser;
    boolean edit;


    public void Logout(ActionEvent actionEvent) throws IOException {
        edit = false;
        app.changeScene("Login");
    }



    public void update(ActionEvent actionEvent) throws IOException {
        System.out.println("Update");
    }


    public void toShop(ActionEvent actionEvent) throws IOException {
        edit = false;
        app.changeScene("Menu");

    }

    public void Edit(ActionEvent actionEvent) {
        if (!edit) {
            edit = true;
            userNameLabel.setEditable(true);
            userSurnameLabel.setEditable(true);
            userLoginLabel.setEditable(true);

            editButton.setText("done");

        } else if (testToValid()) {
            edit = false;
            user.setFirstName(userNameLabel.getText());
            user.setLogin(userLoginLabel.getText());
            user.setLastName(userSurnameLabel.getText());
            server.updateUser(user);
            editButton.setText("edit");
            userNameLabel.setEditable(false);
            userSurnameLabel.setEditable(false);
            userLoginLabel.setEditable(false);

        }
    }

    @FXML
    private void initialize() {
        userLoginLabel.setText(user.getLogin());
        userNameLabel.setText(user.getFirstName());
        userSurnameLabel.setText(user.getLastName());
    }


    public boolean testToValid() {
        if (userNameLabel.getText().length() == 0 || userSurnameLabel.getText().length() == 0 || userLoginLabel.getText().length() == 0) {
            if (userNameLabel.getText().length() == 0) {
                errorName.setText("Заполнить!");
                errorName.setVisible(true);
            }
            if (userSurnameLabel.getText().length() == 0) {
                errorSurname.setText("Заполнить!");
                errorSurname.setVisible(true);
            }
            if (userLoginLabel.getText().length() == 0) {
                erroLogin.setText("Заполнить!");
                erroLogin.setVisible(true);
            }
            return false;
        }
        erroLogin.setVisible(false);
        errorSurname.setVisible(false);
        errorName.setVisible(false);
        return true;
    }
}
