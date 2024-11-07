/* Aufgabe 1
Implementieren Sie ein Java (Konsolenprogramm), welches zwei Werte a und b einliest und danach:

die Summe,
das Produkt
den Quotienten
das Maximum
den Mittelwert
dieser Zahlen bestimmt und ausgibt.

Implementieren Sie das Programm einmal, indem Sie Methoden ohne Rückgabewert nutzen und einmal, indem Sie Methoden mit Rückgabewert verwenden. Im ersten Fall sollen die Ergebnisse also innerhalb der Methoden ausgegeben werden, im zweiten in der Hauptmethode main.
*/



package Scanner;

import java.util.Scanner;

public class BerechnungenMethoden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den ersten Wert (a) ein: ");
        double a = scanner.nextDouble();

        System.out.print("Bitte geben Sie den zweiten Wert (b) ein: ");
        double b = scanner.nextDouble();

        berechneSumme(a, b);
        berechneProdukt(a, b);
        berechneQuotient(a, b);
        berechneMaximum(a, b);
        berechneMittelwert(a, b);
    }

    public static void berechneSumme(double a, double b) {
        double summe = a + b;
        System.out.println("Die Summe ist: " + summe);
    }

    public static void berechneProdukt(double a, double b) {
        double produkt = a * b;
        System.out.println("Das Produkt ist: " + produkt);
    }

    public static void berechneQuotient(double a, double b) {
        if (b == 0) {
            System.out.println("Division durch Null?");
        } else {
            double quotient = a / b;
            System.out.println("Der Quotient ist: " + quotient);
        }
    }

    public static void berechneMaximum(double a, double b) {
        double maximum = Math.max(a, b);
        System.out.println("Das Maximum ist: " + maximum);
    }

    public static void berechneMittelwert(double a, double b) {
        double mittelwert = (a + b) / 2;
        System.out.println("Der Mittelwert ist: " + mittelwert);
    }
}



/* -------------------------------------------------------------------------- Aufgabe 1b -----------------------------------------------------*/
/*
import java.util.Scanner;

public class BerechnungenMethoden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den ersten Wert (a) ein: ");
        double a = scanner.nextDouble();

        System.out.print("Bitte geben Sie den zweiten Wert (b) ein: ");
        double b = scanner.nextDouble();

        double summe = berechneSumme(a, b);
        double produkt = berechneProdukt(a, b);
        double quotient = berechneQuotient(a, b);
        double maximum = berechneMaximum(a, b);
        double mittelwert = berechneMittelwert(a, b);

        System.out.println("Die Summe ist: " + summe);
        System.out.println("Das Produkt ist: " + produkt);
        System.out.println("Der Quotient ist: " + quotient);
        System.out.println("Das Maximum ist: " + maximum);
        System.out.println("Der Mittelwert ist: " + mittelwert);
    }

    public static double berechneSumme(double a, double b) {
        return a + b;
    }

    public static double berechneProdukt(double a, double b) {
        return a * b;
    }

    public static double berechneQuotient(double a, double b) {
        if (b == 0) {
            System.out.println("Division durch Null?");
            return Double.NaN; // Keine gültige Nummer
        } else {
            return a / b;
        }
    }

    public static double berechneMaximum(double a, double b) {
        return Math.max(a, b);
    }

    public static double berechneMittelwert(double a, double b) {
        return (a + b) / 2;
    }
}
*/
