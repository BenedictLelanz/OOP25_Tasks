/**
 * Dokumentendarstellung und Task-Executor
 * 
 * Diese Übung zum Thema 'Innere Klassen' ist in zwei Teile unterteilt.
 * Teil A: Dokumentensimulierung (Zeitaufwand: <= 1/2 Stunde)
 * Teil B: Task-Executor (Zeitaufwand: <= 1 Stunde)
 * 
 * Viel Erfolg!
 * 
 * Teil A: Dokumentensimulierung
 * 
 * Versucht zu verstehen, wie innere Klassen unterschiedliche Beziehungen und
 * Verantwortlichkeiten innerhalb einer Oberklasse ausdrücken können. Eure Aufgabe
 * ist es dabei, eine Klasse 'Document' zu implementieren, die folgende Komponenten
 * enthält:
 * 
 * - Titel, Autorenname (Metadata) und eine Liste von Paragraphen als Felder
 * - Eine nicht-statische innere Klasse 'Paragraph' 
 *      - mit den Feldern: Absatznummer und Text
 *      - die sich im Konstruktor in die Paragraphen-Liste der Oberklasse hinzufügt
 * - Eine statische Klasse MetadataValidator, die:
 *      - statische Hilfsmethoden zur Prüfung von Titel und Autorennamen anbietet
 *      - unabhängig vom Zustand eines konkreten Document-Objekts funktioniert
 * 
 * Versucht selbstständig passende Methoden/Konstruktoren zu ergänzen und erzeugt
 * anschließend ein kleines Test-Dokument.
 * 
 * 
 * Teil B: Task-Time-Meassurement
 * 
 * Hier geht es darum, mit lokalen und anonymen inneren Klassen zu arbeiten.
 * Die Idee ist es, einen Task (z.B. der Check, ob p eine Primzahl ist oder Sortieren
 * einer Liste) in einen anderen Task umzuwandeln, der bei Ausfürhung die benötigte
 * Zeit zurückgibt.
 * 
 * Einen Task kann man sich als Implementierung des Interfaces 'Runnable' vorstellen.
 * Für den Task, der die Zeit zurückgibt, kann man eine Implementierung des
 * Interfaces 'Supplier<Integer>' genutzt werden.
 * 
 * In der Klasse TaskTimeConverter befindet sich eine Methode, die ihr für diesen
 * Zweck implementieren sollt.
 * 
 * Realisiert die Prozedur folgendermaßen:
 * - Innerhalb der convert-Methode mit:
 *      - einer lokalen inneren Klasse TimedTask, die Supplier<Integer> implementiert
 *      - einer anonymen inneren Klasse, die Supplier<Integer> implementiert
 *          - Hinweis: in der Methode Supplier.get wird der ursprüngliche Task 
 *            ausgeführt, die Zeit gemessen und zurückgegeben
 * - Von außerhalb beim Aufruf von new TaskTimeConverter().convert ebenso mit:
 *      - einer lokalen innern Klasse MyTask implements ...
 *      - einer anonymen innern Klasse
 *          - Hinweis: Denkt euch irgendeinen beliebigen Task aus, der ein paar
 *            Millisekunden in Anspruch nimmt.
 * 
 */
package main.innerClasses.innerClasses.tasks;