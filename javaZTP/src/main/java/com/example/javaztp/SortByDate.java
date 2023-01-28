package com.example.javaztp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByDate implements SortStrategy{
    public ArrayList<PurchaseDoc> sort(ArrayList<PurchaseDoc> documents){
        documents.sort(Comparator.comparing(PurchaseDoc::getDate));
        return documents;
    }

}
