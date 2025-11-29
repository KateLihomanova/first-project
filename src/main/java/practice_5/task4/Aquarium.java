package practice_5.task4;

public class Aquarium {
    private SeaCreature newSeaAnimal;

    public void setNewSeaAnimal(SeaCreature newSeaAnimal) {
        this.newSeaAnimal = newSeaAnimal;
    }

    public void showMovement() {
        this.newSeaAnimal.move();
    }
}
