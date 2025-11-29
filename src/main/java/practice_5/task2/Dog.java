package practice_5.task2;

public class Dog extends Pet{
    @Override
    public void feed() {
        System.out.println("ест сухой корм");
    }

    @Override
    public void interwork() {
        System.out.println("гуляет");
    }
}
