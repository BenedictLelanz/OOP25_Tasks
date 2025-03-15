package main.abstraction.interfaces.tasks;

public class SavingAccount implements BankAccount {

    private double balance;

    @Override
    public void deposit(double amount) {
        this.balance += amount * 1.02;
    }

    @Override
    public void withdraw(double amount) {
        double realAmount = amount;
        if (amount < 100)
            realAmount = amount + 5;
        if (this.balance >= realAmount)
            this.balance -= realAmount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getAccountDetails() {
        return "SavingAccount[balance: " + this.balance + "]";
    }
    
}
