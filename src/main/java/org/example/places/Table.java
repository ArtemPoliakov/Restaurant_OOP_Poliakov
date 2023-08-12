package org.example.places;

import org.example.people.Customer;

public class Table {
    private Customer customer;
    private Integer tableNumber;

    public Table(Customer customer, Integer tableNumber){
        this.customer = customer;
        this.tableNumber = tableNumber;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
