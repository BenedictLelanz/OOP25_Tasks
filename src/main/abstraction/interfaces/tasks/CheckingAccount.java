package main.abstraction.interfaces.tasks;

public class CheckingAccount implements BankAccount {

    private double balance;

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance >= amount)
            this.balance -= amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getAccountDetails() {
        return "CheckingAccount[balance: " + this.balance + "]";
    }
    
}
