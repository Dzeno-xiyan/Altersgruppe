package Scanner;

import java.util.Scanner;



public class Cesaaaar3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Verschiebung an (Zahl zwischen 1 und 25): ");
        int shift = scanner.nextInt();

        System.out.print("Bitte geben Sie den Klartext ein: ");
        scanner.nextLine(); // Überspringt den Zeilenumbruch nach nextInt()
        String clearText = scanner.nextLine();

        // Verschlüsselung
        String encryptedText = encrypt(clearText, shift);
        System.out.println("Der verschlüsselte Text lautet: " + encryptedText);

        // Entschlüsselung
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Der entschlüsselte Text lautet: " + decryptedText);
    }

    public static String encrypt(String clearText, int shift) {
        StringBuilder sb = new StringBuilder();
        clearText = clearText.toLowerCase();

        for (char c : clearText.toCharArray()) {
            if (Character.isLetter(c)) {
                int originalAlphabetPosition = c - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                char encryptedChar = (char) ('a' + newAlphabetPosition);
                sb.append(encryptedChar);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String decrypt(String encryptedText, int shift) {
        StringBuilder sb = new StringBuilder();
        encryptedText = encryptedText.toLowerCase();

        for (char c : encryptedText.toCharArray()) {
            if (Character.isLetter(c)) {
                int originalAlphabetPosition = c - 'a';
                int newAlphabetPosition = (originalAlphabetPosition - shift + 26) % 26;
                char decryptedChar = (char) ('a' + newAlphabetPosition);
                sb.append(decryptedChar);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
