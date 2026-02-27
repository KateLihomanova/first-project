package design_patterns.abstractfabric_Furniture;

public class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Вы используете современный стол");
    }
}
