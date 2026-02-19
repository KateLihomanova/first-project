package practice_prog_principles.task6;

public class Eagle extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Орёл парит высоко над землёй");
    }

    @Override
    public void makeSound() {
        System.out.println("Скрипучий крик орла");
    }
}
