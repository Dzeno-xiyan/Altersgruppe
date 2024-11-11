package Scanner;


import java.util.Scanner;

public class ScannerAufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Daten
        System.out.print("Anzahl der Artikel: ");
        int anzahlArtikel = scanner.nextInt();

        System.out.print("Preis pro Artikel: ");
        double preisProArtikel = scanner.nextDouble();

        System.out.print("Bezahlter Betrag: ");
        double bezahlterBetrag = scanner.nextDouble();

        // Berechnung des Gesamtpreises und des Restgelds
        double gesamtpreis = anzahlArtikel * preisProArtikel;
        double restgeld = bezahlterBetrag - gesamtpreis;

        // Ausgabe der Ergebnisse
        System.out.println("Gesamtpreis: " + gesamtpreis + " €");
        System.out.println("Restgeld: " + restgeld + " €");
        scanner.close();
    }
}
