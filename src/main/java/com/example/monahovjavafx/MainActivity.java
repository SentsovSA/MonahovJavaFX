package com.example.monahovjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainActivity extends Application {
    private static final Controller CONTROLLER = new Controller();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainActivity.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Lab3");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public static void changeColors(){
        CONTROLLER.redMenuBGItem.setOnAction(CONTROLLER::setBackgroundRed);
        CONTROLLER.blueMenuBGItem.setOnAction(CONTROLLER::setBackgroundBlue);
        CONTROLLER.greenMenuBGItem.setOnAction(CONTROLLER::setBackgroundGreen);
        CONTROLLER.redMenuTFItem.setOnAction(CONTROLLER::setTextFieldsRed);
        CONTROLLER.blueMenuTFItem.setOnAction(CONTROLLER::setTextFieldsBlue);
        CONTROLLER.greenMenuTFItem.setOnAction(CONTROLLER::setTextFieldsGreen);
    }
}