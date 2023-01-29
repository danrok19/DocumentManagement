package com.example.javaztp.models;

import java.time.LocalDate;
import java.util.Date;

public class Details {

    private int receiptNr;
    private int invoiceNr;
    private LocalDate finalDate;
    private String buyerData;

    public Details(int receiptNr){
        this.receiptNr = receiptNr;
    }
    public Details(int invoiceNr, LocalDate finalDate, String buyerData){
        this.invoiceNr = invoiceNr;
        this.finalDate = finalDate;
        this.buyerData = buyerData;
    }

    public int getReceiptNr(){
        return this.receiptNr;
    }
    public int getInvoiceNr(){
        return this.invoiceNr;
    }
    public LocalDate getFinalDate(){
        return this.finalDate;
    }
    public String getBuyerData(){return this.buyerData;}

}
