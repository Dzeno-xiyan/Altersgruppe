/*
 * Geben Sie folgende Konsolenausgaben durch die Verwendung von geschachtelten Schleifen aus:

a)
1 2 3 4
1 2 3 4
1 2 3 4

b) 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

c)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


d) (Fortgeschritten)
12345
  1234
     123
      12
        1
        */


package Scanner;

import java.util.Scanner;

public class MusterAufgaben1 {
    public static void main(String[] args) {
        int rows = 5; // Anzahl der Zeilen
        int rows1 = 4; // 2x dekla für muster a
        int cols = 5; // Maximale Anzahl der Spalten

        // Muster a)
        System.out.println("Muster a):");
        for (int i = 1; i <= rows1; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Muster b)
        System.out.println("\nMuster b):");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Muster c)
        System.out.println("\nMuster c):");
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        // Muster d)
        System.out.println("\nMuster d):");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= cols; j++) {
                if (j <= rows - i) {
                    System.out.print("  "); // Leeerzeichen zum verschieben
                } else {
                    System.out.print(j - (rows - i) + " ");
                }
            }
            System.out.println();
        }
    }
}
