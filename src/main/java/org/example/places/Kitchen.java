package org.example.places;

import org.example.meal.FishSoup;
import org.example.meal.Soup;
import org.example.meal.TomatoSoup;
import org.example.people.Cook;
import org.example.people.Waiter;

public class Kitchen {
    private Cook cook;
    private Waiter waiter;

    public void processOrder() {
        Class orderToKitchen = waiter.getOrderToKitchen();
        if (orderToKitchen.equals(TomatoSoup.class)) {
            cook.cookTomatoSoup();
        } else if (orderToKitchen.equals(FishSoup.class)) {
            cook.cookFishSoup();
        } else {
            System.out.println("Incorrect type");
        }
    }

    public void receiveOrderFromCook() {
        Soup tomatoSoup = cook.getTomatoSoup();
        Soup fishSoup = cook.getFishSoup();

        if (tomatoSoup != null) {
            waiter.receiveOrder(tomatoSoup);
        } else if (fishSoup != null) {
            waiter.receiveOrder(fishSoup);
        } else {
            System.out.println("Incorrect type");
        }
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}
