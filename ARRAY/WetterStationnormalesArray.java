package Scanner;

public class Wetterstation {
    public static void main(String[] args) {
        // 1. Temperaturen in einem Array speichern
        int[] temperaturen = {12, 14, 10, 7, 11, 13, 12, 15, 15, 18, 16, 13, 10, 12};

        // 2. Tabelle ausgeben
        System.out.println("Tag\tTemperatur");
        for (int i = 0; i < temperaturen.length; i++) {
            System.out.println(i + "\t" + temperaturen[i]);
        }

        // 3. Größten Temperaturunterschied finden
        int maxDifferenz = 0;
        int tag1 = 0, tag2 = 1;
        for (int i = 1; i < temperaturen.length; i++) {
            int differenz = Math.abs(temperaturen[i] - temperaturen[i - 1]);
            if (differenz > maxDifferenz) {
                maxDifferenz = differenz;
                tag1 = i - 1;
                tag2 = i;
            }
        }

        System.out.println("Der größte Temperaturunterschied beträgt " + maxDifferenz + " Grad zwischen Tag " + tag1 + " und Tag " + tag2);
    }
}
