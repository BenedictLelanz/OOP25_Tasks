/**
 * Fortfühung Generics
 * 
 * In der letzten Übung habt ihr diverse Implementierungen aus dem Java-Collection Framework
 * kennengelernt. Dazu gehören ArrayList, LinkedList, HashSet und TreeSet. Etwas eher habt
 * ihr auch Datenstrukturen wie HashMap kennengelernt. Auf Basis dieser Datenstrukturen lassen
 * sich bereits viele Dinge umsetzen.
 * 
 * Allerdings gibt es auch Konzepte für andere Datenstrukturen, die so von Oracle noch nicht zur
 * Verfügung gestellt wurden. Das sind z.B. MultiMap, BiMap, IndexedSet oder PrioritySet. Damit
 * sie allgemein einsetzbar sind, müssten diese Datenstrukturen genau wie die bereits
 * implementierten generisch sein.
 * 
 * In dieser Übung soll es also darum gehen, die oben genannten Datenstrukturen zu implementieren.
 * Es ist völlig legitim, wenn nicht alle genannten im Seminar geschafft werden! Vielmehr könnten
 * sie als weiterführende Hausaufgaben zwecks Prüfungsvorbereitung dienen.
 * 
 * Die untenstehenden Aufgaben enthalten lediglich Informationen über die geforderte Funktionalität
 * der jeweiligen Datenstruktur. Es ist also Kreativität beim Implementieren gefordert.
 * Tipp: Implementiert sie auf Basis geeigneter Datenstrukturen aus dem Collection-Framework
 * (HashMap, ArrayList, PriorityQueue, etc)
 * 
 * 1. MultiMap
 * - Was es wäre: Eine Map<K, List<V>>-Struktur, in der ein Schlüssel mehrere Werte speichern kann
 * - Beispielnutzung:
 *      MultiMap<String, String> phoneBook = new MultiMap<>();
 *      phoneBook.put("Müller", "0123");
 *      phoneBook.put("Müller", "0456");
 *      phoneBook.get("Müller"); // ["0123", "0456"]
 * 
 * 2. BiMap
 * - Was es wäre: Eine Map<K, V>, bei der nicht nur K → V, sondern auch V → K eindeutig funktioniert
 * - Beispielnutzung:
 *      BiMap<String, Integer> users = new BiMap<>();
 *      users.put("Alice", 1);
 *      users.put("Bob", 2);
 *      users.getByKey("Alice"); // 1
 *      users.getByValue(2);     // "Bob"
 * 
 * 3. IndexedSet
 * - Was es wäre: Eine Set-ähnliche Struktur, die sowohl eindeutige Elemente speichert als auch deren
 *      Einfügereihenfolge bewahrt und per Index zugänglich macht
 * - Beispielnutzung:
 *      IndexedSet<String> set = new IndexedSet<>();
 *      set.add("Apfel");
 *      set.add("Banane");
 *      String first = set.get(0); // "Apfel"
 * 
 * 4. PrioritySet
 * - Was es wäre: Eine Kombination aus PriorityQueue und Set, also ein mengenartiges Objekt, bei dem 
 *      gleichzeitig ein Wichtigkeits-Prinzip definiert wird.
 * - Beispielnutzung:
 *      PrioritySet<Task> tasks = new PrioritySet<>();
 *      tasks.add(new Task("Emails", 2));
 *      tasks.add(new Task("Meeting", 1));
 *      Task next = tasks.poll(); // Meeting (höchste Priorität)
 * 
 */
package main.generics.tasks2;