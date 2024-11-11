package Scanner;

public class LuckyObjekMetho {

    public static boolean isLucky(int ticketNumber) {
        // Umwandlung Zahl in String
        String ticketString = String.valueOf(ticketNumber);

        // Überprüfung, geradee oder ungerade
        if (ticketString.length() % 2 != 0) {
            return false; // ungerade kein lucky ticket
        }

        int middleIndex = ticketString.length() / 2; // Mitte berechnen
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

     // Berechnung der Summe erste und zweite hälfte
        for (int i = 0; i < middleIndex; i++) { // bei 0 Anfangen und hochzählen bis i nicht mehr kleiner die Mitte ist.
            sumFirstHalf += Character.getNumericValue(ticketString.charAt(i)); // Char in Nummer umwandeln 
            sumSecondHalf += Character.getNumericValue(ticketString.charAt(i + middleIndex)); // aber der zweiten Hälfte aus dem i + middle extrahieren
        }

        return sumFirstHalf == sumSecondHalf; // erste und zweite gleich LUCKY
    }

    public static void main(String[] args) {
        int ticketNumber = 411222;
        if (isLucky(ticketNumber)) {
            System.out.println("Das Ticket ist lucky!");
        } else {
            System.out.println("Das Ticket Unlucky");
        }
    }
}
