package Scanner;

import java.util.Scanner;

public class Cverschluesselung {

    public static String verschluesseln(String text, int verschiebung) {
        StringBuilder verschluesselterText = new StringBuilder();

        // Alphabet ausgeben
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char verschluesselterBuchstabe = (char) (c + verschiebung);
                if (Character.isUpperCase(c)) {
                    if (verschluesselterBuchstabe > 'Z') {
                        verschluesselterBuchstabe = (char) ('A' + (verschluesselterBuchstabe - 'Z' - 1));
                    }
                } else {
                    if (verschluesselterBuchstabe > 'z') {
                        verschluesselterBuchstabe = (char) ('a' + (verschluesselterBuchstabe - 'z' - 1));
                    }
                }
                verschluesselterText.append(verschluesselterBuchstabe);
            } else {
                verschluesselterText.append(c); // Nicht-Buchstaben unverändert lassen
            }
        }

        return verschluesselterText.toString();
    }

    public static void main(String[] args) {
        String originalText = "Endlich wieder bei Herr Müller! ZYZ";
        int verschiebung = 1; // um wieviele stellen schieben
        String verschluesselterText = verschluesseln(originalText, verschiebung);
        System.out.println("Original: " + originalText);
        System.out.println("Verschlüsselt: " + verschluesselterText);
    }
}
