package practice_5.task3;

import java.util.ArrayList;

public class Menu {
    ArrayList<Dish> list = new ArrayList<>();



    public void addDish(Dish newDish) {
        list.add(newDish);
    }

    public void printMenu() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getDescription();
        }

    }
}
