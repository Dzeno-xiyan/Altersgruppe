package Scanner;

public class Wetterdaten {
    public static void main(String[] args) {
        // 1. Temperaturen in einem 2D-Array speichern Dim 1 Tag Dim 2 Temp
        int[][] wetterDaten = {
                {0, 12}, {1, 14}, {2, 10}, {3, 7}, {4, 11}, {5, 13}, 
                {6, 12}, {7, 15}, {8, 15}, {9, 18}, {10, 16}, {11, 13}, {12, 10}, {13, 12}
        };

        // 2. Tabelle ausgeben
        System.out.println("Tag\tTemperatur");
        for (int i = 0; i < wetterDaten.length; i++) {
            System.out.println(wetterDaten[i][0] + "\t" + wetterDaten[i][1]);
        }

        // 3. Größten Temperaturunterschied finden
        int maxDifferenz = 0;
        int tag1 = 0, tag2 = 1;
        for (int i = 1; i < wetterDaten.length; i++) {
            int differenz = Math.abs(wetterDaten[i][1] - wetterDaten[i - 1][1]);
            if (differenz > maxDifferenz) {
                maxDifferenz = differenz;
                tag1 = wetterDaten[i - 1][0];
                tag2 = wetterDaten[i][0];
            }
        }

        System.out.println("Der größte Temperaturunterschied beträgt " + maxDifferenz + " Grad zwischen Tag " + tag1 + " und Tag " + tag2);
    }
}
