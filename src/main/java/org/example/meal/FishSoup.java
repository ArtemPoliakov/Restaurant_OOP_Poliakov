package org.example.meal;

public class FishSoup extends Soup {
    @Override
    protected void addCustomIngredient() {
        System.out.println("Add Fish");
    }
}
