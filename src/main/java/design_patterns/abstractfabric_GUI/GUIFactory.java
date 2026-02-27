package design_patterns.abstractfabric_GUI;

public interface GUIFactory {
    Button createButton();
    Window createWindow();
    Menu createMenu();
}
