package com.example.javaztp;

public class DiskOrder extends Order{
    @Override
    public Component createComponent(){
        return new Disk();
    }
}
