/* 
Aufgabe 4 ~ Wörter in Ketten
Schwierigkeit:   
Schreiben Sie ein kleines Spiel, bei welchem zwei Spieler Wortketten bilden müssen. Bei diesem
Spiel fängt der erste Spieler an mit einem beliebigen Wort. Der zweite Spieler muss darauf ein Wort
nennen, dessen Anfangsbuchstabe der Endbuchstabe des letzten genannten Wortes ist.
Anschließend ist wieder der erste Spieler dran. Jeder Spieler bekommt dabei die Länge seines
Wortes als Punkte gutgeschrieben. Sollte ein Spieler ein Wort nennen, das die Bedingung nicht
erfüllt, verliert er alle seine Punkte und hat verloren. Gewonnen hat der erste Spieler mit insgesamt
30 Punkten bzw. mit den meisten Punkten.

Mit Hilfe der Methode charAt( index ) der Klasse String können Sie auf einzelne
Buchstaben eines Strings zugreifen. Der erste Buchstabe hat hierbei den Index 0.

Sie können ein Wort mit der Methode toLowerCase() umwandeln, sodass es nur
aus Kleinbuchstaben besteht.

Mit Hilfe der Methode length() der Klasse String können Sie die Länge des Strings
ermitteln.
String text = "Hello";
text.charAt(1); // 'e'
text.toLowerCase(); // "hello"
text.length(); // 5
*/



package Scanner;
import java.util.Scanner;

public class Wortkettenspiel {
    public static void main(String[] args) {
        // Erstellt ein Scanner-Objekt, um Benutzereingaben einzulesen
        Scanner scanner = new Scanner(System.in);

        // Initialisiert die Punktzahlen der Spieler und bestimmt, welcher Spieler beginnt
        int player1Points = 0;
        int player2Points = 0;
        boolean player1Turn = true;

        // Speichert das letzte gültige Wort
        String lastWord = "";

        // Spielschleife, die läuft, bis ein Spieler 60 Punkte erreicht
        while (player1Points < 60 && player2Points < 60) {
            // Fordert den aktuellen Spieler auf, ein Wort einzugeben
            System.out.print("Spieler " + (player1Turn ? "1" : "2") + ", gib ein Wort ein: ");
            // Liest das eingegebene Wort ein und konvertiert es in Kleinbuchstaben
            String word = scanner.nextLine().toLowerCase();

            // Prüft, ob das eingegebene Wort gültig ist (erster Buchstabe stimmt überein)
            if (lastWord.isEmpty() || word.charAt(0) == lastWord.charAt(lastWord.length() - 1)) {
                // Vergibt Punkte für das gültige Wort
                int points = word.length();
                if (player1Turn) {
                    player1Points += points;
                } else {
                    player2Points += points;
                }
                // Speichert das neue Wort als letztes Wort
                lastWord = word;
                System.out.println("Richtig! Du hast " + points + " Punkte erhalten.");
            } else {
                // Setzt die Punkte des aktuellen Spielers auf 0, wenn das Wort ungültig ist
                if (player1Turn) {
                    player1Points = 0;
                } else {
                    player2Points = 0;
                }
                System.out.println("Falsch! Du hast alle Punkte verloren.");
                // Setzt das letzte Wort zurück
                lastWord = "";
            }

            // Wechselt zum nächsten Spieler
            player1Turn = !player1Turn;
        }

        // Gibt die Endergebnisse aus
        System.out.println("Spieler 1 hat " + player1Points + " Punkte.");
        System.out.println("Spieler 2 hat " + player2Points + " Punkte.");

        // Bestimmt den Gewinner
        if (player1Points >= 30) {
            System.out.println("Spieler 1 hat gewonnen!");
        } else {
            System.out.println("Spieler 2 hat gewonnen!");
        }
    }
}
