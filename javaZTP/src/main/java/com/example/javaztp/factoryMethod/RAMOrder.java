package com.example.javaztp.factoryMethod;

public class RAMOrder extends Order {
    @Override
    public Component createComponent(){
        return new RAM();
    }
}
