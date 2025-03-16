/**
 * Geometrie
 * 
 * In dieser Aufgabe geht es darum, eine kleine Geometrie-Anwendung zu programmieren, um das Thema 'Vererbung' zu vertiefen.
 * Implementiert dafür bitte die Struktur auf dem Bild geometrischeObjekte.png im res Ordner. Dafür habe ich euch schon die 
 * Hauptklasse GeometrischesObjekt, die erbende Klasse Punkt und die erbende Klasse Dreieck angelegt.
 * 
 * Um das ganze besser auf das Auge wirken zu lassen, lassen wir die Geometrie-Objekte in ihrer echten Form anzeigen,
 * anstatt nur Print-Ausgaben zu verwenden. Das realisiert ihr mit der entsprechenden draw Methode in GeometrischesObjekt
 * und der Klasse DrawableRenderer.
 * 
 * Führt bitte einmal die main-Methode aus und schaut euch an, was auf dem Bildschirm ausgegeben wird und warum es ausgegeben wird.
 * 
 * Aufgabe 1:
 * - Beantwortet die folgende Frage:
 *      Warum wird im Konstruktor von Punkt eine leere ArrayList an den super Konstruktor übergeben, ohne eine Referenz auf den Punkt
 *      selbst?
 * 
 * Aufgabe 2:
 * - Verändert den Konstruktor von Dreieck so, dass er eine Farbe entgegennimmt. Das Dreieck soll dann in der entsprechenden Farbe
 *   gefüllt werden. Verändert dabei nicht die Methode draw von GeometrischesObjekt! Hinweis: Überschreiben... g.setColor(Color.RED);
 * 
 * Aufgabe 3:
 * - Erstellt nun alle Klassen mit den entsprechenden 'extends' Angaben, sodass sie der Baumstruktur entsprechen.
 * - Das Dreieck erbt nun nicht mehr von GeometrischesObjekt, sondern von Mehreck. 
 *  
 * Aufgabe 4:
 * - Überschreibt die draw Methode von Strecke und Punkt, sodass sie in der GUI sichtbar werden. Dafür eignen sich g.drawRect mit
 *   einer kleinen Größe bzw g.drawLine.
 * 
 * Aufgabe 5:
 * - Implementiert in Mehreck eine Funktion calcArea, die die Fläche des Mehrecks berechnet. Diese soll allgemeingültig für Polygone
 *   mit n Ecken sein.
 * - Z.B. mit dieser Formel: https://de.wikipedia.org/wiki/Gaußsche_Trapezformel
 * - Hinweis: for (int i = 0; i < n-1; i++) sum += (p[i].y + p[i+1].y) * (p[i].x - p[i+1].x) / 2
 * 
 * Aufgabe 6:
 * - Erzeugt einige geometrische Objekte, fügt sie der zu zeichnenden Liste hinzu und lasst euch dann die Fläche ausgeben, die alle
 *   geometrischen Objekte zusammen ausfüllen
 * 
 * Aufgabe 7 (Bonus):
 * - Erstellt eine Klasse für ein 5-Eck.
 * - Überschreibt toString in allen Klassen der Geometrie.
 * 
 */
package main.abstraction.inheritance.tasks;