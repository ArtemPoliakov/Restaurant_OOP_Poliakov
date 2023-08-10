package org.example;

import org.example.meal.TomatoSoup;
import org.example.people.Customer;
import org.example.places.Table;

public class KitchenRunner {
    Application application = new Application();

    public void run() {
        Customer customer = new Customer();

        Table table = new Table();
        table.setCustomer(customer);
        table.setTableNumber(1);

        application.makeOrder(table, TomatoSoup.class);

        System.out.println("customer.getSoup() = " + customer.getSoup());
    }
}
