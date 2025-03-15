package main.abstraction.interfaces.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoublePredicate;

public class Analytics implements DoublePredicate {

    public static void main(String[] args) {
        Bank bank = new Bank();

        for (int i = 0; i < 5; i++) {
            bank.addAccount(new CheckingAccount());
            bank.addAccount(new SavingAccount());
        }

        List<BankAccount> allAccounts = bank.getAccounts();
        new Simulation(allAccounts, 10);

        System.out.println("All accounts:");
        for (BankAccount ba : allAccounts)
            System.out.println(ba.getAccountDetails());
        System.out.println();

        DoublePredicate greater1000 = new Analytics();

        List<BankAccount> filtered = new ArrayList<>();
        for (BankAccount ba : allAccounts)
            if (greater1000.test(ba.getBalance()))
                filtered.add(ba);

        System.out.println("Accounts with balance > 1000:");
        for (BankAccount ba : filtered)
            System.out.println(ba.getAccountDetails());
    }

    @Override
    public boolean test(double value) {
        return value > 1000;
    }
    
}
