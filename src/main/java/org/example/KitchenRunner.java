package org.example;

import org.example.meal.TomatoSoup;
import org.example.people.Cook;
import org.example.people.Customer;
import org.example.people.Waiter;
import org.example.places.Table;

public class KitchenRunner {
    Cook cook = new Cook();
    Waiter waiter = new Waiter();
    Application application = new Application(cook,"Oleg",waiter,"Oksana");

    public void run(Table table) {
        Customer customer = table.getCustomer();

        application.makeOrder(table, customer.getSoupType());

        System.out.println("customer.getSoup() = " + customer.getSoup() + "\n\n\n");
    }
}
