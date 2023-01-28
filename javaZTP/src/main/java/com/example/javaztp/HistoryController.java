package com.example.javaztp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HistoryController implements Initializable {

    private DbSingleton dbSingleton;
    private ArrayList<PurchaseDoc> lista;
    History historia;
    private int start = 0;
    private int end = 5;


    @FXML
    private Label docs1;
    @FXML
    private Label docs2;
    @FXML
    private Label docs3;
    @FXML
    private Label docs4;
    @FXML
    private Label docs5;
    @FXML
    private Label docs6;

    public HistoryController(){
        dbSingleton = DbSingleton.getInstance();
        lista = dbSingleton.getBazaDanych();
        historia = new History();
        historia.setDocuments(lista);

    }

    private void start(){
        if(start < this.historia.getDocs().size()){
            if(historia.getDocs().get(start).getClass() == Receipt.class){
                docs1.setText("Paragon-> "+"ID: "+historia.getDocs().get(start).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start).getBuyerData() + " Data: " + historia.getDocs().get(start).getDate());
            }
            else{
                docs1.setText("Faktura-> "+"ID: "+historia.getDocs().get(start).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start).getBuyerData() + " Data: " + historia.getDocs().get(start).getDate());

            }
        }
        else{
            docs1.setText("------------------------------");
        }
        if(start+1 < this.historia.getDocs().size()){
            if(historia.getDocs().get(start+1).getClass() == Receipt.class){
                docs2.setText("Paragon-> "+"ID: "+historia.getDocs().get(start+1).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+1).getBuyerData() + " Data: "+ historia.getDocs().get(start+1).getDate());
            }
            else{
                docs2.setText("Faktura-> "+"ID: "+historia.getDocs().get(start+1).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+1).getBuyerData() + " Data: "+ historia.getDocs().get(start+1).getDate());

            }
        }
        else{
            docs2.setText("------------------------------");
        }
        if(start+2 < this.historia.getDocs().size()){
            if(historia.getDocs().get(start+2).getClass() == Receipt.class){
                docs3.setText("Paragon-> "+"ID: "+historia.getDocs().get(start+2).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+2).getBuyerData() + " Data: "+ historia.getDocs().get(start+2).getDate());
            }
            else{
                docs3.setText("Faktura-> "+"ID: "+historia.getDocs().get(start+2).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+2).getBuyerData() + " Data: "+ historia.getDocs().get(start+2).getDate());

            }
        }
        else{
            docs3.setText("------------------------------");
        }
        if(start+3 < this.historia.getDocs().size()){
            if(historia.getDocs().get(start+3).getClass() == Receipt.class){
                docs4.setText("Paragon-> "+"ID: "+historia.getDocs().get(start+3).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+3).getBuyerData() + " Data: "+ historia.getDocs().get(start+3).getDate());
            }
            else{
                docs4.setText("Faktura-> "+"ID: "+historia.getDocs().get(start+3).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+3).getBuyerData() + " Data: "+ historia.getDocs().get(start+3).getDate());
            }
        }
        else{
            docs4.setText("------------------------------");
        }
        if(start+4 < this.historia.getDocs().size()){
            if(historia.getDocs().get(start+4).getClass() == Receipt.class){
                docs5.setText("Paragon-> "+"ID: "+historia.getDocs().get(start+4).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+4).getBuyerData() + " Data: "+ historia.getDocs().get(start+4).getDate());
            }
            else{
                docs5.setText("Faktura-> "+"ID: "+historia.getDocs().get(start+4).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+4).getBuyerData() + " Data: "+ historia.getDocs().get(start+4).getDate());

            }
        }
        else{
            docs5.setText("------------------------------");
        }
        if(start+5 < this.historia.getDocs().size()){
            if(historia.getDocs().get(start+5).getClass() == Receipt.class){
                docs6.setText("Paragon-> "+"ID: "+historia.getDocs().get(start+5).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+5).getBuyerData() + " Data: "+ historia.getDocs().get(start+5).getDate());
            }
            else{
                docs6.setText("Faktura-> "+"ID: "+historia.getDocs().get(start+5).getStringId() + " "+"Kupujący: "+historia.getDocs().get(start+5).getBuyerData() + " Data: "+ historia.getDocs().get(start+5).getDate());
            }
        }
        else{
            docs6.setText("------------------------------");
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        start();
    }

    @FXML
    private Button goNext;
    @FXML
    public void goNextFunction(){
        if(this.lista.size() > end+1){
            this.start +=6;
            this.end +=6;
            start();
        }

    }
    @FXML
    private Button goBack;
    @FXML
    public void goBackFunction(){
        if(this.start>0){
            this.start -=6;
            this.end -=6;
            start();
        }
    }

    @FXML Button SortId;
    @FXML
    public void goSortById(){
        historia.setSortStrategy(new SortById());
        historia.sortDocuments();
        start();
    }

    @FXML Button SortDate;
    @FXML
    public void goSortByDate(){
        historia.setSortStrategy(new SortByDate());
        historia.sortDocuments();
        start();
    }

    @FXML
    private Button switchButton;
    private Stage stage;
    private Scene scene;
    @FXML
    protected void switchToBuilder(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("purchaseDocBuilder-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDetails(int i){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("purchaseDoc-view.fxml"));
            Parent root = loader.load();

            PurchaseDocController controller2 = loader.getController();
            controller2.setDoc(this.historia.getDocs().get(start+i));

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Szczegóły dokumentu");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void switchActionD1(){
        switchToDetails(0);
    }
    @FXML
    public void switchActionD2(){
        switchToDetails(1);
    }
    @FXML
    public void switchActionD3(){
        switchToDetails(2);
    }
    @FXML
    public void switchActionD4(){
        switchToDetails(3);
    }
    @FXML
    public void switchActionD5(){
        switchToDetails(4);
    }
    @FXML
    public void switchActionD6(){
        switchToDetails(5);
    }

}
