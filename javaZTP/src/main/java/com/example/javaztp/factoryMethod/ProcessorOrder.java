package com.example.javaztp.factoryMethod;

public class ProcessorOrder extends Order {
    @Override
    public Component createComponent(){
        return new Processor();
    }
}
