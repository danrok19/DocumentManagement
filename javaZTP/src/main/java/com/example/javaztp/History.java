package com.example.javaztp;

import java.util.ArrayList;
import java.util.List;

public class History {
    private SortStrategy strategy;
    private ArrayList<PurchaseDoc> docs;
    History(){}

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortDocuments() {
        strategy.sort(docs);
    }
    public void setDocuments(ArrayList<PurchaseDoc> docs){
        this.docs = docs;
    }
    public ArrayList<PurchaseDoc> getDocs(){
        return this.docs;
    }
}
