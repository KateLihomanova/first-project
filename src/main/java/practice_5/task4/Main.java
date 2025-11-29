package practice_5.task4;

public class Main {
    public static void main(String[] args) {
        Aquarium newAquarium = new Aquarium();
        SeaCreature newShark = new Shark();
        SeaCreature newStarfish = new Starfish();
        newAquarium.setNewSeaAnimal(newShark);
        newAquarium.showMovement();
        newAquarium.setNewSeaAnimal(newStarfish);
        newAquarium.showMovement();

    }
}
