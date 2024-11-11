package Scanner;

import java.util.*;

public class ScannerAufgabe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        scanner.useLocale(Locale.GERMANY);

        
        System.out.print("Anzahl der Artikel: ");
        int anzahlArtikel = scanner.nextInt();

        System.out.print("Preis pro Artikel: ");
        double preisProArtikel = scanner.nextDouble();

        System.out.print("Bezahlter Betrag: ");
        double bezahlterBetrag = scanner.nextDouble();

        
        double gesamtpreis = anzahlArtikel * preisProArtikel;
        double restgeld = bezahlterBetrag - gesamtpreis;


        //System.out.printf("Gesamtpreis: %.2f €%n", gesamtpreis);
        //System.out.printf("Restgeld: %.2f €%n", restgeld);
        //
        System.out.println("Gesamtpreis: " + gesamtpreis + " €");
        System.out.println("Restgeld: " + restgeld + " €");
        scanner.close();
    }
}
