/**
 * Sicherer Umgang mit Threads
 * 
 * In den folgenden Aufgaben geht es darum, den Umgang mit Threads ohne
 * Verwendung des Concurrency-Frameworks zu üben.
 * 
 * 1. n Threads schicken Nachrichten an den main-Thread
 *      - Implementiert ein Java-Programm, das n (beliebig viele) Threads startet, die alle
 *        im Abstand von 200ms eine Nachricht (z.B. einen Methodenaufruf) an den main-Thread
 *        senden
 *      - Der main-Thread soll zählen, wie viele Nachrichten er von den Threads bekommen hat
 *      - Der main-Thread beendet alle anderen nach 3 Sekunden und gibt aus, wie viele
 *        Nachrichten er von jedem der Threads bekommen hat
 * 
 * 2. Aktives Beenden von Threads
 *      - Implementiert einen nebenläufigen Thread, der so lange alle 200msec „hallo“ ausgibt,
 *        bis er beendet wird
 *      - Beendet diesen Thread vom main-Thread aus nach 2 Sekunden
 * 
 * 3. Nebenläufiger Performance-Test
 *      - Verändert den Performance-Test aus den Aufgaben des Generics-Kapitel so, dass alles
 *        nebenläufige parallelisiert wird (nebenläufig sollten die Tests für die 4 zu testenden
 *        Collections sein)
 *      - Welche Änderungen der Laufzeit sind zu erwarten?
 *          Wie verändert sich die Gesamtlaufzeit?
 *          Wie verändert sich die Laufzeit der einzelnen Tests?
 * 
 */
package main.multithreading.tasks;
