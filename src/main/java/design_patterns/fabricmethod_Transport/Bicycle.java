package design_patterns.fabricmethod_Transport;

public class Bicycle implements Transport {
    @Override
    public void drive() {
        System.out.println("Велосипед едет");
    }
    @Override
    public String getType() {
        return "Велосипед";
    }
}
