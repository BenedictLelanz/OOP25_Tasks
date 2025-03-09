/**
 * Übungsaufgabe: Bankensystem
 * 
 * In dieser Übung soll es darum gehen, eine kleine Bank mit Analysefunktion zu programmieren.
 * 
 * Ich habe euch dafür das Interface BankAccount angelegt, das alle nötigen Methoden enthält, die so ein Bankkonto haben müsste.
 * 
 * Außerdem findet ihr eine Klasse Simulation im package, die ihr dazu nutzen könnt, auf einer Reihe von Bankkonten zufällige
 * Aktionen auszuführen. Die Logik dahinter ist super einfach, gern könnte ihr auch was eigenes dafür nutzen :D
 * 
 * Für die Analyse könnte ihr die Instanz eurer Bank verwenden und das Interface DoublePredicat verwenden (ähnlich zum in der
 * Vorlesung behandelten IntPredicate). Beispiele wären z.B. die Anzahl der Bankkonten zu ermitteln, deren Geldstand > 500.0 ist.
 * Das wäre ein Prädikat. Ein anderes könnte sein, zu ermitteln, ob der Geldstand < 100 ist.
 * 
 * Ich gebe euch dafür hier noch einen groben Plan vor, wie ihr vorgehen könntet.
 * 
 * Wie immer gilt natürlich, dass eigene Kreativität gern eingebracht werden kann, um das 'Bankensystem' zu erweitern. Viel Erfolg!
 * 
 * Aufgabenstellung:
 * 
 * 1. Macht euch mit dem Interface BankAccount vertraut.
 *
 * 2. Erstellt zwei Klassen, die das `BankAccount`-Interface implementieren:
 *      - CheckingAccount:
 *          - Dies soll ein einfaches Girokonto darstellen. Es gibt keine Mindestanforderung an den Kontostand und keine Gebühren für Einzahlungen oder Abhebungen.
 *      - SavingsAccount:
 *          - Ein Sparkonto mit einer jährlichen Zinsrate von 2% auf das Guthaben. Bei einer Abhebung unter 100 Euro wird eine Gebühr von 5 Euro erhoben.
 *
 * 3. Erstellt eine Bank-Klasse, die die folgenden Funktionen implementiert:
 *      - Ein Bankkonto hinzufügen. (Tipp: wie in der Vorlesung erwähnt, lässt sich hierfür gut ein Objekt der Klasse ArrayList verwenden - dynamische Länge)
 *      - Alle Konten auflisten, die in der Bank existieren.
 *      - Den Gesamtbetrag aller Konten berechnen.
 * 
 * 4. Simuliert Ein- und Auszahlungen.
 *    - Erstellt eine main-Methode und erzeugt darin sowohl eine Bank als auch einige verschiedene zugehörgige Bankkonten.
 *    - Fasst die Bankkonten in einer Liste zusammen und erzeugt ein Objekt der Klasse Simulation, die auf alle Bankkonten zugreift und Ein- und Auszahlungen simuliert.
 *    - In den weiteren Aufgaben geht es dann um die Analyse der Zustände der Bankkonten.
 * 
 * 5. Analysiert die Geldbeträge der Konten.
 *    - Erstellt eine Klasse 'Analytics' mit einer Methode, die ein Objekt vom Typ DoublePredicate entgegennimmt.
 *    - Die Methode soll nun die Anzahl aller Konten ermitteln, die das Prädikat erfüllen.
 *    - Lasst euch eine kleine Übersicht über die Anzahl verschiedener Kontostände (z.B. 1000 bis 2000) ausgeben
 *  
 */
package main.abstraction.interfaces.tasks;
