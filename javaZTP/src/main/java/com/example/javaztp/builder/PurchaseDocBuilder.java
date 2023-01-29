package com.example.javaztp.builder;

import com.example.javaztp.factoryMethod.Component;
import com.example.javaztp.models.Details;
import com.example.javaztp.models.PurchaseDoc;

import java.time.LocalDate;
import java.util.ArrayList;

public interface PurchaseDocBuilder {

    void setId(int id);
    void setDate(LocalDate date);
    void setDetails(Details details);

    void setOrdersComponents(ArrayList<Component> orderData);
    PurchaseDoc getBuild();
}
