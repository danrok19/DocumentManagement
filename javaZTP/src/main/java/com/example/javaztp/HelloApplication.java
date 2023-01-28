package com.example.javaztp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        try{
            Parent root= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Documents");
            Image icon = new Image("images.png");
            stage.getIcons().add(icon);

            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        launch();
    }
}