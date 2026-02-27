package design_patterns.abstractfabric_Furniture;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Вы сидите на современном стуле");
    }
}
