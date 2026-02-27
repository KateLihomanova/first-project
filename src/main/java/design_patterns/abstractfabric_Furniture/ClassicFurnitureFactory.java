package design_patterns.abstractfabric_Furniture;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }
    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
