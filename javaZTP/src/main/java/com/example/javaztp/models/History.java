package com.example.javaztp.models;

import com.example.javaztp.DbSingleton;
import com.example.javaztp.strategy.SortStrategy;

import java.util.ArrayList;

public class History {
    private SortStrategy strategy;
    private ArrayList<PurchaseDoc> docs;
    private DbSingleton dbSingleton;
    public History(){
        dbSingleton = DbSingleton.getInstance();
        docs = dbSingleton.getBazaDanych();
    }

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortDocuments() {
        strategy.sort(docs);
    }
    public ArrayList<PurchaseDoc> getDocs(){
        return this.docs;
    }
    public void deleteDoc(PurchaseDoc doc){
        docs.remove(doc);
        dbSingleton.deleteDoc(doc);
    }
}
