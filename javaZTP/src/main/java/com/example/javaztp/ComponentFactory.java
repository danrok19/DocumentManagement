package com.example.javaztp;

public class ComponentFactory {
    public Component getComponent(String chosenComponent, String chosenProducer, String chosenDetails, double chosenPrice, double salePrice, double codePrice){
        Order order;
        Component component = null;
        switch(chosenComponent){
            case "Karta Graficzna":
                order = new GraphicCardOrder();
                if(salePrice != 0){
                    component = new SaleDecorator(order.orderComponent(chosenProducer, chosenDetails, chosenPrice));
                    component.calculatePrice(salePrice);
                }
                if(codePrice != 0){
                    component = new CodeDecorator(order.orderComponent(chosenProducer, chosenDetails, chosenPrice));
                    component.calculatePrice(codePrice);
                }

                break;
            case "Procesor":
                order = new ProcessorOrder();
                component = order.orderComponent(chosenProducer, chosenDetails, chosenPrice);
                break;
            case "Kontroler":
                order = new ControllerOrder();
                component = order.orderComponent(chosenProducer, chosenDetails, chosenPrice);
                break;
            case "Dysk":
                order = new DiskOrder();
                component = order.orderComponent(chosenProducer, chosenDetails, chosenPrice);
                break;
            case "Pamięć RAM":
                order = new RAMOrder();
                component = order.orderComponent(chosenProducer, chosenDetails, chosenPrice);
                break;
            case "Płyta Główna":
                order = new MotherboardOrder();
                component = order.orderComponent(chosenProducer, chosenDetails, chosenPrice);
                break;
            default:
                System.out.println("Error!!!!!UWAGA!!!");
        }
        return component;
    }
}
