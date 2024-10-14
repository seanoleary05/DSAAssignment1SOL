package com.example.dsa_assignment01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import utils.Utilities;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication <T> extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1366, 768);
        GridPane button = new GridPane();
        Button a;
        for (int i=0;i<=5;i++){
            button.add(new Button("Button"+i),0,i);
            button.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
            GridPane.setConstraints(button,i,0);
        }

        stage.setScene(scene);
        stage.show();
    }




    public void addShow(){
        String showName = Utilities.readnextLine("Enter the name of the show");
        int showTime = Utilities.readnextInt("In minutes, How long will the show be?");
        String showStartDate = Utilities.readnextLine("What date does the show start");
        String showEndDate = Utilities.readnextLine("What date does the show end?");
        double showTicketPrice = Utilities.readNextDouble("How much are the tickets for this show");

        boolean isAdded = true;
    }

    public static void main(String[] args) {
        launch();
    }
}