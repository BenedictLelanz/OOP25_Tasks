package main.abstraction.interfaces.tasks;

public interface BankAccount {
    
    /**
     * Einzahlen eines Betrages.
     * @param amount
     */
    void deposit(double amount);

    /**
     * Auszahlen eines Betrages.
     * @param amount
     */
    void withdraw(double amount);

    /**
     * 
     * @return den aktuellen Kontostand
     */
    double getBalance();

    /**
     * 
     * @return Details über den Account.
     */
    String getAccountDetails();

}
