package com.example.javaztp.factoryMethod;

import com.example.javaztp.factoryMethod.Component;

public class Controller implements Component {

    private String name;
    private String producer;
    private String details;
    private double price;
    private double discount;
    @Override
    public void prepare(String _producer, String _details, double _price) {
        this.name = "Controller";
        this.producer = _producer;
        this.details = _details;
        this.price = _price;
    }

    public void calculatePrice(double extraDiscount){
        this.price -=extraDiscount;
        this.discount = extraDiscount;
    }

    public String getName(){
        return this.name;
    }
    public String getProducer(){
        return this.producer;
    }
    public String getDetails(){
        return this.details;
    }
    public double getPrice(){
        return this.price;
    }
    public double getDiscount(){return this.discount;}
}
