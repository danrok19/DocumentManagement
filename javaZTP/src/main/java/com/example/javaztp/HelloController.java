package com.example.javaztp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
//        ArrayList<PurchaseDoc> Lista = new ArrayList<PurchaseDoc>();
//
//        PurchaseDocBuilder builderReceipt2 = new ReceiptBuilder();
//        PurchaseDocDirector directorReceipt2 = new PurchaseDocDirector(builderReceipt2);
//
//        PurchaseDocBuilder builderReceipt = new ReceiptBuilder();
//        PurchaseDocDirector directorReceipt = new PurchaseDocDirector(builderReceipt);
//
//        PurchaseDocBuilder builderInvoice = new InvoiceBuilder();
//        PurchaseDocDirector directorInvoice = new PurchaseDocDirector(builderInvoice);
//
//        PurchaseDoc doc2 = directorReceipt2.createReceipt(2, "Siema yoo Receipt2", new Date(),2);
//        Lista.add(doc2);
//
//
//        PurchaseDoc doc1 = directorReceipt.createReceipt(1, "Siema yoo Receipt1", new Date(),1);
//        Lista.add(doc1);
//
//        PurchaseDoc doc3 = directorInvoice.createInvoice(3, "Siema yoo Invoice1", new Date(),new Components(),1, new Date());
//        Lista.add(doc3);
//
//        History historia = new History();
//        historia.setDocuments(Lista);
//
//
//        for(int i = 0;i<3;i++) {
//            System.out.println(historia.getDocs().get(i).getId());
//            System.out.println(historia.getDocs().get(i).getBuyerData());
//            System.out.println(historia.getDocs().get(i).getDate());
//            System.out.println("-------------------------------------");
//        }
//        System.out.println("-------------------------------------");
//        historia.setSortStrategy(new SortById());
//        historia.sortDocuments();
//        for(int i = 0;i<3;i++) {
//            System.out.println(historia.getDocs().get(i).getId());
//            System.out.println(historia.getDocs().get(i).getBuyerData());
//            System.out.println(historia.getDocs().get(i).getDate());
//        }
    }

    private Stage stage;
    private Scene scene;
    @FXML
    protected void switchToHistory(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("history-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}