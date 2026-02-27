package design_patterns.abstractfabric_GUI;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Кнопка в стиле MacOS");
    }
}
