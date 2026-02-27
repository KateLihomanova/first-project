package design_patterns.abstractfabric_GUI;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
    @Override
    public Window createWindow() {
        return new MacWindow();
    }
    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
