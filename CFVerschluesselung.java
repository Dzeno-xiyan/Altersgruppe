package Scanner;

import java.util.Scanner;

public class FCverschluesselung {
    public static String verschluesseln(String text, int verschiebung) {
        StringBuilder verschluesselterText = new StringBuilder();

        // Alphabet
        System.out.print("Alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        // Buchstaben des Textes einzeln bearbeiten
        for (char c : text.toCharArray()) {
            // Nur Buchstaben außer Z werden verschlüsselt
            if (Character.isLetter(c) && c != 'Z') {
                // Berechnung der Verschiebung
                char verschluesselterBuchstabe = (char) (c + verschiebung);

                // Wenn der verschobene Buchstabe über das Alphabet hinausgeht,
                // wird er wieder an den Anfang gesetzt (für Großbuchstaben)
                if (Character.isUpperCase(c)) {
                    if (verschluesselterBuchstabe > 'Y') {
                        verschluesselterBuchstabe = (char) ('A' + (verschluesselterBuchstabe - 'Y' - 1));
                    } else if (verschluesselterBuchstabe < 'A') {
                        verschluesselterBuchstabe = (char) ('Y' + (verschluesselterBuchstabe - 'A' + 1));
                    }
                } else { // Für Kleinbuchstaben
                    if (verschluesselterBuchstabe > 'z') {
                        verschluesselterBuchstabe = (char) ('a' + (verschluesselterBuchstabe - 'z' - 1));
                    } else if (verschluesselterBuchstabe < 'a') {
                        verschluesselterBuchstabe = (char) ('z' + (verschluesselterBuchstabe - 'a' + 1));
                    }
                }

                // Füge den verschlüsselten Buchstaben zum Ergebnis hinzu
                verschluesselterText.append(verschluesselterBuchstabe);
            } else {
                // Z und andere Nicht-Buchstaben unverändert lassen
                verschluesselterText.append(c);
            }
        }

        return verschluesselterText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Text eingabenn: ");
        String originalText = scanner.nextLine();

        System.out.println("Verschlüsselungsmethode:");
        System.out.println("1. Normale Caesar-Verschlüsselung");
        System.out.println("2. Fortgeschrittene Caesar-Verschlüsselung (alle Verschiebungen)");
        int methode = scanner.nextInt();

        if (methode == 1) {
            System.out.print(" Verschiebung: "); // Verschiebung 
            int verschiebung = scanner.nextInt();
            String verschluesselterText = verschluesseln(originalText, verschiebung);
            System.out.println("Verschlüsselter Text: " + verschluesselterText);
        } else if (methode == 2) {
            for (int i = 0; i <= 24; i++) { 
                String verschluesselterText = verschluesseln(originalText, i);
                System.out.println("Verschlüsselter Text mit Verschiebung " + i + ": " + verschluesselterText);
            }
        } else {
            System.out.println("Ungültig:");
        }
    }
}
