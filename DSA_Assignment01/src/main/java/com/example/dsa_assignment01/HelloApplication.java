package com.example.dsa_assignment01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  extends Application {

    private CustomList<String> myList = new CustomList<>();

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));


        TextField inputField = new TextField();
        inputField.setPromptText("Enter a value for the node");

        Button addButton = new Button("Add Node");

        TextArea displayArea = new TextArea();
        displayArea.setEditable(false);




            VBox layout = new VBox(10, inputField, addButton, displayArea);
            Scene scene = new Scene(layout, 400, 900);
            stage.setScene(scene);
            stage.show();
        }




    public static void main (String[]args){
        launch();
    }
}

