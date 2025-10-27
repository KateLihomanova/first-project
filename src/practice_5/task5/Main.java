package practice_5.task5;

public class Main {
    public static void main(String[] args) {
        Farm newFarm = new Farm();
        FarmAnimal newCow = new Cow();
        FarmAnimal newChicken = new Chicken();
        newFarm.setNewFarmAnimal(newCow);
        newFarm.seviceAnimal();
        newFarm.setNewFarmAnimal(newChicken);
        newFarm.seviceAnimal();
    }
}
