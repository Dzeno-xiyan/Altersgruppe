int[] zahlen = {1, 4, 9, 16, 25};

// for-each Schleife
for (int zahl : zahlen) {
    System.out.println(zahl);
}

Was macht diese Schleife?

Array deklarieren: Wir erstellen ein Array namens zahlen und füllen es mit einigen Zahlen.
for-each Schleife:
for (int zahl : zahlen):
int zahl: Hier wird eine neue Variable zahl vom Typ int deklariert, die jedes Element des Arrays aufnehmen wird.
: zahlen: Das : zeigt an, dass wir über jedes Element des Arrays zahlen iterieren wollen.
Schleifenkörper:
System.out.println(zahl);: In jedem Durchlauf der Schleife wird der aktuelle Wert von zahl (also das aktuelle Element des Arrays) auf der Konsole ausgegeben.

------------------------------------------------------------------------------------------------------------------------------------------------------------------

Array von Strings:
Java
String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
for (String tag : wochentage) {
    System.out.println(tag);
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

List<String> farben = new ArrayList<>();
farben.add("Rot");
farben.add("Grün");
farben.add("Blau");

for (String farbe : farben) {
    System.out.println(farbe);
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Wann sollte man die for-each Schleife verwenden?

Wenn du jedes Element einer Sammlung (Array, Liste, etc.) einmal durchlaufen möchtest.
Wenn du den Index nicht benötigst.
Wenn du deinen Code lesbarer und verständlicher gestalten möchtest.
Wann sollte man die for-each Schleife nicht verwenden?

Wenn du den Index benötigst, um Elemente zu modifizieren oder zu entfernen. In diesem Fall ist eine traditionelle for-Schleife besser geeignet.
Wenn du die Schleife mitten im Durchlauf abbrechen möchtest.
Zusammenfassung:

Die for-each-Schleife ist eine leistungsstarke und elegante Möglichkeit, über Elemente von Sammlungen zu iterieren. Sie ist einfach zu verstehen und zu verwenden und macht deinen Code oft lesbarer.
