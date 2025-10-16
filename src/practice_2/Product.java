package practice_2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }
    double applyDiscount(double discount) {
        this.price = this.price - discount;
        return this.price;
    }
    void printInfo() {
        System.out.println("Товар: " + this.name + " Его цена: " + this.price + "скидка" + this.price);
    }
}
