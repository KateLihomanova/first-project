package design_patterns.abstractfabric_GUI;

public class MacMenu implements Menu {
    @Override
    public void open() {
        System.out.println("Меню в стиле MacOS");
    }
}
