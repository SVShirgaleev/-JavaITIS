package Controllers;

import Entity.GoodEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public class MenuController extends AbstractController{

    @FXML
    private Button toRightGoodButton;
    public Button toLeftGoodButton;
    public Label goodPriceLabel;
    public Label goodNameLabel;
    public ImageView goodImageView;


    private ArrayList<GoodEntity> goods;
    private GoodEntity currentGood;

    public void toProfile(ActionEvent actionEvent) throws IOException {
        app.changeScene("Profile");
    }

    public void Logout(ActionEvent actionEvent) throws IOException {
        app.changeScene("Login");
    }


    public void toLeftGood(ActionEvent actionEvent) {
        if (goods != null) {
            if (goods.size() > 1) toRightGoodButton.setVisible(true);
            int index = goods.indexOf(currentGood);
            if (index == 1) {
                setCurrentGood(goods.get(0));
                toLeftGoodButton.setVisible(false);
            }
            setCurrentGood(goods.get(index - 1));
        }
    }


    public void toRightGood(ActionEvent actionEvent) {
        if (goods != null) {
            if (goods.size() > 1) toLeftGoodButton.setVisible(true);
            int index = goods.indexOf(currentGood);
            if (index == goods.size() - 2) {
                setCurrentGood(goods.get(goods.size()-1));
                toRightGoodButton.setVisible(false);
            } else setCurrentGood(goods.get(index + 1));
        }

    }

    public void setCurrentGood(GoodEntity currentGood) {
        this.currentGood = currentGood;
        goodImageView.setImage(new Image(currentGood.getImageUrl(), 300, 300, true, false));
        goodNameLabel.setText(currentGood.getName());
        goodPriceLabel.setText("$" + currentGood.getPrice().toString());

    }

    public void update(ActionEvent actionEvent) {
        System.out.println("Update");
    }


    @FXML
    private void initialize() {
        ObservableList<GoodEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getGoods());
        goods = new ArrayList<GoodEntity>();
        goods.addAll(list);
        setCurrentGood(goods.get(0));


    }
}
