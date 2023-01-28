package com.example.javaztp;

public class SaleDecorator extends ComponentDecorator{

    public SaleDecorator(Component _component) {
        super(_component);
    }

    @Override
    public void calculatePrice(double extraDiscount) {
        super.calculatePrice(extraDiscount);
        System.out.println("Została nałożona zniżka wyprzedarzowa w kwocie: "+extraDiscount+ " zł");
    }
}
