package com.example.javaztp;

public class GraphicCardOrder extends Order{
    @Override
    public Component createComponent(){
        return new GraphicCard();
    }
}
