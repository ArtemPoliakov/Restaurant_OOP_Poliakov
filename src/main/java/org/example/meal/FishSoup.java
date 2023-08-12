package org.example.meal;

public class FishSoup extends Soup {
    @Override
    protected void addCustomIngredient() {
        System.out.println("Add Fish");
    }
    @Override
    public String toString(){
        return "FishSoup";
    }
}
