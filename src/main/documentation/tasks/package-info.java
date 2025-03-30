/**
 * Server-Framework
 * 
 * Die vorliegenden Aufgaben führen euch durch die Weiterentwicklung eines kleinen Frameworks
 * für eine Website. Das Framework beinhaltet einen Server und einen Page-Generator. Die Aufgabe
 * des Page-Generator ist es, eine HTML-Seite anhand von annotierten Klassen und Methoden zu erzeugen.
 * Der Server wird diese für den Browser eures Computers bereitstellen.
 * 
 * Erweitert wird die Aufgabe mit dem Erstellen einer kleinen Website und deren Unterseiten, was durch 
 * euer Framework ermöglicht werden soll.
 * 
 * Ist der Code vervollständigt, kann der Server zum Laufen gebracht werden, indem die main-Methode 
 * der Klasse Server im package server ausgeführt wird. Im Browser wird eure Seite dann mit der URL
 * 'localhost:8080/path/to/your/page' aufgerufen. 
 * 
 * Aufgabe 1:
 * - Ziel ist es, für jeden Pfad, den euer Server bedienen können soll (z.B. /main als Einstiegsseite),
 *   eine einfache Klasse zu definieren, die den Aufbau der vom Pfad angefragten Seite definiert.
 * - Erstellt dafür eine passende Annotation, mit der ihr die Klassen dann kennzeichnet. Die Annotation
 *   sollte so strukturiert sein, dass die Methode handle im RootHandler fehlerfrei wird.
 * - Tipp: Ihr könnt euch an der bereits existierenden Element-Annotation orientieren.
 * 
 * Aufgabe 2:
 * - Erstellt nun mindestens drei Klassen (für drei verschiedene Pfade) gekennzeichnet durch die Path-Annotation
 *   im Package myWebsite. (Deren Inhalt definieren wir später, es geht nun erstmal nur um die Existenz von 
 *   Seiten und Unterseiten)
 * - Damit die Klassen dem Framework bekannt sind, werden sie in der Klasse PageList der Liste PAGES 
 *   hinzugefügt. Das Konstruieren der Klassen überlassen wir dem Framework. Gemäß der Signatur der Liste soll
 *   also nur die Klasse hinzugefügt werden (Bsp.: Home.class, falls Home.java exisitert).
 * 
 * Aufgabe 3:
 * - Versucht nun euren Klassen mit Content zu füllen. Dafür gibt es die Annotation Element. Ihre Properties
 *   werden vom Framework genutzt, um Aussehen und Position je Element zu bestimmen.
 * - Jede Klasse sollte mindestens drei Elemente haben, die zunächst bloßen Textinhalt zurückgeben.
 * - Experimentiert mit den Styling-Attributen.
 * - Fügt den Elementen die click-Property hinzu und definiert den Pfad, zu dem gegangen werden soll, wenn das
 *   Element geklickt wird.
 * - Startet den Server und testet die Applikation, indem ihr die URL eurer Hauptseite eingebt.
 * 
 * Aufgabe 4:
 * - Die Property Alignment von Element macht nur Sinn, wenn ein Element mehrere 'Kind'-Elemente enthält.
 * - Erstellt eine neue Klasse K, die den Inhalt (mehrere Elemente) eines einzelnen Elements E beschreibt. Diese
 *   Klasse sollte nicht routbar sein und damit weder die Path-Annotation besitzen, noch in der Page-List
 *   auftauchen.
 * - Das Element E sollte nun keinen String mehr zurückgeben, sondern eine erzeugte Instanz von K.
 * - Diese Vorgehensweise erlaubt eine theoretisch unbegrenzte Verschachtelungstiefe.
 * - Im Ordner res soll das Bild webseiteVerschachtelung eine Vorstellung davon ermöglichen. Das blaue Element
 *   ist das 'Eltern'-Element mit Alignment ROW und beinhaltet zwei 'Kind'-Elemente. 
 * 
 * Aufgabe 5:
 * - Dokumentiert den Server-Code und Webseiten-Code so gut es mit Angaben über Parameter und return-Werten.
 * - Testet alle Komponenten und prüft, ob die Webseite eure geforderten FUnktionalitäten erfüllt.
 * 
 */
package main.documentation.tasks;
