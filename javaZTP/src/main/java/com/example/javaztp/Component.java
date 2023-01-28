package com.example.javaztp;

public interface Component {

    void prepare(String producer, String details,double _price);
    void calculatePrice(double extraDiscount);
    String getName();
    String getProducer();

    String getDetails();
    double getPrice();
}
