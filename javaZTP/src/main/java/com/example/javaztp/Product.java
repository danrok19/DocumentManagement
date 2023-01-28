package com.example.javaztp;

public class Product {
    private String name;
    private double price;
    private double discount;
    public Product(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public double getDiscount(){
        return this.discount;
    }
}
