package com.example.javaztp.builder;

import com.example.javaztp.factoryMethod.Component;
import com.example.javaztp.models.Details;
import com.example.javaztp.models.Invoice;
import com.example.javaztp.models.PurchaseDoc;

import java.time.LocalDate;
import java.util.ArrayList;

public class InvoiceBuilder implements PurchaseDocBuilder {
    private Invoice invoice;
    public InvoiceBuilder(){
        invoice = new Invoice();
    }

    @Override
    public void setId(int id){
        this.invoice.setId(id);
    } //glowne id dokumentu

    @Override
    public void setDate(LocalDate date){
        this.invoice.setDate(date);
    } //data zakupu
    @Override
    public void setDetails(Details details){
        this.invoice.setDetails(details.getInvoiceNr(), details.getFinalDate(), details.getBuyerData());
    } //id juz danej faktury, data dostarczenia zamowienia, dane kupującego
    @Override
    public void setOrdersComponents(ArrayList<Component> orderData) {
        this.invoice.setOrdersComponents(orderData);
    }//lista zamowionych komponentow
    @Override
    public PurchaseDoc getBuild(){
        return this.invoice;
    }
}
