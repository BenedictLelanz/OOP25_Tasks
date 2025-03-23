package main.abstraction.enums.tasks;

/**
 * Studiengänge
 * 
 * Die folgende Aufgabe ist eine erweiterte Version einer Prüfungsaufgabe aus dem Jahr 2023.
 * 
 * Es geht hier darum, einen Aufzählungstyp für mehrere Studiengänge zu definieren, der das Interface Studiengang implementiert.
 * 
 * Die Daten für den Aufzählungstyp findet ihr in dieser Tabelle:
 *
 * +------+-------------------------+---------------+------------+
 * | Code | Studiengang             | Studienplätze | Studenten  |
 * +------+-------------------------+---------------+------------+
 * | IIb  | Informatik B.S.         | 30            | 25         |
 * | IIm  | Informatik M.S.         | 15            | 9          |
 * | IWb  | Wirtschaft & Informatik | 20            | 12         |
 * | AIb  | Angewandte Informatik   | 25            | 18         |
 * | DSb  | Data Science B.S.       | 20            | 15         |
 * +------+-------------------------+---------------+------------+
 * 
 * Weiterhin geht es darum, über die Konsole 'Eigenschaften' eintippen zu können, die einem Studiengang zugewiesen werden. Dazu mehr
 * in Aufgabe 3 und 4.
 * 
 * 
 * Untergliedern lässt sich die Aufgabe wie folgt:
 * 
 * 1. Definiert einen Aufzählungstyp (enum) für die obenstehenden Studiengänge. Ihr Typ soll die Schnittstelle Studiengang 
 *    implementieren, wobei die Werte, die die Getter liefern, ebenso obenstehender Tabelle zu entnehmen sind.
 * 
 * 2. Implementiert eine statische Methode, die die Auslastung (Verhältnis von Studierenden zu Studienplätzen) eines Studiengangs 
 *    berechnet. Als Eingabe der Methode dient der Bezeichner des jeweiligen Studiengangs.
 * 
 * 3. Euer Enum soll nun das Interface DataAssignment implementieren. Ziel ist es, dass man einem Studiengang Eigenschaften zuweisen kann.
 *    Z.B. die zusätzliche Property 'Verantwortlicher'. Das kann auf Basis einer HashMap erfolgen. (Hinweis: Schaut euch DemoMap im 
 *    lecture Ordner an.)
 * 
 * 4. Vervollständigt die Main-Methode. Stellt sicher, dass euer Enum über eine geeignete Ausgabefunktion verfügt, die die aktuell
 *    zugewiesenen Daten ausgibt (Werden über die DataReader Instanz zugewiesen).
 * 
 */