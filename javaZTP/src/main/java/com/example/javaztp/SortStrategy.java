package com.example.javaztp;

import java.util.ArrayList;
import java.util.List;

public interface SortStrategy {
    ArrayList<PurchaseDoc> sort(ArrayList<PurchaseDoc> documents);
}
