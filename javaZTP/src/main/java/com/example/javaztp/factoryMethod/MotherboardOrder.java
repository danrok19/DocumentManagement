package com.example.javaztp.factoryMethod;

public class MotherboardOrder extends Order {
    @Override
    public Component createComponent(){
        return new MotherBoard();
    }
}
