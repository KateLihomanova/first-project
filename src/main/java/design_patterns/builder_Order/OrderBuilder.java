package design_patterns.builder_Order;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private List<String> items = new ArrayList<>();
    private double totalPrice = 0.0;
    private String paymentMethod;
    private double discount;

    public OrderBuilder addItem(String itemName, double price) {
        items.add(itemName);
        totalPrice += price;
        return this;
    }

    public OrderBuilder setPaymentMethod(String method) {
        paymentMethod = method;
        return this;
    }
     public OrderBuilder applyDiscount(double discount) {
        this.discount = discount;
        totalPrice = totalPrice - discount;
        return this;
     }

     public Order build() {
        return new Order(items, totalPrice, paymentMethod, discount);
     }
}
