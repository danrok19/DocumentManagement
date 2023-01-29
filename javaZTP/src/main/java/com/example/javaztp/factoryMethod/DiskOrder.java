package com.example.javaztp.factoryMethod;

public class DiskOrder extends Order {
    @Override
    public Component createComponent(){
        return new Disk();
    }
}
