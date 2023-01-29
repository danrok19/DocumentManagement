package com.example.javaztp.factoryMethod;

public class ControllerOrder extends Order {
    @Override
    public Component createComponent(){
        return new Controller();
    }
}
