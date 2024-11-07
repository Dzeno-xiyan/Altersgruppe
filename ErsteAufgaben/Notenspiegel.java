package Scanner;

import java.util.Scanner;

public class Notenspiegel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Schüler: ");
        int anzahlSchueler = scanner.nextInt();

        // Array zur Speicherung der Noten (von 0 bis 15)
        int[] noten = new int[16];

        // Eingabe der Noten
        System.out.println("Bitte geben Sie die Noten (0-15) ein:");
        for (int i = 0; i < anzahlSchueler; i++) {
            System.out.print("Note " + (i + 1) + ": ");
            int note = scanner.nextInt();
            if (note >= 0 && note <= 15) {
                noten[note]++; // Erhöhe die Anzahl für diese Note
            } else {
                System.out.println("Ungültige Note! Bitte geben Sie eine Note zwischen 0 und 15 ein.");
                i--; // Wiederhole die Eingabe für denselben Schüler
            }
        }

        // Berechnung von Minimum, Maximum und Mittelwert
        int minNote = 16, maxNote = -1, summe = 0, anzahlGueltigerNoten = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] > 0) {
                if (noten[i] < minNote) {
                    minNote = i;
                }
                if (noten[i] > maxNote) {
                    maxNote = i;
                }
                summe += i * noten[i]; // Gewichtete Summe für Mittelwertberechnung
                anzahlGueltigerNoten += noten[i];
            }
        }
        double mittelwert = (double) summe / anzahlGueltigerNoten;

        // Berechnung des Anteils negativer Noten
        int anzahlNegativeNoten = anzahlSchueler - anzahlGueltigerNoten;
        double anteilNegativeNoten = (double) anzahlNegativeNoten / anzahlSchueler * 100;

        // Ausgabe der Ergebnisse
        System.out.println("\nErgebnisse:");
        System.out.println("Minimale Note: " + minNote);
        System.out.println("Maximale Note: " + maxNote);
        System.out.println("Mittelwert: " + mittelwert);
        System.out.println("Anteil negativer Noten: " + anteilNegativeNoten + "%");

        // Ausgabe des Streifendiagramms (einfache Variante)
        System.out.println("\nNotenverteilung:");
        for (int i = 0; i <= 15; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < noten[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
