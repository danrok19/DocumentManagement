package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceBuilder implements PurchaseDocBuilder{
    private Invoice invoice;
    InvoiceBuilder(){
        invoice = new Invoice();
    }

    @Override
    public void setId(int id){
        this.invoice.setId(id);
    }
    @Override
    public void setBuyerData(String buyerData){
        this.invoice.setBuyerData(buyerData);
    }
    @Override
    public void setDate(LocalDate date){
        this.invoice.setDate(date);
    }
    @Override
    public void setDetails(Details details){
        this.invoice.setDetails(details.getInvoiceNr(), details.getFinalDate());
    }
    @Override
    public void setOrdersComponents(ArrayList<Component> orderData) {
        this.invoice.setOrdersComponentsParent(orderData);
    }
    @Override
    public PurchaseDoc getBuild(){
        return this.invoice;
    }
}
