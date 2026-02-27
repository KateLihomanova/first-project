package design_patterns.adapter_Distance;

public class MilesToKilometersAdapter implements Distanse {
    private final Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    @Override
    public double getValue() {
        return miles.getValue() * 1.60934;
    }
}
