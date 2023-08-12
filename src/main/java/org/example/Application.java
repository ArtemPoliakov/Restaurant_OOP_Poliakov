package org.example;

import org.example.meal.TomatoSoup;
import org.example.people.Cook;
import org.example.people.Customer;
import org.example.people.Waiter;
import org.example.places.Kitchen;
import org.example.places.Table;

public class Application {
    private Kitchen kitchen = new Kitchen();
    private Cook cook;
    private Waiter waiter;
    public Application(Cook cook, String cookName, Waiter waiter, String waiterName){
        this.cook = cook;
        this.cook.setName(cookName);
        this.waiter = waiter;
        this.waiter.setName(waiterName);
        kitchen.setCook(this.cook);
        kitchen.setWaiter(this.waiter);
    }

    public void makeOrder(Table table, Class soupType) {

        waiter.receiveOrder(table, soupType);
        System.out.printf("%s has received the order from %s, table %s \n", waiter.getName(), table.getCustomer().getName(), table.getTableNumber());
        System.out.printf("%s has delivered the order to %s \n", waiter.getName(), cook.getName());

        kitchen.processOrder();
        kitchen.receiveOrderFromCook();

        table.getCustomer().setSoup(waiter.deliveryOrderToCustomer());
        System.out.printf("%s has delivered %s to %s, table %s \n", waiter.getName(), soupType.getSimpleName(),
                            table.getCustomer().getName(), table.getTableNumber());
    }
}
