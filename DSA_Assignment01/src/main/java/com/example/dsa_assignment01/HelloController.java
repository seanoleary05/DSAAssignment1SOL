package com.example.dsa_assignment01;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    private CustomList<String> myList = new CustomList<>();

    @FXML
    private TextField inputField;

    @FXML
    private TextArea displayArea;

    @FXML
    private void handleAddNode() {
        String value = inputField.getText();
        if (!value.isEmpty()) {
            myList.add(value);              // Add the input value to the linked list
            displayArea.setText(myList.list());  // Update display area with current list
            inputField.clear();           // Clear the input field
        }
    }
}


