package com.example.javaztp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortById implements SortStrategy{
    public ArrayList<PurchaseDoc> sort(ArrayList<PurchaseDoc> documents){
        documents.sort(Comparator.comparing(PurchaseDoc::getId));
        return documents;
    }
}
