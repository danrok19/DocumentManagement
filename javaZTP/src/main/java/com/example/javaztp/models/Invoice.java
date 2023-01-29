package com.example.javaztp.models;

import com.example.javaztp.factoryMethod.Component;
import com.example.javaztp.models.PurchaseDoc;

import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice extends PurchaseDoc {
    private int invoiceNr;
    private LocalDate finalDate;

    private String buyerData;
    private double tax = 0.0;

    public Invoice(int id, LocalDate date) {
        super(id, date);
    }
    public Invoice(){}
    public void setDetails(int invoiceNr, LocalDate finalDate, String buyerData) {
        this.invoiceNr = invoiceNr; //np 03/11/2022
        this.finalDate = finalDate; // data dokonania/zakończenia dostawy lub świadczenia usług
        this.buyerData = buyerData; //dane kupującego
    }
    public void setOrdersComponents(ArrayList<Component> _orderData) {
        for(int i = 0; i< _orderData.size(); i++){
            this.tax += (_orderData.get(i).getPrice() * 0.23);
        }

        this.setOrdersComponentsParent(_orderData);
    }
    public String getStringInvoiceNr(){
        return String.valueOf(invoiceNr);
    }
    public LocalDate getFinalDate(){
        return this.finalDate;
    }

    public String getTax(){
        return String.valueOf(this.tax);
    }
    public String getBuyerData(){
        return this.buyerData;
    }

}
