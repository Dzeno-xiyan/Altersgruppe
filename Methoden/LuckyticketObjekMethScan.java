package Scanner;

import java.util.Scanner;

public class LuckyObjekMethoScanner {

    public static boolean isLucky(int ticketNumber) {
        // Umwandlung der Zahl in einen String für eine einfachere Bearbeitung
        String ticketString = String.valueOf(ticketNumber);

        // Überprüfung, geradee oder ungerade
        if (ticketString.length() % 2 != 0) {
            return false; // ungerade kein lucky ticket
        }

        int middleIndex = ticketString.length() / 2; // Mitte Berechnen
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        // Berechnung der Summe erste und zweite hälfte
        for (int i = 0; i < middleIndex; i++) { // bei 0 Anfangen und hochzählen bis i nicht mehr kleiner die Mitte ist.
            sumFirstHalf += Character.getNumericValue(ticketString.charAt(i));// Char in Nummer umwandeln 
            sumSecondHalf += Character.getNumericValue(ticketString.charAt(i + middleIndex));//zweiten Hälfte aus dem i + middle extrahieren 
            // hoch zählen und vergleichen
        }

        return sumFirstHalf == sumSecondHalf; // erste und zweite gleich?
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihre Ticketnummer ein: ");
        int ticketNumber = scanner.nextInt();

        if (isLucky(ticketNumber)) {
            System.out.println("Das Ticket ist lucky!");
        } else {
            System.out.println("Das Ticket unlucky.");
        }

        scanner.close(); 
    }
}
