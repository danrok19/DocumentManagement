package com.example.javaztp;

import com.example.javaztp.models.Invoice;
import com.example.javaztp.models.PurchaseDoc;
import com.example.javaztp.models.Receipt;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PurchaseDocController{
    private Receipt docR = null;
    private Invoice docI = null;
    private String orderData = "";

    public PurchaseDocController(){}

    public void setDoc(PurchaseDoc _doc){
        if(_doc.getClass() == Receipt.class){
            this.docR=(Receipt) _doc;
            for(int i = 0 ;i<docR.getOrderData().size();i++){
                this.orderData += docR.getOrderData().get(i).getName() + " " +docR.getOrderData().get(i).getPrice() + "\n";
            }
            fillFields();
        }
        else{
            this.docI=(Invoice) _doc;
            for(int i = 0 ;i<docI.getOrderData().size();i++){
                this.orderData += docI.getOrderData().get(i).getName() + " " +docI.getOrderData().get(i).getPrice() + "\n";
            }
            fillFields();
        }
    }


    @FXML
    private Label docType;
    @FXML
    private Label issueDate;
    @FXML
    private Label executeDate;
    @FXML
    private Label docNr;
    @FXML
    private Label buyerData;
    @FXML
    private Label nettoPrice;
    @FXML
    private Label vatPrice;
    @FXML
    private Label bruttoPrice;
    @FXML
    private Label listView;
    @FXML
    private Label buyerLabel;

    @FXML
    private Label signLineBuyer;
    @FXML
    private Label signLineSeller;

    @FXML
    private Label discountLabel;
    @FXML
    private Label discountLabelUnder;

    @FXML
    private Label signBuyer;
    @FXML
    private Label signSeller;

    public void fillFields(){
        if(this.docR != null){
            docType.setText("Paragon");
            buyerLabel.setVisible(false);
            buyerData.setVisible(false);
            issueDate.setText(docR.getDate().toString());
            executeDate.setText("--------");
            docNr.setText(docR.getStringReceiptNr());
            nettoPrice.setText(docR.getNettoPrice());
            bruttoPrice.setText(docR.getBruttoPrice());
            vatPrice.setText("23%");
            listView.setText(this.orderData);
            discountLabel.setText("Zniżka");
            discountLabelUnder.setText(docR.getDiscount());
            signLineBuyer.setVisible(false);
            signLineSeller.setVisible(false);
            signBuyer.setVisible(false);
            signSeller.setVisible(false);
            discountLabel.setVisible(true);
            discountLabelUnder.setVisible(true);
        }
        else if(this.docI != null){
            docType.setText("Faktura");
            issueDate.setText(docI.getDate().toString());
            executeDate.setText(docI.getFinalDate().toString());
            docNr.setText(docI.getStringInvoiceNr());
            buyerData.setText(docI.getBuyerData());
            nettoPrice.setText(docI.getNettoPrice());
            bruttoPrice.setText(docI.getBruttoPrice());
            vatPrice.setText(docI.getTax());
            listView.setText(this.orderData);
            discountLabel.setText("Zniżka");
            discountLabelUnder.setText(docI.getDiscount());
            signLineBuyer.setVisible(true);
            signLineSeller.setVisible(true);
            signBuyer.setVisible(true);
            signSeller.setVisible(true);
            discountLabel.setVisible(true);
            discountLabelUnder.setVisible(true);
        }
    }


}
