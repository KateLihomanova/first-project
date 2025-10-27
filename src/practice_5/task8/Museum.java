package practice_5.task8;

public class Museum {
    private Exhibit newObject;

    public void setNewObject(Exhibit newObject) {
        this.newObject = newObject;
    }

    public void showExhibit() {
        System.out.println(this.newObject.describe());
        this.newObject.preserve();
    }
}
