package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class PurchaseDocDirector {
    private PurchaseDocBuilder builder;
    PurchaseDocDirector(PurchaseDocBuilder builder) {
        this.builder = builder;
    }

    public PurchaseDoc createReceipt(int id, String buyerData, LocalDate date, int receiptNr, ArrayList<Component> orderData) {
        Details details = new Details(receiptNr);
        this.builder.setId(id);
        System.out.println("setId zatwierdzone!");
        this.builder.setBuyerData(buyerData);
        System.out.println("setBuyerData zatwierdzone!");
        this.builder.setDate(date);
        System.out.println("setDate zatwierdzone!");
        this.builder.setDetails(details);
        System.out.println("setDetails zatwierdzone!");
        this.builder.setOrdersComponents(orderData);
        return this.builder.getBuild();
    }

    public PurchaseDoc createInvoice(int id, String buyerData, LocalDate date, int invoiceNr, LocalDate finalDate, ArrayList<Component> orderData) {
        Details details = new Details(invoiceNr, finalDate);
        this.builder.setId(id);
        System.out.println("setId zatwierdzone!");
        this.builder.setBuyerData(buyerData);
        System.out.println("setBuyerData zatwierdzone!");
        this.builder.setDate(date);
        System.out.println("setDate zatwierdzone!");
        this.builder.setDetails(details);
        System.out.println("setDetails zatwierdzone!");
        this.builder.setOrdersComponents(orderData);
        return this.builder.getBuild();
    }


}
