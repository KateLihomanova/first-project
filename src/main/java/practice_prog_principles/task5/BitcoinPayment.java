package practice_prog_principles.task5;

public class BitcoinPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
