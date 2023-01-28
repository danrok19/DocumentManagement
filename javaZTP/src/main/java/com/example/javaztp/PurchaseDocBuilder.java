package com.example.javaztp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public interface PurchaseDocBuilder {

    void setId(int id);
    void setBuyerData(String buyerData);
    void setDate(LocalDate date);
    void setDetails(Details details);

    void setOrdersComponents(ArrayList<Component> orderData);
    PurchaseDoc getBuild();
}
