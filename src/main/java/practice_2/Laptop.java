package practice_2;

public class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    double getPrice() {
        return this.price;
    }
    String getBrand() {
        return this.brand;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void printInfo() {
        System.out.println("Ноутбук: " + this.brand + " Его цена: " + this.price);
    }
}
