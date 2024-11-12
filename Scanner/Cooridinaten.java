/*Erstellen Sie ein Java Programm, welches folgende Aufgabenstellung löst:

Ein Spieler kann ich in einem zweidimensionalen Raum in alle Himmelsrichtungen (Norden „N“,

Süden „S“, Osten „O“ und Westen „W“) bewegen. Entwickeln Sie einen Algorithmus, der für eine

beliebe Bewegungseingabe ausgibt, ob der Spieler wieder am Start steht.

Beispiel:

"NOWS" -> True
*/

package Scanner;


import java.util.Scanner;

public class Coordinaten {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Gib die nächste Richtung ein (N, S, O, W): ");
            String richtung = scanner.nextLine().toLowerCase();

            switch (richtung) {
                case "n":
                    y++;
                    break;
                case "s":
                    y--;
                    break;
                case "o":
                    x++;
                    break;
                case "w":
                    x--;
                    break;
                default:
                    System.out.println("Ungültige Richtung!");
            }
        }

        if (x == 0 && y == 0) {
            System.out.println("Der Spieler ist am Startpunkt (0, 0).");
        } else {
            System.out.println("Der Spieler ist bei den Koordinaten (" + x + ", " + y + ").");
        }
    }
}
