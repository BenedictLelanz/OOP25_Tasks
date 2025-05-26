/**
 * Übung zur Synchronisierung von Threads
 * 
 * In dieser Übung sollen die in der Vorlesung angesprochenen "Problemstellungen"
 * programmiert bzw gelöst werden.
 * 
 * Deadlocks entstehen meist durch zyklische Abhängigkeiten. Ein Zyklus ist sowohl in der aktuellen
 * Implementierung der DiningPhillosophers vorhanden (Jeder Phillosoph nimmt zuerst seinen linken
 * und wartet auf seinen rechten) als auch im Konzept der "Rechts-vor-links-Kreuzung". Ein solcher
 * Zyklus muss aufgebrochen werden, um Deadlocks zu verhindern.
 * 
 * 1. Nicht blockierende Phillosophen
 *    - Ändert die Implementierung der Klasse DiningPhillosophers so ab, dass es zu keinem Deadlock
 *      mehr kommen kann.
 *    - Folgende Ansätze könnten genutzt werden:
 *          - Von n Phillosophen versuchen nur n-1 zu essen (Ein Stab bleibt frei und kann als rechter
 *            eingesetzt werden) -> Hier würde sich die in der Vorlesung angesprochene Semaphore im
 *            "Essbereich" eignen
 *          - Ein Phillosph ist Rechtshänder, sodass er zuerst seinen rechten Stab zu nehmen versucht
 *            (Wie im anderen Ansatz kann dann hier, in dem Fall sein linker Nachbar, ein anderer seinen
 *            rechten Stab sicher nehmen und essen)
 * 
 * 2. Das Problem der "Rechts-vor-links Kreuzung"
 *    Ziel bei dieser Aufgabe ist es, mit Hilfe von synchronized Blöcken die Autos auf vier Fahrbahnen 
 *    einer Kreuzung zu simulieren, sodass diese anhalten, wenn sich ein Auto auf ihrer rechten Fahrbahn
 *    befindet, bzw die Kreuzung geradeaus überqueren, wenn kein rechtes Auto zu sehen ist.
 *    
 *    Kann es zu einem Deadlock kommen?
 * 
 *    - Implementiert eine Klasse Intersection mit vier Fahrbahnen:
 * 
 *        |↑
 *      <-----
 *      ----->
 *        ↓|
 * 
 *    - Implementiert eine Methode drive(int laneIndex), die den Ablauf eines Autos an der Kreuzung
 *      (geradeausfahrend der Einfachheit halber) simuliert. Die Phasen könnten z.B. so aussehen:
 *          - Innerhalb einer zufälligen Zeit t_0 fährt das Auto auf die Kreuzung zu (hierbei ist es
 *            noch nicht von anderen Teilnehmern sichtbar)
 *          - Das Auto erreicht die Kreuzung und verringert das Tempo innerhalb der zufälligen Zeit t_1
 *            (Jetzt ist das Auto für andere Teilnehmer sichtbar, sodass ein linker Straßennutzer halten
 *            würde)
 *          - Das Auto hält an, wenn ein Auto rechts zu sehen ist, oder verlässt die Kreuzung innerhalb
 *            der zufälligen Zeit t_2
 *          - Der Ablauf wird endlos wiederholt (um den potentiellen Deadlock zu entdecken)
 * 
 *    - Jede Aktion der Autos sollte durch Print-Statements gut nachvollziehbar sein
 * 
 *    - Implementiert eine main-Methode, die eine Instanz von Intersection erzeugt und vier Threads startet
 *          - Jeder Thread soll einen eindeutigen Namen haben (z.B. "Car_1")
 *          - Jeder Thread ruft einmal drive(i) auf, wobei i der Index der Fahrbahn ist, auf der er das Auto
 *            simuliert
 * 
 * 3. Deadlock-freie Kreuzung
 *    - Falls in eurer Implementierung zu Aufgabe 2 ein Deadlock entstehen kann: Verändert die
 *      Implementierung so, dass das System endlos (und deadlock-frei) weiterläuft
 *          - Tipp: Wird statt 'synchronized(lane)' eine Semaphore für jede Fahrbahn eingesetzt, kann ein
 *            Thread mit der Methode Semaphore.availablePermits() prüfen, ob noch einer frei ist und wenn
 *            nicht, seinen linken Nachbarn fahren lassen, indem er die Semaphore seiner aktuellen
 *            Fahrbahn freigibt
 * 
 */
package main.multithreading.tasks2;
