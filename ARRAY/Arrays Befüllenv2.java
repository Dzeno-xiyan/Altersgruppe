package Scanner;




/* ----------------------------   Arrays Random = Zufällig befüllen --------------------- */

import java.util.Random;

public class ArraysfüllenBSP {
    public static void main(String[] args) {
        int arrayLaenge = 10; // Passe die Länge der Arrays nach Bedarf an
        Random random = new Random();

        // Array mit zufälligen Zahlen von 1 bis 10
        int[] zahlenArray = new int[arrayLaenge];
        for (int i = 0; i < arrayLaenge; i++) {
            zahlenArray[i] = random.nextInt(10) + 1; // Zufallszahl zwischen 1 und 10
        }

        // Array mit zufälligen Buchstaben von 'a' bis 'z'
        char[] buchstabenArray = new char[arrayLaenge];
        for (int i = 0; i < arrayLaenge; i++) {
            buchstabenArray[i] = (char) ('a' + random.nextInt(26)); // Zufälliger Buchstabe zwischen 'a' und 'z'
        }

        // Array mit zufälligen Double-Werten zwischen 0.0 und 1.0
        double[] doubleArray = new double[arrayLaenge];
        for (int i = 0; i < arrayLaenge; i++) {
            doubleArray[i] = random.nextDouble();
        }

        // Ausgabe der Arrays 
        System.out.println("Zahlen-Array:");
        for (int zahl : zahlenArray) {
            System.out.print(zahl + " ");
        }
        System.out.println();

        System.out.println("Buchstaben-Array:");
        for (char buchstabe : buchstabenArray) {
            System.out.print(buchstabe + " ");
        }
        System.out.println();

        System.out.println("Double-Array:");
        for (double zahl : doubleArray) {
            System.out.print(zahl + " ");
        }
        System.out.println();
    }
}











/*   --------------------------------------------------------------------------------------------------------------

       Int Array füllen von 1 bis 10 
 * 

public class ArraysfüllenBSP {
    public static void main(String[] args) {
        int[] zahlenArray = new int[10];

        for (int i = 0; i < zahlenArray.length; i++) {
            zahlenArray[i] = i + 1;
        }

        // Ausgabe des Arrays (optional)
        for (int zahl : zahlenArray) {
            System.out.print(zahl + " ");
        }
    }
}
 */

/* 	---------------------------------------------------------------------------------
 * 
			Char Array füllen von a bis j 
  

public class ArraysfüllenBSP {
    public static void main(String[] args) {
        char[] buchstabenArray = new char[10];
        char startBuchstabe = 'a';

        for (int i = 0; i < buchstabenArray.length; i++) {
            buchstabenArray[i] = (char) (startBuchstabe + i);
        }

        // Ausgabe des Arrays (optional)
        for (char buchstabe : buchstabenArray) {
            System.out.print(buchstabe + " ");
        }
    }
}

 */

/*   -----------------------------------------------------------------------------------

				Double Array füllen 
  


public class ArraysfüllenBSP {
    public static void main(String[] args) {
        int arrayLaenge = 10;
        double[] doubleArray = new double[arrayLaenge];

        for (int i = 0; i < arrayLaenge; i++) {
            doubleArray[i] = (double) i / (arrayLaenge - 1);
        }

        // Ausgabe des Arrays (optional)
        for (double zahl : doubleArray) {
            System.out.print(zahl + " ");
        }
    }
}
 */

