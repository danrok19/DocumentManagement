package com.example.javaztp.strategy;

import com.example.javaztp.models.PurchaseDoc;

import java.util.ArrayList;

public interface SortStrategy {
    ArrayList<PurchaseDoc> sort(ArrayList<PurchaseDoc> documents);
}
