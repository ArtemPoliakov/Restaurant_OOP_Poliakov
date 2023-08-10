package org.example;

import org.example.people.Cook;
import org.example.people.Waiter;
import org.example.places.Kitchen;
import org.example.places.Table;

public class Application {
    private Kitchen kitchen = new Kitchen();
    private Cook cook = new Cook();
    private Waiter waiter = new Waiter();

    public void makeOrder(Table table, Class soupType) {
        kitchen.setCook(cook);
        kitchen.setWaiter(waiter);
        cook.setName("Oleg");

        waiter.receiveOrder(table, soupType);

        kitchen.processOrder();
        kitchen.receiveOrderFromCook();

        table.getCustomer().setSoup(waiter.deliveryOrderToCustomer());
    }
}
