package org.example.people;

import org.example.meal.Soup;

public class Customer extends Person {
    private Soup soup;

    public Soup getSoup() {
        return soup;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }
}
