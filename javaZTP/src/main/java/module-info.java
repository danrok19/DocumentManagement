module com.example.javaztp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaztp to javafx.fxml;
    exports com.example.javaztp;
    exports com.example.javaztp.strategy;
    opens com.example.javaztp.strategy to javafx.fxml;
    exports com.example.javaztp.builder;
    opens com.example.javaztp.builder to javafx.fxml;
    exports com.example.javaztp.factoryMethod;
    opens com.example.javaztp.factoryMethod to javafx.fxml;
    exports com.example.javaztp.decorator;
    opens com.example.javaztp.decorator to javafx.fxml;
    exports com.example.javaztp.models;
    opens com.example.javaztp.models to javafx.fxml;
}