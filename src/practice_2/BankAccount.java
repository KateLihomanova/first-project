package practice_2;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    String getOwner() {
        return this.owner;
    }
    void setOwner(String newOwner) {
        this.owner = newOwner;
    }
    double deposit(double amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }
    double withdraw(double amount) {
        this.balance = this.balance - amount;
        return this.balance;
    }
    void printBalance() {
        System.out.println("Ваш баланс: " + this.balance);
    }
}
