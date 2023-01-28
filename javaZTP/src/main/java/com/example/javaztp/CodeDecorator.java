package com.example.javaztp;

public class CodeDecorator extends ComponentDecorator{
    public CodeDecorator(Component _component) {
        super(_component);
    }
    @Override
    public void calculatePrice(double extraDiscount) {
        super.calculatePrice(extraDiscount);
        System.out.println("Została nałożona zniżka rabatowa w kwocie: "+extraDiscount+ " zł");
    }
}
