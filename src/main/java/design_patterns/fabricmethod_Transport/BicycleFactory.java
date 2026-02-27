package design_patterns.fabricmethod_Transport;

public class BicycleFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
