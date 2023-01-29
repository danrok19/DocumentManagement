package com.example.javaztp.factoryMethod;

public interface Component {

    void prepare(String producer, String details,double _price);//ustalenie wartosci zmiennych obiektu
    void calculatePrice(double extraDiscount); //znizka na cene komponentu
    String getName();
    String getProducer();

    String getDetails();
    double getPrice();
    double getDiscount();
}
