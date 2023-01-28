module com.example.javaztp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaztp to javafx.fxml;
    exports com.example.javaztp;
}