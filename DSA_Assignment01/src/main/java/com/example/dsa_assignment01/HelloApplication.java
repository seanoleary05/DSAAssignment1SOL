package com.example.dsa_assignment01;

import iterators.CustomNode;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lists.CustomList;
import models.Show;
import utils.Utilities;
import java.io.IOException;

public class HelloApplication <T> extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        CustomList<T> customList = new CustomList<>();


        Button b = new Button();
        Scene scene = new Scene(root, 400, 900);
        stage.setScene(scene);
        stage.show();
    }




    public static void main(String[] args) {
        launch();
    }
}