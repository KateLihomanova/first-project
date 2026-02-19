package practice_prog_principles.task6;

public class FlyingBird extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void makeSound() {
        System.out.println("Чирикает");
    }
}
