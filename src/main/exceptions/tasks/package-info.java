/**
 * Erweitertes Studenten-Verwaltungssystem
 * 
 * In der Übungsaufgabe zu Enums habt ihr ein Enum für verschiedene Matrikel angelegt. Verschiedene Eigenschaften konnten
 * einem Matrikel über die DataRader Klasse dynamisch zugewiesen werden. Das soll nun professionalisiert werden.
 * 
 * Absofort soll jedem Matrikel eine Textdatei gehören, in der Auskunft über die zugehörigen Personen (Studenten) gegeben wird. Eine 
 * Person ist eine serialisierte (abgespeicherte) Instanz der Klasse Person (main.abstraction.interfaces.lecture.Person). D.h. in
 * den Textdateien je Matrikel stehen die Dateipfade zu den jeweiligen Person-Dateien.
 * 
 * =============================================================== A-Teil ===============================================================
 *
 * 1. Verändert die Klasse Person im Package `main.abstraction.interfaces.lecture` derart, dass sie das Marker-Interface Serializable 
 *    implementiert. Das bedeutet, dass eine Instanz dieser Klasse absofort serialisiert werden kann.
 *
 * 2. Schreibt eine Klasse mit main-Methode (z. B. `PersonCreator`), mit der mehrere Personen erstellt und als `.person`-Dateien 
 *    gespeichert werden.
 *    - Die Dateien sollen unter dem Pfad 'res/persons/' abgelegt werden.
 *    - Jede Datei soll idealerweise den Namen `<vorname>_<nachname>.person` erhalten.
 *    - Nutzt dafür `ObjectOutputStream`, um die erstellten Instanzen von Person zu serialisieren. (Siehe ...lecture.io.SaveObject)
 *
 * =============================================================== B-Teil ===============================================================
 *
 * 3. Legt für jeden Matrikel (Enum-Wert des Studiengangs) eine eigene Textdatei im Verzeichnis `res/matrikel/` an.
 *    - Beispiel: `IIb.txt`, `DSb.txt`, usw.
 *
 * 4. In jeder Datei sollen die Pfade zu den `.person`-Dateien eingetragen werden, die zu diesem Studiengang gehören.
 *    - Achtet darauf, dass in jeder Zeile genau ein Pfad steht.
 *
 * =============================================================== C-Teil ===============================================================
 *
 * 5. Fügt dem Studiengang-Enum eine Methode hinzu, die die entsprechende Matrikel-Datei aus dem `res/matrikel/`-Ordner liest.
 *    - Diese Methode wird zum Konstruktionszeitpunkt jeder Enum-Konstante aufgerufen
 *    - Alle referenzierten `.person`-Dateien werden geladen und deserialisiert (siehe ...lecture.io.ReadWrite, ...lecture.io.SaveObject)
 *    - Die geladenen Personen sollen dann in einer geeigneten Datenstruktur abgelegt werden (z. B. List<Person>), die Attribut der 
 *      jeweiligen Studiengang-Enum-Instanz ist.
 *
 * 6. Gebt zum Schluss für jedes Matrikel eine Liste aller zugehörigen Personen in der Konsole aus.
 *
 * Hinweis: Wer das Matrikel-Enum aus der alten Übung nicht hat, kann es aus dem `solution-tasks`-Branch übernehmen.
 * 
 */
package main.exceptions.tasks;
