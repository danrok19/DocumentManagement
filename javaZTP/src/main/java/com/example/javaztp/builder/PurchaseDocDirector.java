package com.example.javaztp.builder;

import com.example.javaztp.factoryMethod.Component;
import com.example.javaztp.models.Details;
import com.example.javaztp.models.PurchaseDoc;

import java.time.LocalDate;
import java.util.ArrayList;

public class PurchaseDocDirector {
    private PurchaseDocBuilder builder;
    public PurchaseDocDirector(PurchaseDocBuilder builder) {
        this.builder = builder;
    }

    public PurchaseDoc createReceipt(int id, LocalDate date, int receiptNr, ArrayList<Component> orderData) {
        Details details = new Details(receiptNr);
        this.builder.setId(id);
        System.out.println("setId zatwierdzone!");
        this.builder.setDate(date);
        System.out.println("setDate zatwierdzone!");
        this.builder.setDetails(details);
        System.out.println("setDetails zatwierdzone!");
        this.builder.setOrdersComponents(orderData);
        return this.builder.getBuild();
    }

    public PurchaseDoc createInvoice(int id, String buyerData, LocalDate date, int invoiceNr, LocalDate finalDate, ArrayList<Component> orderData) {
        Details details = new Details(invoiceNr, finalDate,buyerData);
        this.builder.setId(id);
        System.out.println("setId zatwierdzone!");
        this.builder.setDate(date);
        System.out.println("setDate zatwierdzone!");
        this.builder.setDetails(details);
        System.out.println("setDetails zatwierdzone!");
        this.builder.setOrdersComponents(orderData);
        return this.builder.getBuild();
    }


}
