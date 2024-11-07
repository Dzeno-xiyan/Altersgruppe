package Scanner;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        double guthaben = 1337.13; // Anfangsguthaben
        abheben(guthaben);
    }

    public static void abheben(double guthaben) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ihr Guthaben beträgt " + guthaben + " Euro.");
        System.out.print("Wie viel Geld wollen Sie abheben? ");
        double abheben = scanner.nextDouble();

        if (abheben <= guthaben) {
            System.out.println("Es werden " + abheben + " Euro ausgezahlt.");
            guthaben -= abheben;
            System.out.println("Ihr neues Guthaben beträgt " + guthaben + " Euro.");
        } else {
            System.out.println("Keine Auszahlung! Dieser Betrag übersteigt Ihr Guthaben.");
        }
    }
}
