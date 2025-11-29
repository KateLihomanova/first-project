package practice_5.task7;

public class SystemPark {
    private Attraction newAttraction;

    public void setNewAttraction(Attraction newAttraction) {
        this.newAttraction = newAttraction;
    }

    public void operateAttraction() {
        System.out.println(this.newAttraction.info());
        this.newAttraction.maintain();
    }
}
