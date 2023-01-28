package com.example.javaztp;

public abstract class Order {
    public Component orderComponent(String chosenProducer, String chosenDetails,double chosenPrice){
        Component component = createComponent();
        component.prepare(chosenProducer, chosenDetails, chosenPrice);
        return component;
    }
    public abstract Component createComponent();
}
