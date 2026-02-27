package design_patterns.adapter_Distance;

public class Kilometers implements Distanse {
    private double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getValue() {
        return kilometers;
    }
}
