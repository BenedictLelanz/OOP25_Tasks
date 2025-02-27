/**
 * Übungsaufgabe: Erstelle ein Interface für ein einfaches Bankensystem.
 * 
 * Aufgabenstellung:
 * 
 * 1. Erstelle ein Interface `BankAccount`:
 *    - Das Interface soll folgende Methoden definieren:
 *      - `void deposit(double amount);` — Methode zum Einzahlen eines Betrags.
 *      - `void withdraw(double amount);` — Methode zum Abheben eines Betrags.
 *      - `double getBalance();` — Methode, um das aktuelle Kontoguthaben abzurufen.
 *      - `String getAccountDetails();` — Methode, die die Kontodetails als String zurückgibt.
 *
 * 2. Erstelle zwei Klassen, die das `BankAccount`-Interface implementieren:
 *    - **`CheckingAccount`**:
 *      - Dies soll ein einfaches Girokonto darstellen. Es gibt keine Mindestanforderung an den Kontostand und keine Gebühren für Einzahlungen oder Abhebungen.
 *    - **`SavingsAccount`**:
 *      - Ein Sparkonto mit einer jährlichen Zinsrate von 2% auf das Guthaben. Bei einer Abhebung unter 100 Euro wird eine Gebühr von 5 Euro erhoben.
 *
 * 3. Erstelle eine `Bank`-Klasse, die die folgenden Funktionen implementiert:
 *    - Ein Bankkonto hinzufügen.
 *    - Alle Konten auflisten, die in der Bank existieren.
 *    - Den Gesamtbetrag aller Konten berechnen.
 * 
 * 4. Führe Einzahlungen und Abhebungen durch und teste den aktuellen Geldstand unter Verwendung der Testklasse im package main.test.
 * 
 * Zusätzliche Möglichkeiten:
 * - Kombinieren eines BankAccounts mit einer Person (siehe Personenklasse aus Vorlesung). 
 * - Erweiterungen wie ein Konto mit Überziehungsrahmen oder die Möglichkeit zur Kontosperrung könnten hinzugefügt werden.
 * - Speichere in der übergeordneten Bank-Instanz den gesamten Zahlungsverkehr aller untergeordneten Bank-Accounts.
 */
package main.abstraction.interfaces.tasks;
