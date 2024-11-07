package Scanner;




import java.util.Random;
import java.util.Arrays;

public class Arraysfuellen {
    public static void main(String[] args) {
        int arrayLaenge = 20;

        // Array für gerade Zahlen
        int[] geradeZahlen = new int[arrayLaenge];
        Random random = new Random();
        for (int i = 0; i < arrayLaenge; i++) {
            geradeZahlen[i] = random.nextInt(100) * 2;
        }

        // Array für aufsteigend sortierte Zahlen
        int[] aufsteigend = new int[arrayLaenge];
        for (int i = 0; i < arrayLaenge; i++) {
            aufsteigend[i] = i;
        }

        // Array für absteigend sortierte Zahlen
        int[] absteigend = new int[arrayLaenge];
        for (int i = 0; i < arrayLaenge; i++) {
            absteigend[i] = arrayLaenge - i - 1;
        }

        // Array für Primzahlen
        int[] primzahlen = new int[arrayLaenge];
        int primzahlIndex = 0;

        // Array für durch 7 teilbare Zahlen
        int[] durchSiebenTeilbar = new int[arrayLaenge];
        int durchSiebenIndex = 0;

        // Primzahlen und durch 7 teiilbara
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && primzahlIndex < primzahlen.length) { //  Index
                primzahlen[primzahlIndex++] = i;
            }
            if (i % 7 == 0 && durchSiebenIndex < durchSiebenTeilbar.length) { // Index
                durchSiebenTeilbar[durchSiebenIndex++] = i;
            }
        }

        
        System.out.println("Gerade Zahlen:");
        System.out.println(Arrays.toString(geradeZahlen));

        System.out.println("\nAufsteigend sortierte Zahlen:");
        System.out.println(Arrays.toString(aufsteigend));

        System.out.println("\nAbsteigend sortierte Zahlen:");
        System.out.println(Arrays.toString(absteigend));

        System.out.println("\nPrimzahlen:");
        System.out.println(Arrays.toString(Arrays.copyOf(primzahlen, primzahlIndex)));

        System.out.println("\nDurch 7 teilbare Zahlen:");
        System.out.println(Arrays.toString(Arrays.copyOf(durchSiebenTeilbar, durchSiebenIndex)));
    }
}
