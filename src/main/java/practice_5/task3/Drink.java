package practice_5.task3;

public class Drink extends Dish{
    private int volume = 450;
    @Override
    public void getDescription() {
        System.out.println("Напиток — с объёмом " + volume + " мл.");
    }

}
