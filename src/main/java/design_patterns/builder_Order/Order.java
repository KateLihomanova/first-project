package design_patterns.builder_Order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items = new ArrayList<>();
    private double totalPrice;
    private String paymentMethod;
    private double discount;

    public Order(List<String> items, double totalPrice, String paymentMethod, double discount) {
        this.items = items;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Ваши заказы: " + items + " на сумму: " + totalPrice + " оплаченные с помощью " + paymentMethod + " со скидкой " + discount;
    }
}
