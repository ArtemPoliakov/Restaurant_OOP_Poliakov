package org.example.meal;

public class TomatoSoup extends Soup {
    @Override
    protected void addCustomIngredient() {
        System.out.println("Add tomato");
    }
}
