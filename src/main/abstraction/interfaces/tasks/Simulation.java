package main.abstraction.interfaces.tasks;

import java.util.List;

public class Simulation {

    private final int steps;

    Simulation(List<BankAccount> accounts, int steps) {
        this.steps = steps;
        for (BankAccount account : accounts)
            action(account, 0);
    }

    private void action(BankAccount account, int step) {
        if (step >= steps) return;
        if (Math.random() < 0.5) {
            account.deposit(Math.random() * 1000);
        } else {
            account.withdraw(Math.random() * 1000);
        }
        action(account, step+1);
    }
    
}
