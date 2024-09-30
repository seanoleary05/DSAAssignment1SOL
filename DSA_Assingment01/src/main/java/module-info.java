module com.example.dsa_assingment01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dsa_assignment01 to javafx.fxml;
    exports com.example.dsa_assignment01;
    exports models;
    opens models to javafx.fxml;
}