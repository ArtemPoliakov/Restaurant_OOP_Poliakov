package org.example.people;

import org.example.meal.Soup;
import org.example.places.Table;

public class Waiter extends Person {
    private Table table;
    private Class soupType;
    private Soup soup;

    public void receiveOrder(Table table, Class soupType) {
        this.table = table;
        this.soupType = soupType;
    }

    // Overloading
    public void receiveOrder(Soup soup) {
       this.soup = soup;
    }

    public Class getOrderToKitchen() {
        return soupType;
    }

    public Soup deliveryOrderToCustomer() {
        Soup order = soup;
        soup = null;
        return order;
    }
}
