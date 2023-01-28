package com.example.javaztp;

import java.time.LocalDate;
import java.util.Date;

public class Details {

    private int receiptNr;
    private int invoiceNr;
    private LocalDate finalDate;

    Details(int receiptNr){
        this.receiptNr = receiptNr;
    }
    Details(int invoiceNr, LocalDate finalDate){
        this.invoiceNr = invoiceNr;
        this.finalDate = finalDate;
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

}
