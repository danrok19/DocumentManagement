package com.example.javaztp;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class PurchaseDocBuilderController implements Initializable {


    private int i = -1;
    private String chosenType;
    private int docId;
    private int specificId;

    private LocalDate buyingDate;
    private LocalDate deliveryDate;

    private String buyerDataNr1;
    private String buyerDataNr2;

    private DbSingleton singleton;
    private ArrayList<Component> orderData;
    @FXML
    ChoiceBox choiceBox1;
    @FXML
    ChoiceBox choiceBox2;
    @FXML
    ChoiceBox choiceBox3;

    @FXML
    ListView listView;

    @FXML
    ChoiceBox choiceBoxTypeDoc;

    @FXML
    Label chosenTypeLabel;

    @FXML
    Label idLabel;
    @FXML
    Label deliveryLabel;

    @FXML
    DatePicker deliveryPicker;

    @FXML
    DatePicker buyPicker;

    @FXML
    Button submitType;

    @FXML
    Button submitIds;

    @FXML
    Button submitDates;
    @FXML
    Spinner spinnerDocId;
    @FXML
    Spinner spinnerSpecificId;

    @FXML
    Spinner spinnerPrice;

    @FXML
    Label dataLabel1;
    @FXML
    Label dataLabel2;
    @FXML
    TextField textField1;
    @FXML
    TextField textField2;

    @FXML
    Button addNextButton;

    @FXML
    Button addNextButton1;
    @FXML
    Button addNextButton2;
    @FXML
    Button addNextButton3;
    @FXML
    Button addNextButton4;
    @FXML
    Button submitFinalButton;

    @FXML
    Button submitSalePrice;
    @FXML
    Button submitCodePrice;
    @FXML
    Spinner spinnerSalePrice;

    @FXML
    Spinner spinnerCodePrice;


    private String chosenComponent;
    private String chosenProducer;
    private String chosenDetails;
    private Double chosenPrice;
    private Component newComponent;

    private Double salePrice= 0.0;
    private Double codePrice=0.0;

    private ComponentFactory componentFactory;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBoxTypeDoc.getItems().addAll(
                "Paragon",
                "Faktura"
        );

        choiceBox1.getItems().addAll(
                "Karta Graficzna",
                "Procesor",
                "Dysk",
                "Płyta Główna",
                "Pamięć RAM",
                "Kontroler"
        );
        choiceBox1.setVisible(false);
        choiceBox2.setVisible(false);
        choiceBox3.setVisible(false);
        spinnerPrice.setVisible(false);
        addNextButton1.setVisible(false);
        addNextButton2.setVisible(false);
        addNextButton3.setVisible(false);
        addNextButton4.setVisible(false);
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);
        valueFactory.setValue(1);
        spinnerDocId.setValueFactory(valueFactory);

        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(10,100);
        valueFactory1.setValue(11);
        spinnerSpecificId.setValueFactory(valueFactory1);

        SpinnerValueFactory<Double> valueFactoryPrice = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.00,10000.00);
        valueFactoryPrice.setValue(1000.00);
        spinnerPrice.setValueFactory(valueFactoryPrice);

        SpinnerValueFactory<Double> valueFactorySale = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.00,10000.00);
        valueFactorySale.setValue(0.00);
        spinnerSalePrice.setValueFactory(valueFactorySale);
        SpinnerValueFactory<Double> valueFactoryCode = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.00,10000.00);
        valueFactoryCode.setValue(0.00);
        spinnerCodePrice.setValueFactory(valueFactoryCode);

        orderData = new ArrayList<Component>();
        singleton = DbSingleton.getInstance();
    }


    @FXML
    public void setDocType(){
        this.chosenType = (String) choiceBoxTypeDoc.getValue();
        if(this.chosenType == "Paragon"){
            chosenTypeLabel.setText("Id paragonu");
            deliveryLabel.setText("");
            deliveryPicker.setVisible(false);
            dataLabel1.setText("Imię");
            dataLabel2.setText("Nazwisko");
            dataLabel2.setVisible(true);
            textField2.setVisible(true);

        }
        else if(this.chosenType == "Faktura"){
            chosenTypeLabel.setText("Id faktury");
            deliveryPicker.setVisible(true);
            dataLabel1.setText("Dane Firmy");
            dataLabel2.setVisible(false);
            textField2.setVisible(false);
        }
    }

    @FXML
    public void setDocIds(){
        if(this.chosenType == "Paragon"){
            this.docId = (int) spinnerDocId.getValue();
            this.specificId = (int) spinnerSpecificId.getValue();
//            System.out.println(this.docId);
//            System.out.println(this.specificId);

        }
        else if(this.chosenType == "Faktura"){
            this.docId = (int) spinnerDocId.getValue();
            this.specificId = (int) spinnerSpecificId.getValue();
//            System.out.println(this.docId);
//            System.out.println(this.specificId);

        }
    }

    @FXML
    public void setDocDates(){
        if(this.chosenType == "Paragon"){
            this.buyingDate = buyPicker.getValue();
            System.out.println(this.buyingDate);

        }
        else if(this.chosenType == "Faktura"){
            this.buyingDate = buyPicker.getValue();
            this.deliveryDate = deliveryPicker.getValue();
            System.out.println(this.buyingDate);
            System.out.println(this.deliveryDate);

        }
    }

    @FXML
    public void setBuyerDatas(){
        if(this.chosenType == "Paragon"){
            this.buyerDataNr1 = textField1.getText();
            this.buyerDataNr2 = textField2.getText();
            System.out.println(this.buyerDataNr1 +" "+this.buyerDataNr2);

        }
        else if(this.chosenType == "Faktura"){
            this.buyerDataNr1 = textField1.getText();
            System.out.println(this.buyerDataNr1);

        }
    }

    @FXML
    public void addNextProduct(){
        addNextButton1.setVisible(true);
        choiceBox1.setVisible(true);
    }

    @FXML
    public void submitNextProduct(){
        this.chosenComponent = (String)choiceBox1.getValue();
        switch((String)choiceBox1.getValue()){
            case "Karta Graficzna":
                choiceBox2.getItems().removeAll();
                choiceBox2.getItems().addAll(
                        "Gigabyte",
                        "Asus",
                        "MSI",
                        "Zotac",
                        "Inno3D"
                );
                break;
            case "Procesor":
                choiceBox2.getItems().removeAll();
                choiceBox2.getItems().addAll(
                        "Intel",
                        "AMD"
                );
                break;
            case "Płyta Główna":
                choiceBox2.getItems().removeAll();
                choiceBox2.getItems().addAll(
                        "Gigabyte",
                        "Asus",
                        "MSI",
                        "Biostar",
                        "ASRock"
                );
                break;
            case "Pamięć RAM":
                choiceBox2.getItems().removeAll();
                choiceBox2.getItems().addAll(
                        "Kingston FURY",
                        "G.SKILL",
                        "GOODRAM",
                        "Corsair",
                        "Patriot"
                );
                break;
            case "Dysk":
                choiceBox2.getItems().removeAll();
                choiceBox2.getItems().addAll(
                        "WD",
                        "ADATA",
                        "Seagate",
                        "Silicon Power",
                        "Transcend"
                );
                break;
            case "Kontroler":
                choiceBox2.getItems().removeAll();
                choiceBox2.getItems().addAll(
                        "Silverstone",
                        "Axagon",
                        "ICY BOX",
                        "Lamptron",
                        "Unitek"
                );
                break;

        }
        choiceBox2.setVisible(true);
        addNextButton2.setVisible(true);
    }

    @FXML
    public void submitNext2Product(){
        this.chosenProducer = (String)choiceBox2.getValue();
        switch((String)choiceBox1.getValue()){
            case "Karta Graficzna":
                choiceBox3.getItems().removeAll();
                choiceBox3.getItems().addAll(
                        "24GB",
                        "20GB",
                        "16GB",
                        "12GB",
                        "10GB",
                        "8GB"
                );
                break;
            case "Procesor":
                choiceBox3.getItems().removeAll();
                choiceBox3.getItems().addAll(
                        "10 rdzeni",
                        "8 rdzeni",
                        "6 rdzeni",
                        "4 rdzenie",
                        "2 rdzenie"
                );
                break;
            case "Płyta Główna":
                choiceBox3.getItems().removeAll();
                choiceBox3.getItems().addAll(
                        "DDR5",
                        "DDR4"
                );
                break;
            case "Pamięć RAM":
                choiceBox3.getItems().removeAll();
                choiceBox3.getItems().addAll(
                        "DDR5",
                        "DDR5 SODIMM",
                        "DDR4",
                        "DDR4 SODIMM",
                        "DDR3"
                );
                break;
            case "Dysk":
                choiceBox3.getItems().removeAll();
                choiceBox3.getItems().addAll(
                        "HDD 1TB",
                        "SSD 1TB",
                        "HDD 512GB",
                        "SSD 512GB",
                        "HDD 256GB",
                        "SSD 256GB"
                );
                break;
            case "Kontroler":
                choiceBox3.getItems().removeAll();
                choiceBox3.getItems().addAll(
                        "USB 2.0",
                        "USB 3.2",
                        "SATA",
                        "PCIe",
                        "LPT"
                );
                break;

        }
        choiceBox3.setVisible(true);
        addNextButton3.setVisible(true);
    }
    @FXML
    public void submitNext3Product(){
        this.chosenDetails = (String)choiceBox3.getValue();
        spinnerPrice.setVisible(true);
        addNextButton4.setVisible(true);
    }
    @FXML
    public void submitNext4Product(){
        this.chosenPrice = (Double)spinnerPrice.getValue();
    }

    @FXML
    public void submitSale(){
        this.salePrice = (Double)spinnerSalePrice.getValue();
        spinnerCodePrice.setVisible(false);
        submitCodePrice.setVisible(false);

    }

    @FXML
    public void submitCode(){
        this.codePrice = (Double)spinnerCodePrice.getValue();
        spinnerSalePrice.setVisible(false);
        submitSalePrice.setVisible(false);
    }

    @FXML
    public void submitFinalProduct(){
        componentFactory = new ComponentFactory();
        this.newComponent = componentFactory.getComponent(this.chosenComponent,this.chosenProducer, this.chosenDetails,this.chosenPrice,this.salePrice, this.codePrice);
        orderData.add(this.newComponent);
        listView.getItems().add(++i,this.newComponent.getName());
        newComponent = null;
        componentFactory = null;
    }

    private Stage stage;
    private Scene scene;

    @FXML
    public void submitDocFinal(ActionEvent event) throws IOException {
        if(this.chosenType == "Paragon"){
            PurchaseDocBuilder builder = new ReceiptBuilder();
            PurchaseDocDirector director = new PurchaseDocDirector(builder);
            Receipt receipt = (Receipt) director.createReceipt(this.docId,this.buyerDataNr1 + " " +this.buyerDataNr2, this.buyingDate,this.specificId, this.orderData);
            singleton.addDoc(receipt);
        }
        else if(this.chosenType == "Faktura"){
            PurchaseDocBuilder builder = new InvoiceBuilder();
            PurchaseDocDirector director = new PurchaseDocDirector(builder);
            Invoice invoice= (Invoice) director.createInvoice(this.docId,this.buyerDataNr1, this.buyingDate,this.specificId,this.deliveryDate, this.orderData);
            singleton.addDoc(invoice);
        }

        Parent root= FXMLLoader.load(getClass().getResource("history-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
