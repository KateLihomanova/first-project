package practice_5.task6;

public class Garden {
    private Plant newPlant;

    public void setNewPlant(Plant newPlant) {
        this.newPlant = newPlant;
    }

    public void maintainPlant() {
        this.newPlant.care();
    }
}
