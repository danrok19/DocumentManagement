package com.example.javaztp.strategy;

import com.example.javaztp.models.PurchaseDoc;

import java.util.ArrayList;
import java.util.Comparator;

public class SortByDate implements SortStrategy {
    public ArrayList<PurchaseDoc> sort(ArrayList<PurchaseDoc> documents){
        documents.sort(Comparator.comparing(PurchaseDoc::getDate));
        return documents;
    }

}
