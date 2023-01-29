package com.example.javaztp.factoryMethod;

import com.example.javaztp.decorator.CodeDecorator;
import com.example.javaztp.decorator.SaleDecorator;

public class ComponentFactory {

    public Component getComponent(String chosenComponent, String chosenProducer, String chosenDetails, double chosenPrice, double salePrice, double codePrice){
        Order order;
        Component component = null;

        //w zalezosci od wybranego komponentu tworzymy order
        switch(chosenComponent){
            case "Karta Graficzna":
                order = new GraphicCardOrder();
                break;
            case "Procesor":
                order = new ProcessorOrder();
                break;
            case "Kontroler":
                order = new ControllerOrder();
                break;
            case "Dysk":
                order = new DiskOrder();
                break;
            case "Pamięć RAM":
                order = new RAMOrder();
                break;
            case "Płyta Główna":
                order = new MotherboardOrder();
                break;
            default:
                System.out.println("Error!!!!!UWAGA!!!");
                return component;
        }
        //nastepnie jezeli wybralismy jakas znizke wybieramy odpowiedni dekorator
        if(salePrice != 0){
            component = new SaleDecorator(order.orderComponent(chosenProducer, chosenDetails, chosenPrice));
            component.calculatePrice(salePrice);
        }
        else if(codePrice != 0){
            component = new CodeDecorator(order.orderComponent(chosenProducer, chosenDetails, chosenPrice));
            component.calculatePrice(codePrice);
        }
        else{
            component = order.orderComponent(chosenProducer, chosenDetails, chosenPrice);
        }
        return component;
    }
}
