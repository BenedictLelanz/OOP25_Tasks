/**
 * Reduce, Map und Filter
 *
 * In der heutigen Übung sollen die generischen Algorithmen 'reduce', 'map' und 'filter'
 * aus der Klasse Util implementiert werden und anschließend mithilfe von Lambdas und 
 * Methoden-Referenzen getestet werden.
 * 
 * Funktionweisen:
 * - reduce: reduce ist ein Algorithmus, der eine Liste von Werten schrittweise auf einen
 *           einzigen Wert zusammenfasst, indem er eine Funktion auf jeweils zwei Elemente
 *           anwendet – ein Zwischenergebnis und das nächste Listenelement
 * 
 * - map:    map wendet eine Funktion auf jedes Element einer Liste an und gibt eine neue
 *           Liste mit den Ergebnissen zurück.
 * 
 * - filter: filter prüft jedes Element einer Liste mit einer Bedingung (Funktion) und gibt
 *           nur die Elemente zurück, die diese Bedingung erfüllen.
 * 
 * 
 * Implementiert die folgenden Anwendungsfälle:
 * 
 * Reduce (mit Lambdas):
 * - Die Summe aller Umsätze in einer Liste berechnen.
 * - Die längste Zeichenkette aus einer Liste von Strings finden.
 * 
 * Map (mit Methoden-Referenzen):
 * - Eine Liste von Zahlen als Strings ("12", "512", ...) in eine List<Integer> umwandeln
 *      - Hinweis: Integer.parseInt("234") hilft dabei
 * - Eine Liste von Strings in eine Liste von Strings mit Großbuchstaben umwandeln
 * 
 * Filter (mit Lambdas)
 * - Aus einer Liste von main.abstraction.interfaces.lecture.Person nur die Personen
 *   zurückgeben, die volljährig sind
 * - Aus einer Liste von Supplier<Integer> nur die zurückgeben, deren gelieferter Wert > 0 ist
 * 
 * Viel Erfolg!
 */
package main.innerClasses.lambdas.tasks;
