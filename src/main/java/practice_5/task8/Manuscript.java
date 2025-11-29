package practice_5.task8;

public class Manuscript extends Exhibit {
    @Override
    public String describe() {
        return "древний текст";
    }
    @Override
    public void preserve() {
        System.out.println("Манускрипту необходима контролируемая влажность");
    }
}
