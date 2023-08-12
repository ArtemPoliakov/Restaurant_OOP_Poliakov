package org.example;

import org.example.meal.FishSoup;
import org.example.meal.TomatoSoup;
import org.example.people.Customer;
import org.example.places.Table;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Table> listOfOrders = new ArrayList<>();
        KitchenRunner kitchenRunner = new KitchenRunner();

        Customer customer0 = new Customer(FishSoup.class, "Oleksiy");
        Table table0 = new Table(customer0, 0);
        listOfOrders.add(table0);


        Customer customer1 = new Customer(TomatoSoup.class, "Tomas");
        Table table1 = new Table(customer1, 1);
        listOfOrders.add(table1);

        for(Table table: listOfOrders){
        kitchenRunner.run(table);
        }
    }


}