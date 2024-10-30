package Scanner;

import java.util.Scanner;

public class TageImMonat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner setzen als Vari

        int monat; // Vari Init

        do {
            System.out.print("Welches Jahr: ");
            int jahr = scanner.nextInt();

            System.out.print("Monat (1-12): ");
            monat = scanner.nextInt();

            if (monat < 1 || monat > 12) {
                System.out.println("Das Jahr hat nur 12 Monate, wo lebst du Mars?");
            } else {
                // Funktion um zu überprüfen, ob ein Jahr ein Schaltjahr ist
                boolean istSchaltjahr = istSchaltjahr(jahr);

                int tage = 0;		// Variable init

                switch (monat) {
                    case 1, 3, 5, 7, 8, 10, 12: // Monate mit 31 Tagen
                        tage = 31;
                        break;
                    case 4, 6, 9, 11:	// Monate mit 30 Tagen
                        tage = 30;
                        break;
                    case 2:
                        if (istSchaltjahr) {
                            tage = 29;		// Schaltjahr
                        } else {
                            tage = 28;
                        }
                        break;
                }

                System.out.print("Monat " + monat + " des Jahres " + jahr + " gibt es " + tage + " Tage.");
                if (tage == 29) {
                    System.out.println(" Schaltjahr");
                }
                System.out.println();
            }
        } while (monat < 1 || monat > 12);
    }

    public static boolean istSchaltjahr(int jahr) { // Schaltjahr berechnung
        return (jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0;
    }
}
