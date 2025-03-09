/**
 * Framework für Simulatoren von Tierpopulationen
 * 
 * Präsentation: In KW25, Montag 14:30
 * 
 * a) (20 Punkte) Implementieren Sie in Java ein Framework für Simulatoren von Tierpopulationen.
 * 
 * Das Framework ist ein package bestehend aus geeigneten Klassen, enums oder Schnittstellen.
 * 
 * Jedes Tier wird dabei als eigener nebenläufiger Thread realisiert. Beim Start des Threads beginnt das Leben des Tieres, 
 * woraufhin es seine Umwelt beeinflussen kann, sich fortpflanzt und irgendwann wieder stirbt.
 * 
 * Die Umwelt ist ein Objekt, auf das alle Tiere Zugriff haben. Sie stellt einen getter und einen setter zur Verfügung, mit 
 * denen man ihre Eigenschaften (double Werte) einstellen kann. Es gibt beliebig viele Eigenschaften, die über Strings identifiziert 
 * werden. Die Umwelt macht zwei mal pro Sekunde eine Ausgabe in der Konsole, die für alle Eigenschaften die aktuellen Werte darstellt.
 * 
 * Um Simulationen durchzuführen kann man die Geschwindigkeit einstellen. Dabei wird festgelegt, wie viele Millisekunden ein „echter Tag“ 
 * in der Simulation dauert.
 * 
 * b) (25 Punkte) Implementieren Sie ein Anwendungsbeispiel, mit einer Population der neu entdeckten Gattung „Spunk“, so dass:
 * 
 * •	Ein echter Tag in der Simulation 0,5 Sekunden dauert
 * •	Zu Beginn der Simulation eine Population von jeweils 100 Tieren der Gattung Spunk im Alter von 1 bis 20 Tagen existieren. 
 *      (also 100 Tiere, die einen Tag alt sind, 100, die zwei Tage alt sind etc)
 * •	Ein weiblicher Spunk bekommt an seinem 15. Lebenstag 4 Junge.
 * •	Ein Spunk lebt 20 Tage und frisst jeden Tag 527 Blätter. Sind nicht genügend Blätter vorhanden, so stirbt der Spunk sofort.
 * •	Die einzige Eigenschaft der Umwelt ist in diesem Anwendungsfall die Anzahl der zur Verfügung stehenden Blätter. Zu Anfang hat die Umwelt 1 Mio Blätter. Und jeden Tag wachsen 10% der aktuellen Zahl neu.
 * 
 */
package main.preliminaryExam;