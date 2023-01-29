package com.example.javaztp.models;

import com.example.javaztp.factoryMethod.Component;
import com.example.javaztp.models.PurchaseDoc;

import java.time.LocalDate;
import java.util.ArrayList;

public class Receipt extends PurchaseDoc {
    private int receiptNr;
    public Receipt(int id, LocalDate date) {
        super(id, date);
    }
    public Receipt(){}
    public void setDetails(int receiptNr) {
        this.receiptNr = receiptNr; //np 3
    }
    public void setOrdersComponents(ArrayList<Component> _orderData) {
        this.setOrdersComponentsParent(_orderData);
    }

//    @Override
//    public void setId(int id) {
//        super.setId(id);
//    }

//    @Override
//    public void setDate(LocalDate date){
//        super.setDate(date);
//    }

//    public int getReceiptNr(){
//        return this.receiptNr;
//    }

    public String getStringReceiptNr(){
        return String.valueOf(receiptNr);
    }


}
