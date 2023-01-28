package com.example.javaztp;

public class MotherboardOrder extends Order{
    @Override
    public Component createComponent(){
        return new MotherBoard();
    }
}
