package design_patterns.fabricmethod_Transport;

public class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("Машина едет");
    }
    @Override
    public String getType() {
        return "Авто";
    }
}
