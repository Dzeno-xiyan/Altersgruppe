package Scanner;

import java.util.Scanner;

public class Rabatartiekanzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daten eingeben , Preis , Rabatt etc
        System.out.print("Bitte geben Sie den Ursprungspreis ein: ");
        double ursprungspreisEinzeln = scanner.nextDouble();

        System.out.print("Bitte geben Sie den Rabattfaktor (0.1 für 10%) ein: ");
        double rabattfaktor = scanner.nextDouble();

        System.out.print("Bitte geben Sie die Anzahl der Artikel ein: ");
        int anzahlArtikel = scanner.nextInt();

        // Berechnungen
        double ursprungspreisGesamt = ursprungspreisEinzeln * anzahlArtikel;
        double rabattEinzeln = ursprungspreisEinzeln * rabattfaktor;
        double rabattGesamt = rabattEinzeln * anzahlArtikel;
        double endpreis = ursprungspreisGesamt - rabattGesamt;

        // Ausgabe der Ergebnisse
        System.out.println("Gesamter Ursprungspreis: " + ursprungspreisGesamt);
        System.out.println("Gesamter Rabatt: " + rabattGesamt);
        System.out.println("Gesamte Ersparnis: " + rabattGesamt);
        System.out.println("Endpreis: " + endpreis);
    }
}
