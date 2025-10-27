package practice_5.task7;

public class Main {
    public static void main(String[] args) {
        SystemPark newSystemPark = new SystemPark();
        Attraction newRollerCoaster = new RollerCoaster();
        Attraction newCarousel = new Carousel();
        newSystemPark.setNewAttraction(newRollerCoaster);
        newSystemPark.operateAttraction();
        newSystemPark.setNewAttraction(newCarousel);
        newSystemPark.operateAttraction();

    }
}
