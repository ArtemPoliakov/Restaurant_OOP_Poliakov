package org.example.meal;

public abstract class Soup {
    public void cookSoup() {
        System.out.println("Boil water");
        System.out.println("Add vegetables");
        addCustomIngredient();
        System.out.printf("%s is ready \n", this.getClass().getSimpleName());
    }

    protected abstract void addCustomIngredient();

}
