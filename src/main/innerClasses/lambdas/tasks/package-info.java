/**
 * Lambdas & Methoden-Referenzen
 *
 * In der heutigen Übung soll der generische Algorithmus 'reduce' implementiert werden.
 * reduce nimmt eine Liste von Elementen vom Typ T und reduziert diese auf ein einziges
 * Element vom Typ T, das zurückgegeben wird.
 * 
 * Aufgabe 2, 3 und 4 sind Beispiel-Aufrufe von reduce, mit Lambdas und
 * Methoden-Referenzen.
 * 
 * 1. Schreibt eine Methode reduce, die eine Liste von Elementen und eine Verknüpfung übernimmt.
 *    Sie reduziert die Liste mit der Verknüpfung und gibt das Ergebnis zurück:
 * 
 *      public static <T> T reduce(List<T> liste, Verknuepfung<T> verknuepfung);
 * 
 *    Hinweis: Die Implementierung könnte aus einer Schleife und einem aktuell resultierenden
 *    Element vom Typ T bestehen, das nachher zurückgegeben wird.
 * 
 * 2. Verwendet einen Lambda-Ausdruck, um die Zahlen einer Liste mittels 'reduce' zu addieren.
 *    
 *    List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5);
 * 
 * 3. Verwendet einen Lambda-Ausdruck, um das Maximum aus einer Liste von Zahlen mittels 'reduce' zu finden.
 * 
 *    List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5);
 * 
 * 4. Verwendet eine Methoden-Referenz, um Strings in einer Liste mittels 'reduce' zu verketten.
 * 
 *    List<String> texte = Arrays.asList("Hallo", "Welt", "Java");
 * 
 *    Strings werden normalerweise auf den folgenden Weg konkateniert: String c = "hello ".concat("world")
 * 
 */
package main.innerClasses.lambdas.tasks;
