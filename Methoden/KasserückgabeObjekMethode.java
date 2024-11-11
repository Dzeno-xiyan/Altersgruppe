package Scanner;



import java.util.Scanner;
import java.util.Locale;
import java.util.*;




class Speicher {
    public double berechneGesamtpreis(int anzahlArtikel, double preisProArtikel) {
        return anzahlArtikel * preisProArtikel;
    }

    public double berechneRestgeld(double bezahlterBetrag, double gesamtpreis) {
        return bezahlterBetrag - gesamtpreis;
    }
}

class Rckgabe {
    private int[] scheine = {500, 200, 100, 50, 20, 10, 5};

    public void gibScheine(double restbetrag) {
        System.out.println("Ausgabe der Scheine:");
        int betragInCent = (int) (restbetrag * 100); 
        for (int scheinwert : scheine) {
            int anzahlScheine = betragInCent / (scheinwert * 100);
            betragInCent %= (scheinwert * 100);
            if (anzahlScheine > 0) {
                System.out.printf("%d x %d Euro Scheine\n", anzahlScheine, scheinwert);
            }
        }
    }
}

public class ScannerAufgabe2ObjekMetho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMANY);

        System.out.print("Anzahl der Artikel: ");
        int anzahlArtikel = scanner.nextInt();

        System.out.print("Preis pro Artikel: ");
        double preisProArtikel = scanner.nextDouble();

        System.out.print("Bezahlter Betrag: ");
        double bezahlterBetrag = scanner.nextDouble();

        Speicher kasse = new Speicher();
        double gesamtpreis = kasse.berechneGesamtpreis(anzahlArtikel, preisProArtikel);
        double restgeld = kasse.berechneRestgeld(bezahlterBetrag, gesamtpreis);

        System.out.println("Gesamtpreis: " + gesamtpreis + " €");
        System.out.println("Restgeld: " + restgeld + " €");

        Rckgabe automat = new Rckgabe();
        automat.gibScheine(restgeld);

        scanner.close();
    }
}
