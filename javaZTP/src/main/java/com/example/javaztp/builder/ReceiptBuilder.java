package com.example.javaztp.builder;

import com.example.javaztp.factoryMethod.Component;
import com.example.javaztp.models.Details;
import com.example.javaztp.models.PurchaseDoc;
import com.example.javaztp.models.Receipt;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReceiptBuilder implements PurchaseDocBuilder {

    private Receipt receipt;
    public ReceiptBuilder(){
        receipt = new Receipt();
    }

    @Override
    public void setId(int id){
        this.receipt.setId(id);
    } //glowne id dokumentu
    @Override
    public void setDate(LocalDate date){
        this.receipt.setDate(date);
    } //data zakupu
    @Override
    public void setDetails(Details details){
        this.receipt.setDetails(details.getReceiptNr());
    } //id dla juz danego paragonu

    @Override
    public void setOrdersComponents(ArrayList<Component> orderData) {
        this.receipt.setOrdersComponents(orderData);
    } //lista zakupionych komponentow

    @Override
    public PurchaseDoc getBuild(){
        return this.receipt;
    }

}
