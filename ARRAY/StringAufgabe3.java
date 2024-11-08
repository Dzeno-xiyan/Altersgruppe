package Scanner;

public class StringAufgabe3 {
    public static void main(String[] args) {
        String str = "00000000015704204";

        // Funktion und Speichern des Ergebnisses
        String result = entferneNullen(str);

        System.out.println(result); // Ausgabe: 15704204 <- Aufgabe gelößt 
    }

    // Deklaration von der Methode entefne nullen
    public static String entferneNullen(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                return str.substring(i);
            }
        }
        return "";
    }
}
