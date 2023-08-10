package org.example.people;

import org.example.meal.FishSoup;
import org.example.meal.Soup;
import org.example.meal.TomatoSoup;

public class Cook extends Person {
    private Soup soup;

    public void cookFishSoup() {
        soup = new FishSoup();
        processSoup(soup);
    }
    
    public void cookTomatoSoup() {
        soup = new TomatoSoup();
        processSoup(soup);
    }

    public Soup getFishSoup() {
        if (soup != null && soup instanceof FishSoup) {
            return soup;
        }
        return null;
    }

    public Soup getTomatoSoup() {
        if (soup != null && soup instanceof TomatoSoup) {
            return soup;
        }
        return null;
    }

    private void processSoup(Soup soup) {
        String message = String.format("%s is cooking %s",
                name,
                soup.getClass().getSimpleName());
        System.out.println(message);
        soup.cookSoup();
    }
}
