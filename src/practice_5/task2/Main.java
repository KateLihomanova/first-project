package practice_5.task2;

public class Main {
    public static void main(String[] args) {
        PetManager managerPetya = new PetManager();
        Pet newDog = new Dog();
        managerPetya.setNewPet(newDog);
        newDog.feed();
        newDog.interwork();
    }
}
