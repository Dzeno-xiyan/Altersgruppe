package Scanner;

import java.util.Scanner;

public class GummibaerchenTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Tütchen möchten Sie zählen? ");
        int anzahlTueten = scanner.nextInt();

        int[] zaehler = new int[3]; // 0: zu wenig, 1: korrekt, 2: zu viel

        for (int i = 0; i < anzahlTueten; i++) {
            System.out.print("Wie viele Gummibärchen waren in Tüte " + (i + 1) + "? ");
            int anzahlGummibaerchen = scanner.nextInt();

            if (anzahlGummibaerchen < 12) {
                zaehler[0]++;
            } else if (anzahlGummibaerchen == 12) {
                zaehler[1]++;
            } else {
                zaehler[2]++;
            }
        }

        System.out.println("\nErgebnisse:");
        System.out.println("Tüten mit weniger als 12 Gummibärchen: " + zaehler[0]);
        System.out.println("Tüten mit genau 12 Gummibärchen: " + zaehler[1]);
        System.out.println("Tüten mit mehr als 12 Gummibärchen: " + zaehler[2]);

        // Weitere Auswertungen (Beispiel: Durchschnitt)
        double durchschnitt = (double) (zaehler[1] * 12 + zaehler[0] * 11.5 + zaehler[2] * 12.5) / anzahlTueten;
        System.out.println("Durchschnittliche Anzahl von Gummibärchen pro Tüte: " + durchschnitt);
    }
}
