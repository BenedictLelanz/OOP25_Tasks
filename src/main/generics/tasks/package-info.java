/**
 * Performance-Test von java.util.Collection<T>
 * 
 * Vergleicht verschiedene Implementierungen von java.util.Collection<T> bzgl. der Performance ihrer Methoden 
 * add und contains. Dazu könntet ihr die Zeit per System.currentTimeMillis() vor dem Testfall und danach messen
 * und die entsprechende Differenz zwischenspeichern.
 * 
 * Folgende Implementierungen sollen getestet werden:
 * HashSet<T>, TreeSet<T>, ArrayList<T> und LinkedList<T>
 * 
 * Allgemein sollten Testfälle so konstruiert werden, dass aussagekräftige Ergebnisse entstehen.
 * Messungen sollten, mehrfach ausgeführt, immer ähnliche Ergebnisse liefern. Die Aussage, dass eine 
 * Implementierung schneller als eine andere ist, muss durch wiederholte Laufzeitunterschiede mindestens 
 * im 3-stelligen Millisekundenbereich nachgewiesen werden.
 * 
 * 1. Implementiert die Logik zum Messen der Performance in die generischen Klassen AddTestCase und 
 *    ConstainsTestCase.
 *    - Verwendet eine einfache for-Schleife, um auf die Elemente des Sets zuzugreifen
 * 
 * 2. Schreibt eine Klasse IntGenerator, die das Interface TestDataGenerator implementiert.
 *    Mit dieser Klasse sollen dann TestDaten generiert werden.
 *    - Der Konstruktor der Klasse soll eine untere und eine obere Grenze (Zahl) entgegennehmen
 *          - Die zufälligen Zahlen sollen dann in dieser Range liegen  
 * 
 * 3. Testet die Performance der Collection-Klassen bzgl. der Performance ihrer Realisierungen von 
 *    add und contains.
 *    - Erstellt dafür eine Klasse TestCases, in der ihr in der main-Methode einzelne Testfälle definiert
 *    - Für die Durchführung eines Tests eignet sich eine Methode generateTestResult, die ein Testset und eine 
 *      Instanz der zu testenden Klasse entgegennimmt
 *    - Die Methode generateTestResult führt dann den runTest aus AddTestCase und aus ContainsTestCase aus,
 *      erhält die benötigten Zeiten und gibt sie auf der Konsole aus
 *    - Hinweis 1: Zum Verpacken des Testresultates kann die Klasse TestResult verwendet werden
 *    - Hinweis 2: Hier sollte die Methode generateTestResult mittels <Typ1, Typ2 ...> typisiert sein (nicht die 
 *      gesamte TestCases Klasse)
 *    - Hinweis 3: Damit ein aussagekräftiges Ergebnis entsteht, sollte ein Testset viele Daten enthalten
 *    
 * 3. Verändert die Klasse TestCases so, dass alle erzielten TestResults (für verschiedene Collections) für 
 *    dasselbe Set in einer Liste abgespeichert werden.
 *    - Die Liste hat die Signatur List<TestResult<?, ?>>
 *          - Warum können wir hier nicht die Signatur List<TestResult<S, T extends Collection<S>>> nutzen?
 *    - Beispiel: results1.add(generateTestResult(testSet, new LinkedList<S>()));
 * 
 * 4. Sortiert die Testresultate in den Listen und ermittelt die schnellste Implementierung
 *    - Verändert die Testklasse noch ein weiteres Mal, sodass jede erstellte Liste sortiert wird
 *    - An erster Stelle soll die schnellste Implementierung liegen
 *    - Tipp: Ihr könnt hierfür Collections.sort(results) verwenden.
 *    - Die Liste wird nach der Zeit der Add-Operationen sortiert, wenn TestResult.compareByAddTime true ist,
 *      anderenfalls nach der Zeit für Contains-Checks
 * 
 * 5. Schreibt andere TestSet-Generatoren, so wie ihr in Aufgabe 2 einen IntGenerator implementiert habt. 
 *    - Implementiert einen StringGenerator, der zufällige Strings erzeugt
 *          - Also zufällige Länge und zufällige Zeichen z.B. mittels 
 *              StringBuilder s = new StringBuilder(randomLength); und 
 *    - Testet die Performance der Collections für dieses Set
 *    - Wiederholt die Aufgabe noch einmal für einen String-Generator
 *    
 */
package main.generics.tasks;