package practice_12;

public class Product {
    private String name;
    private double price;
    private String category;

    public Product(String productName, int price, String characteristic) {
        this.name = productName;
        this.price = price;
        this.category = characteristic;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
