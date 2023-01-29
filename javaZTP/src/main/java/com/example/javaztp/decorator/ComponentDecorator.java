package com.example.javaztp.decorator;

import com.example.javaztp.factoryMethod.Component;

public abstract class ComponentDecorator implements Component {
    private Component wrapiee;
    public ComponentDecorator(Component _component){
        this.wrapiee = _component;
    } //wybor komponentu
    @Override
    public void calculatePrice(double extraDiscount){
        this.wrapiee.calculatePrice(extraDiscount);
    }

    @Override
    public void prepare(String producer, String details, double _price) {
    }

    @Override
    public String getName() {
        return wrapiee.getName();
    }

    @Override
    public String getProducer() {
        return wrapiee.getProducer();
    }

    @Override
    public String getDetails() {
        return wrapiee.getDetails();
    }

    @Override
    public double getPrice() {
        return wrapiee.getPrice();
    }
    @Override
    public double getDiscount(){return wrapiee.getDiscount();};
}
