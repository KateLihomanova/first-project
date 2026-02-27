package design_patterns.abstractfabric_GUI;

public class MacWindow implements Window {
    @Override
    public void drow() {
        System.out.println("Окно в стиле MacOS");
    }
}
