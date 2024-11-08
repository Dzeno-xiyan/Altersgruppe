package Scanner;

public class StringAufgabe4 {
    public static boolean sindAnagramme(String str1, String str2) {
        // Umlaute ersetzen
        str1 = str1.toLowerCase().replaceAll("[äöüß]", "aeouss");
        str2 = str2.toLowerCase().replaceAll("[äöüß]", "aeouss");

        // Wenn die Längen unterschiedlich sind, können sie keine Anagramme sein
        if (str1.length() != str2.length()) {
            return false;
        }

        // Alphabet 
        int[] charCounts1 = new int[26];
        int[] charCounts2 = new int[26];

        // Zähle die Vorkommen jedes Buchstabens in beiden Strings
        for (int i = 0; i < str1.length(); i++) {
            charCounts1[str1.charAt(i) - 'a']++;
            charCounts2[str2.charAt(i) - 'a']++;
        }

        // Vergleiche die Zählungen
        for (int i = 0; i < 26; i++) {
            if (charCounts1[i] != charCounts2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "Noten";
        String str2 = "Tonen";

        if (sindAnagramme(str1, str2)) {
            System.out.println("Die Strings sind Anagramme.");
        } else {
            System.out.println("Die Strings sind keine Anagramme.");
        }
    }
}
