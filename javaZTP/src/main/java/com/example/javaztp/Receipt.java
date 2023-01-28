package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Receipt extends PurchaseDoc{
    private int receiptNr;
    Receipt(int id, String buyerData, LocalDate date) {
        super(id, buyerData, date);
    }
    Receipt(){}
    public void setDetails(int receiptNr) {
        this.receiptNr = receiptNr; //np 3
    }
    public void setOrdersComponents(ArrayList<Component> _orderData) {
        this.setOrdersComponentsParent(_orderData);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }
    @Override
    public void setBuyerData(String buyerData){
        super.setBuyerData(buyerData);
    }

    @Override
    public void setDate(LocalDate date){
        super.setDate(date);
    }

    public int getReceiptNr(){
        return this.receiptNr;
    }

    public String getStringReceiptNr(){
        return String.valueOf(receiptNr);
    }

}
