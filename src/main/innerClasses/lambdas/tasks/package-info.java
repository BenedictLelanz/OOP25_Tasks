/**
 * Lambdas & Funktionale Programmierung
 *
 * In dieser Übung soll das funktionale Programmieren mit Lambda-Ausdrücken in Java geübt werden.
 * Seit Java 8 erlaubt das Sprachfeature "Lambda Expressions" eine deutlich kompaktere und 
 * ausdrucksstärkere Schreibweise für sogenannte funktionale Schnittstellen. 
 * Typische Einsatzgebiete sind das Arbeiten mit Streams, Comparatoren, Predicates, Functions usw.
 *
 * Ziel dieser Übung ist es, verschiedene praktische und typische Anwendungsfälle kennenzulernen, 
 * bei denen Lambda-Ausdrücke einen klaren Vorteil in der Ausdruckskraft oder Kürze der Syntax bieten.
 * Viele Aufgaben arbeiten mit dem Stream-API, das eng mit dem funktionalen Stil verknüpft ist.
 *
 * Tipp: Arbeite bewusst mit den Typen Predicate<T>, Function<T,R>, Consumer<T>, Supplier<T>,
 * BinaryOperator<T> usw. – gegebenenfalls auch mit eigenen funktionalen Interfaces.
 *
 * 1. Filterung mit Lambdas  
 * Erstelle eine Liste von Ganzzahlen und gib mithilfe eines Lambda-Ausdrucks alle Zahlen größer als 10 aus.
 * Beispiel: List<Integer> numbers = Arrays.asList(1, 12, 5, 18, 8, 20); // Ausgabe: 12, 18, 20
 *
 * 2. Predicate & Filter  
 * Filtere eine Liste von Strings so, dass nur Elemente übrig bleiben, die mit einem bestimmten Buchstaben beginnen, z. B. „A“.
 * Beispiel: ["Alice", "Bob", "Annie", "David"] → ["Alice", "Annie"]
 *
 * 3. Mapping mit map()  
 * Wandle alle Strings einer Liste mithilfe von `map()` in Großbuchstaben um.
 * Beispiel: ["apple", "banana", "cherry"] → ["APPLE", "BANANA", "CHERRY"]
 *
 * 4. Aggregation mit reduce()  
 * Berechne die Summe aller Zahlen einer Liste mit `reduce()`.
 * Beispiel: [1, 2, 3, 4, 5] → 15
 *
 * 5. Sortieren mit Lambda-Comparator  
 * Sortiere eine Liste von Objekten (z. B. Personen) nach einem bestimmten Attribut, z. B. dem Alter.
 * Hinweis: Verwende `Comparator.comparing(...)` oder einen eigenen Lambda-Ausdruck.
 *
 * 6. Verkettung von Function<T,R>  
 * Erstelle zwei `Function`s, die nacheinander auf einen String angewendet werden, etwa: erst Großbuchstaben, dann Ersetzung.
 *
 * 7. Consumer & Seiteneffekte  
 * Verwende einen `Consumer`, um für jedes Element einer Liste eine bestimmte Aktion auszuführen, z. B. Konsolenausgabe.
 *
 * 8. Eigenes funktionales Interface  
 * Definiere ein Interface `Operation`, das zwei Zahlen nimmt und ein Ergebnis zurückgibt. 
 * Implementiere es mit Lambdas für Addition und Multiplikation.
 * Beispiel: Operation add = (a, b) -> a + b;
 *
 * 9. Optional & Lambdas  
 * Extrahiere aus einer Liste von `Optional<Integer>` alle vorhandenen Werte und berechne deren Summe.
 *
 * 10. Stream-Pipeline  
 * Kombiniere `filter`, `map` und `sorted`, um Strings zu transformieren, filtern und sortieren.
 * Beispiel: nur Strings mit Länge > 3 → klein → alphabetisch sortieren
 *
 * 11. Eventsystem mit Lambdas  
 * Baue ein einfaches Event-System, bei dem Listener als Lambda-Ausdrücke übergeben werden (z. B. für einen Button).
 *
 * 12. Kombinieren zweier Listen  
 * Verwende Lambdas (oder Streams), um zwei Listen von Integern elementweise zu summieren: 
 * [1,2,3] + [4,5,6] → [5,7,9]
 *
 * 13. Zählen mit Streams  
 * Ermittle, wie viele Objekte in einer Liste ein bestimmtes Kriterium erfüllen – z. B. alle Personen über 30.
 *
 */
package main.innerClasses.lambdas.tasks;
