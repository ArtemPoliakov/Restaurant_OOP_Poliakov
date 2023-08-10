package org.example.places;

import org.example.people.Customer;

public class Table {
    private Customer customer;
    private Integer tableNumber;

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
