package design_patterns.fabricmethod_Transport;

public class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
