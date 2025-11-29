package practice_5.task5;

public class Farm {
    private FarmAnimal newFarmAnimal;

    public void setNewFarmAnimal(FarmAnimal newFarmAnimal) {
        this.newFarmAnimal = newFarmAnimal;
    }

    public void seviceAnimal() {
        this.newFarmAnimal.care();
        this.newFarmAnimal.feed();
        this.newFarmAnimal.produce();
    }
}
