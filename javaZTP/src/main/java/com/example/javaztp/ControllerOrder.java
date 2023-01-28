package com.example.javaztp;

public class ControllerOrder extends Order{
    @Override
    public Component createComponent(){
        return new Controller();
    }
}
