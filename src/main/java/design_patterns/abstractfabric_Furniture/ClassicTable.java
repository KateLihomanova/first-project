package design_patterns.abstractfabric_Furniture;

public class ClassicTable implements Table {
    @Override
    public void use() {
        System.out.println("Вы используете классический стол");
    }
}
