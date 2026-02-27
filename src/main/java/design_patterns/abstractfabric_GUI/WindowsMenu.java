package design_patterns.abstractfabric_GUI;

public class WindowsMenu implements Menu {
    @Override
    public void open() {
        System.out.println("Меню в стиле видны");
    }
}
