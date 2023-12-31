package org.example.people;

import org.example.meal.Soup;

public class Customer extends Person {
    public Customer(Class soupType, String name){
        this.name = name;
        this.soupType = soupType;
    }
    private Class soupType;
    private Soup soup;

    public Soup getSoup() {
        return soup;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

    public Class getSoupType() {
        return soupType;
    }
}
