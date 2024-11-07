package Scanner;

public class MusterAufgaben1 {
    public static void main(String[] args) {
        // Muster a)
        System.out.println("Muster a):");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Muster b)
        System.out.println("\nMuster b):");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Muster c)
        System.out.println("\nMuster c):");
        int zahl = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(zahl++ + " ");
            }
            System.out.println();
        }
    }
}
