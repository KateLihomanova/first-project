package practice_5.task3;

public class HotDish extends Dish {
    private double temperature = 40.4;

    @Override
    public void getDescription() {
        System.out.println("Горячее блюдо — с температурой " + temperature);
    }
}
