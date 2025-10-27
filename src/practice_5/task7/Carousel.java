package practice_5.task7;

public class Carousel extends Attraction{
    @Override
    public String info() {
        return "Карусель - спокойный аттракцион";
    }
    @Override
    public void maintain() {
        System.out.println("Карусели требуется техническое обслуживание");
    }
}
