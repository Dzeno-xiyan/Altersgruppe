/* Programmieren Sie vier Schleifen, die die folgenden Zahlenfolgen zur Standardausgabe ausgeben:
  3. -5 -2 1 4 7 10 13 16 194. 
  1 2 4 8 16 32 64 128 256 512 1024 2048 4096 (siehe Anmerkung nach 6.)
  3 4 6 10 18 34 66 130 258 514 1026 2050 4098 
  1 2 4 7 11 16 22 29 37 46 56 67 79 92

*/

package Scanner;

import java.util.Scanner;

public class SchleifenAufgabe11 {
    public static void main(String[] args) {
        // Folge 1: Arithmetische Folge
        System.out.println("Arithmetische Folge:");
        int start = -5;
        int differenz = 3;
        int end = 19;
        for (int i = start; i <= end; i += differenz) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Folge 2: Geometrische Folge
        System.out.println("Geometrische Folge:");
        start = 1;
        int faktor = 2;
        end = 4096;
        int zahl = start;
        while (zahl <= end) {
            System.out.print(zahl + " ");
            zahl *= faktor;
        }
        System.out.println();

        // Folge 3: Quadratzahlen mit Offset
        System.out.println("Quadratzahlen mit Offset:");
        for (int i = 1; i <= 13; i++) {
            int zahl1 = i * i + 2;
            System.out.print(zahl1 + " ");
        }
        System.out.println();

        // Folge 4: Spezialfolge
        System.out.println("Spezialfolge:");
        zahl = 1;
        for (int i = 1; i <= 13; i++) {
            System.out.print(zahl + " ");
            zahl += i;
        }
    }
}
