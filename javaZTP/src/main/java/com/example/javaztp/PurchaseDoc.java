package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class PurchaseDoc {
    private int id;
    private String buyerData;
    private LocalDate date;

    private ArrayList<Component> orderData;
    private double nettoPrice = 0;
    private double bruttoPrice = 0;
    PurchaseDoc(){}

    PurchaseDoc(int id,String buyerData, LocalDate date) {
        this.id = id;
        this.buyerData = buyerData;
        this.date = date; // data wystawienia
    }
    public void setOrdersComponentsParent(ArrayList<Component> _orderData) {
        this.orderData=_orderData;
        for(int i = 0; i < this.orderData.size(); i++){
            this.bruttoPrice += this.orderData.get(i).getPrice();
            this.nettoPrice += (this.orderData.get(i).getPrice() * 0.77);
        }
    }

    public int getId(){
        return this.id;
    }
    public String getStringId(){
        return String.valueOf(id);
    }
    public String getBuyerData(){
        return this.buyerData;
    }
    public LocalDate getDate(){
        return this.date;
    }

    public void setId(int id){
        this.id= id;
    }
    public void setBuyerData(String buyerData){
        this.buyerData= buyerData;
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
}
