package com.example.javaztp.factoryMethod;

public abstract class Order {
    public Component orderComponent(String chosenProducer, String chosenDetails, double chosenPrice){
        Component component = createComponent(); //utworzenie obiektu komponentu bez ustalania wartosci zmiennych
        component.prepare(chosenProducer, chosenDetails, chosenPrice); //"przygotowanie" ustalenie wartosci zmiennych obiektu jak producent, szczegoly, cena
        return component;
    }
    public abstract Component createComponent();
}
