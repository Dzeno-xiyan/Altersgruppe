package Scanner;

import java.util.Scanner;

public class ScannerAufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Vornamen ein: ");
        String vorname = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihren Nachnamen ein: ");
        String nachname = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        System.out.println("Ihre Daten lauten:");
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Alter: " + alter);
        scanner.close();
    }
}
