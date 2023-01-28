package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice extends PurchaseDoc{
    private int invoiceNr;
    private LocalDate finalDate;
    private double tax;
    private double discounts;

    Invoice(int id, String buyerData, LocalDate date) {
        super(id, buyerData, date);
    }
    Invoice(){}
    public void setDetails(int invoiceNr, LocalDate finalDate) {
        this.invoiceNr = invoiceNr; //np 03/11/2022
        this.finalDate = finalDate; // data dokonania/zakończenia dostawy lub świadczenia usług
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
}
