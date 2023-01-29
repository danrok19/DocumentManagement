package com.example.javaztp.models;

import com.example.javaztp.factoryMethod.Component;

import java.time.LocalDate;
import java.util.ArrayList;

public class PurchaseDoc {
    private int id;
    private LocalDate date;

    private ArrayList<Component> orderData;
    private double nettoPrice = 0;
    private double bruttoPrice = 0;
    private double discount = 0.0;
    PurchaseDoc(){}

    public PurchaseDoc(int id, LocalDate date) {
        this.id = id;
        this.date = date; // data wystawienia
    }
    public void setOrdersComponentsParent(ArrayList<Component> _orderData) {
        this.orderData=_orderData;
        for(int i = 0; i < this.orderData.size(); i++){
            this.bruttoPrice += this.orderData.get(i).getPrice();
            this.nettoPrice += (this.orderData.get(i).getPrice() * 0.77);
            this.discount +=(_orderData.get(i).getDiscount());
        }
    }

    public int getId(){
        return this.id;
    }
    public String getStringId(){
        return String.valueOf(id);
    }

    public LocalDate getDate(){
        return this.date;
    }

    public void setId(int id){
        this.id= id;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public String getNettoPrice(){
        return String.valueOf(nettoPrice);
    }
    public String getBruttoPrice(){
        return String.valueOf(bruttoPrice);
    }
    public ArrayList<Component> getOrderData(){
        return this.orderData;
    }
    public String getDiscount(){return String.valueOf(discount);}
}
