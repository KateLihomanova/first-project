package design_patterns.builder_Order;

public class Shop {
    public static void main(String[] args) {
        OrderBuilder builder = new OrderBuilder();

        Order order = builder.addItem("TV", 900)
                .addItem("Phone", 456.9)
                .setPaymentMethod("Card")
                .applyDiscount(67.98)
                .build();

        System.out.println(order.toString());
    }
}
