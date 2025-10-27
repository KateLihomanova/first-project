package practice_5.task3;

public class Main {
    public static void main(String[] args) {
        Menu newMenu = new Menu();
        Dish soup = new HotDish();
        newMenu.addDish(soup);
        Dish tea = new Drink();
        newMenu.addDish(tea);
        newMenu.printMenu();


    }


}
