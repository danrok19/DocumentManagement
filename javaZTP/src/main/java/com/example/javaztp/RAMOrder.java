package com.example.javaztp;

public class RAMOrder extends Order{
    @Override
    public Component createComponent(){
        return new RAM();
    }
}
