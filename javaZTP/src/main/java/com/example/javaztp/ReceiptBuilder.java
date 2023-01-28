package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ReceiptBuilder implements PurchaseDocBuilder{

    private Receipt receipt;
    ReceiptBuilder(){
        receipt = new Receipt();
    }

    @Override
    public void setId(int id){
        this.receipt.setId(id);
    }
    @Override
    public void setBuyerData(String buyerData){
        this.receipt.setBuyerData(buyerData);
    }
    @Override
    public void setDate(LocalDate date){
        this.receipt.setDate(date);
    }
    @Override
    public void setDetails(Details details){
        this.receipt.setDetails(details.getReceiptNr());
    }

    @Override
    public void setOrdersComponents(ArrayList<Component> orderData) {
        this.receipt.setOrdersComponents(orderData);
    }

    @Override
    public PurchaseDoc getBuild(){
        return this.receipt;
    }

}
