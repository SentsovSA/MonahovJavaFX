package com.example.monahovjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    public TextField textField1;
    @FXML
    public TextField textField2;
    @FXML
    public TextField textField3;
    @FXML
    public TextField textField4;
    @FXML
    public AnchorPane anchorPane;
    @FXML
    public MenuItem redMenuBGItem;
    @FXML
    public MenuItem blueMenuBGItem;
    @FXML
    public MenuItem greenMenuBGItem;
    @FXML
    public MenuItem redMenuTFItem;
    @FXML
    public MenuItem blueMenuTFItem;
    @FXML
    public MenuItem greenMenuTFItem;

    @FXML
    public void setBackgroundRed(ActionEvent actionEvent) {
        anchorPane.setBackground(Background.fill(Color.RED));
    }

    @FXML
    public void setBackgroundBlue(ActionEvent actionEvent) {
        anchorPane.setBackground(Background.fill(Color.BLUE));
    }

    @FXML
    public void setBackgroundGreen(ActionEvent actionEvent) {
        anchorPane.setBackground(Background.fill(Color.GREEN));
    }

    @FXML
    public void setTextFieldsRed(ActionEvent actionEvent) {
        textField1.setBackground(Background.fill(Color.RED));
        textField2.setBackground(Background.fill(Color.RED));
        textField3.setBackground(Background.fill(Color.RED));
        textField4.setBackground(Background.fill(Color.RED));
    }

    @FXML
    public void setTextFieldsBlue(ActionEvent actionEvent) {
        textField1.setBackground(Background.fill(Color.BLUE));
        textField2.setBackground(Background.fill(Color.BLUE));
        textField4.setBackground(Background.fill(Color.BLUE));
        textField3.setBackground(Background.fill(Color.BLUE));
    }

    @FXML
    public void setTextFieldsGreen(ActionEvent actionEvent) {
        textField1.setBackground(Background.fill(Color.GREEN));
        textField2.setBackground(Background.fill(Color.GREEN));
        textField3.setBackground(Background.fill(Color.GREEN));
        textField4.setBackground(Background.fill(Color.GREEN));
    }
}