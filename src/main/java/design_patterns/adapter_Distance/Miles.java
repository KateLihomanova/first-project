package design_patterns.adapter_Distance;

public class Miles implements Distanse {
    private double miles;

    public Miles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getValue() {
        return miles;
    }
}
