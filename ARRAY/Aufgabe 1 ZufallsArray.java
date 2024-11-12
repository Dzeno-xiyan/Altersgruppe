/*
1. Erstellen Sie eine Klasse, die ein Integer Array mit 10 Stellen erzeugt. Die einzelnen Stellen werden mit zufälligen Werten von 1-10 gefüllt.

Danach soll das Array sortiert werden. Sichten Sie dazu die Dokumentation der Arrays Klasse.
*/

package Scanner;

import java.util.Arrays;
import java.util.Random;

public class ZufallsArray {
    public static void main(String[] args) {
        int[] zahlen = new int[10];
        Random random = new Random();

        // Array mit Zufallszahlen füllen
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = random.nextInt(10) + 1; // Zufällige Zahl zwischen 1 und 10
        }

        // Array sortieren
        Arrays.sort(zahlen);

        // Sortiertes Array ausgeben
        System.out.println("Sortiertes Array: " + Arrays.toString(zahlen));
    }
}
