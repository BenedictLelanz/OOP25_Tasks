package main.abstraction.interfaces.tasks;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accounts = new ArrayList<>();

    void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    void showAllAccounts() {
        for (BankAccount ba : this.accounts) {
            System.out.println(ba.getAccountDetails());
        }
    }

    double getWholeBalance() {
        double sum = 0;
        for (BankAccount ba : this.accounts) {
            sum += ba.getBalance();
        }
        return sum;
    }

    List<BankAccount> getAccounts() {
        return this.accounts;
    }
    
}
