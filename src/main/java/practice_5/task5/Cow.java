package practice_5.task5;

public class Cow extends FarmAnimal{
    @Override
    public void feed() {
        System.out.println("Корова ест траву");
    }
    @Override
    public void care() {
        System.out.println("Корова требует выпаса");
    }
    @Override
    public void produce() {
        System.out.println("Корова даёт молоко");
    }

}
