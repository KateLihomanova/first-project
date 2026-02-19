package practice_prog_principles.task5;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
