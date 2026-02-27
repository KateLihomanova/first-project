package design_patterns.abstractfabric_GUI;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Кнопка в стиле Винды");
    }
}
