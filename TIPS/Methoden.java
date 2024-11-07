Methoden in Java: Die Bausteine der Programmierung
Was ist eine Methode?

Stell dir eine Methode als eine Art Rezept vor. Ein Rezept beschreibt Schritt für Schritt, wie man ein Gericht zubereitet. 
Genauso beschreibt eine Methode in Java eine Reihe von Anweisungen, die in einer bestimmten Reihenfolge ausgeführt werden, um eine bestimmte Aufgabe zu erledigen.

Warum brauchen wir Methoden?

Strukturierung: Methoden helfen dabei, deinen Code in kleinere, überschaubare Teile zu zerlegen.
Wiederverwendbarkeit: Eine einmal geschriebene Methode kann an verschiedenen Stellen im Programm aufgerufen werden.
Modularität: Methoden machen deinen Code modularer, d.h. einzelne Teile können unabhängig voneinander entwickelt und getestet werden.
Abstraktion: Methoden verstecken die inneren Abläufe und bieten eine einfache Schnittstelle für andere Teile des Programms.
Aufbau einer Methode:

Java
public static void meineMethode() {
    // Hier steht der Code, der ausgeführt werden soll
}
Verwende den Code mit Vorsicht.

public: Macht die Methode für andere Klassen zugänglich.
static: Die Methode gehört zur Klasse selbst, nicht zu einer Instanz der Klasse.
void: Die Methode gibt keinen Wert zurück.
meineMethode(): Der Name der Methode.
Methodenkörper: Die Anweisungen innerhalb der geschweiften Klammern werden ausgeführt, wenn die Methode aufgerufen wird.
Beispiel:

Java
public class MeinProgramm {
    public static void main(String[] args) {
        gruesse();
        berechneSumme(5, 3);
    }

    public static void gruesse() {
        System.out.println("Hallo Welt!");
    }

    public static void berechneSumme(int a, int b) {
        int ergebnis = a + b;
        System.out.println("Die Summe ist: " + ergebnis);
    }
}
Verwende den Code mit Vorsicht.

In diesem Beispiel:

gruesse() gibt eine einfache Nachricht aus.
berechneSumme() nimmt zwei Zahlen als Eingabe und berechnet ihre Summe.
Methoden aufrufen:
Um eine Methode aufzurufen, schreibst du einfach ihren Namen gefolgt von Klammern und gibst gegebenenfalls die erforderlichen Parameter an.

Wichtige Begriffe:

Parameter: Werte, die einer Methode beim Aufruf übergeben werden.
Rückgabewert: Ein Wert, den eine Methode zurückgibt.
Überladung: Mehrere Methoden mit demselben Namen, aber unterschiedlichen Parametern.
Rekursion: Eine Methode, die sich selbst aufruft.
Zusammenfassung:
Methoden sind eine fundamentale Konzeption in der objektorientierten Programmierung. Sie ermöglichen es, Code zu strukturieren, wiederzuverwenden und besser zu verwalten. 
  Durch ein gutes Verständnis von Methoden kannst du effizientere und wartbarere Java-Programme schreiben.
