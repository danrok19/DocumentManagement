package com.example.javaztp;

import com.example.javaztp.models.PurchaseDoc;

import java.util.ArrayList;

public class DbSingleton {
    private static DbSingleton instance;
    private ArrayList<PurchaseDoc> dataBase = new ArrayList<PurchaseDoc>();;

    private DbSingleton() {}

    public static DbSingleton getInstance() {
        //jezeli do tej pory nie zostala pobrana ani razu instancja to tworzymy
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }

    public void addDoc(PurchaseDoc doc) {
        //dodanie dokumentu do listy dokumentow
        dataBase.add(doc);
    }
    public void deleteDoc(PurchaseDoc doc){
        dataBase.remove(doc);
    }

    public ArrayList<PurchaseDoc> getBazaDanych() {
        return dataBase;
    }

}
