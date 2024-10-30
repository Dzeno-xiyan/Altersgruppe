package Scanner;

import java.util.Scanner;

public class Tage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean weitermachen = true;

        while (weitermachen) {
            System.out.print("Jahr: ");
            int jahr = scanner.nextInt();

            while (jahr <= 0) {
                System.out.println("Ne ist nicht, nur Positive Zahlen:");
                jahr = scanner.nextInt();
            }

            System.out.print("Monat (1-12): ");
            int monat = scanner.nextInt();

            while (monat < 1 || monat > 12) {
                System.out.println("Mars?Jupiter? Die Erde hat nur 12 Monate");
                monat = scanner.nextInt();
            }

            boolean istSchaltjahr = istSchaltjahr(jahr);

            int tage;
            switch (monat) {
                case 1, 3, 5, 7, 8, 10, 12:
                    tage = 31;
                    break;
                case 4, 6, 9, 11:
                    tage = 30;
                    break;
                case 2:
                    tage = istSchaltjahr ? 29 : 28;
                    break;
                default:
                    System.out.println("Mars?Jupiter? Die Erde hat nur 12 Monate!"); // Abfangen
                    return;
            }

            System.out.printf("Monat %d des Jahres %d hat %d Tage.%n", monat, jahr, tage);
            if (monat == 2 && istSchaltjahr) {
                System.out.println("Schaltjahr");
            }

            System.out.print("Weitermachen? (j/n): ");
            String Antwort = scanner.next();
            weitermachen = Antwort.equalsIgnoreCase("j");
        }
    }

    public static boolean istSchaltjahr(int jahr) {
        return (jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0;
    }
}
