package practice_5.task1;

public class Zoo {
    private Animal newAnimal;

    public void setNewAnimal(Animal newAnimal) {
        this.newAnimal = newAnimal;
    }

    public void showAnimalBahavior() {
        this.newAnimal.makeSound();
        this.newAnimal.move();
    }
}
