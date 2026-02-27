package design_patterns.abstractfabric_Furniture;

public class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Вы сидите на классическом стуле");
    }
}
