/* Aufgabe 1 ~ Statistisch gesehen!
Schwierigkeit:  
Für eine Statistiksoftware sollen Methoden geschrieben werden, welche es ermöglichen das
Minimum, Maximum sowie den Mittelwert aus einem Array an Zahlen zu berechnen. Die
Methoden sollen jeweils ein Array mit Zahlen übergeben bekommen und aus diesem Array den
entsprechenden Wert zurückgeben. Der Benutzer soll entscheiden können, wie viele Zahlen er
eingeben möchte. Anschließend kann er entsprechend viele Zahlen auch eingeben und bekommt
am Ende das Minimum, Maximum und den Mittelwert ausgegeben */



package Scanner;

import java.util.Scanner;

public class Statischgesehen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer gibt die Anzahl der Zahlen ein
        System.out.print("Wie viele Zahlen möchten Sie eingeben? ");
        int anzahlZahlen = scanner.nextInt();

        // Array zum Speichern der Zahlen erstellen
        int[] zahlen = new int[anzahlZahlen];

        // Zahlen vom Benutzer einlesen
        System.out.println("Bitte geben Sie " + anzahlZahlen + " Zahlen ein:");
        for (int i = 0; i < anzahlZahlen; i++) {
            zahlen[i] = scanner.nextInt();
        }

        // Minimum, Maximum und Mittelwert berechnen
        int minimum = findMinimum(zahlen);
        int maximum = findMaximum(zahlen);
        double mittelwert = calculateMittelwert(zahlen);

        // Ergebnisse ausgeben
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Mittelwert: " + mittelwert);
    }

    // Methode zum Finden des Minimums
    public static int findMinimum(int[] zahlen) {
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
        }
        return min;
    }

    // Methode zum Finden des Maximums
    public static int findMaximum(int[] zahlen) {
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
        }
        return max;
    }

    // Methode zum Berechnen des Mittelwerts
    public static double calculateMittelwert(int[] zahlen) {
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        return (double) summe / zahlen.length;
    }
}
