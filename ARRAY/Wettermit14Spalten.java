package Scanner;

public class Wetter2 {
    public static void main(String[] args) {
        // 1. Temperaturen in einem 2D-Array speichern (14 Spalten, 2 Zeilen)
        int[][] temperaturen = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, // Tage
                {12, 14, 10, 7, 11, 13, 12, 15, 15, 18, 16, 13, 10, 12} // Temperaturen
        };

        // 2. Tabelle ausgeben
        System.out.println("Tage:\t");
        for (int col = 0; col < temperaturen[0].length; col++) {
            System.out.print(temperaturen[0][col] + "\t");
        }
        System.out.println("\n");
        System.out.println();

        System.out.println("Temperatur:\t");
        for (int col = 0; col < temperaturen[1].length; col++) {
            System.out.print(temperaturen[1][col] + "\t");
        }
        System.out.println();


        // 3. Größten Temperaturunterschied 
        int maxDiff = 0;
        int diffStart = 0;
        for (int i = 1; i < temperaturen.length; i++) {
            int diff = Math.abs(temperaturen[i][1] - temperaturen[i - 1][1]);
            if (diff > maxDiff) {
                maxDiff = diff;
                diffStart = temperaturen[i - 1][0];
            }
        }
        
        System.out.println("\n");
        System.out.println("Größter Temperaturunterschied: " + maxDiff + " Grad zwischen Tag " + diffStart + " und " + (diffStart + 1));
    }
}
