package practice_5.task8;

public class Sculpture extends Exhibit {
    @Override
    public String describe() {
        return "скульптурный объект";
    }
    @Override
    public void preserve() {
        System.out.println("Скульптуре необходима реставрация");
    }
}
