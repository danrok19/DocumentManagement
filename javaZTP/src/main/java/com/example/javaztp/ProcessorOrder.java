package com.example.javaztp;

public class ProcessorOrder extends Order{
    @Override
    public Component createComponent(){
        return new Processor();
    }
}
