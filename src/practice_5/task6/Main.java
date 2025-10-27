package practice_5.task6;

public class Main {
    public static void main(String[] args) {
        Garden newGarden = new Garden();
        Plant newCactus = new Cactus();
        Plant newOrchid = new Orchid();
        newGarden.setNewPlant(newCactus);
        newGarden.maintainPlant();
        newGarden.setNewPlant(newOrchid);
        newGarden.maintainPlant();
    }
}
