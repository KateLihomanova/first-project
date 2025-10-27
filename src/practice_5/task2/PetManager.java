package practice_5.task2;

public class PetManager {
    private Pet newPet;

    public void setNewPet(Pet newPet) {
        this.newPet = newPet;
    }
    public void handlePet() {
        this.newPet.feed();
        this.newPet.interwork();
    }

}
