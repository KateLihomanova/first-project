package practice_prog_principles.task5;

public class PaymentProcessor {
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}
