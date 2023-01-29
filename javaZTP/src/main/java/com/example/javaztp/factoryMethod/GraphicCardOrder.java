package com.example.javaztp.factoryMethod;

public class GraphicCardOrder extends Order {
    @Override
    public Component createComponent(){
        return new GraphicCard();
    }
}
