package Scanner;

import java.util.Scanner;

public class Tiernahrung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den Preis pro Kilogramm ein: ");
        double preisProKg = scanner.nextDouble();

        System.out.print("Bitte geben Sie die Bestellmenge in Kilogramm ein: ");
        double bestellMenge = scanner.nextDouble();

        double gesamtpreisOhneRabatt = preisProKg * bestellMenge;

        double rabatt = 0;
        if (bestellMenge >= 50) {
            rabatt = 0.2; // 20% Rabatt
        } else if (bestellMenge >= 10) {
            rabatt = 0.1; // 10% Rabatt
        }

        double rabattBetrag = gesamtpreisOhneRabatt * rabatt;
        double gesamtpreisMitRabatt = gesamtpreisOhneRabatt - rabattBetrag;

        System.out.println("Gesamtpreis ohne Rabatt: " + gesamtpreisOhneRabatt + " €");
        System.out.println("Rabatt: " + rabattBetrag + " €");
        System.out.println("Gesamtpreis mit Rabatt: " + gesamtpreisMitRabatt + " €");
    }
}
