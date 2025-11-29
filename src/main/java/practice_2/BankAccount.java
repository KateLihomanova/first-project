package practice_2;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    String getOwner() {
        return this.owner;
    }
    void setOwner(String newOwner) {
        this.owner = newOwner;
    }
    int deposit(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
    int withdraw(int amount) {
        this.balance = this.balance - amount;
        return this.balance;
    }
    void printBalance() {
        System.out.println(this.balance);
    }

}
