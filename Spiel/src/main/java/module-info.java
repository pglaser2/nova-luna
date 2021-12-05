module com.example.spiel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spiel to javafx.fxml;
    exports com.example.spiel;
}