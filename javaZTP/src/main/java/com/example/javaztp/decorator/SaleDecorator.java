package com.example.javaztp.decorator;

import com.example.javaztp.decorator.ComponentDecorator;
import com.example.javaztp.factoryMethod.Component;

public class SaleDecorator extends ComponentDecorator {

    public SaleDecorator(Component _component) {
        super(_component);
    }

    @Override
    public void calculatePrice(double extraDiscount) {
        super.calculatePrice(extraDiscount);
        System.out.println("Została nałożona zniżka wyprzedarzowa w kwocie: "+extraDiscount+ " zł");
    }
}
