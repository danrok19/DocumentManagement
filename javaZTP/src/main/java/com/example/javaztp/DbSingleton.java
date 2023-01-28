package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class DbSingleton {
    private static DbSingleton instance;
    private ArrayList<PurchaseDoc> bazaDanych;

    DbSingleton() {
        bazaDanych = new ArrayList<PurchaseDoc>();
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }

    public void addDoc(PurchaseDoc doc) {
        bazaDanych.add(doc);
    }

    public ArrayList<PurchaseDoc> getBazaDanych() {
        return bazaDanych;
    }
}
