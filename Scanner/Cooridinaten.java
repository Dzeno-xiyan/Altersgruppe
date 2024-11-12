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
    public static boolean istAmStart(String bewegungsfolge) {
        int x = 0;
        int y = 0;

        for (char bewegung : bewegungsfolge.toLowerCase().toCharArray()) {
            switch (bewegung) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'o':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
                default:
                    System.out.println("Ungültige Bewegungsrichtung: " + bewegung);
            }
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Schritte möchtes du gehen? ");
        int anzahlZuege = scanner.nextInt();

        String bewegungsfolge = "";
        for (int i = 0; i < anzahlZuege; i++) {
            System.out.print("Gib die nächste RIchtung ein (N, S, O, W): ");
            bewegungsfolge += scanner.next().toLowerCase();
            
        }

        boolean amStart = istAmStart(bewegungsfolge);

        if (amStart) {
            System.out.println("Der Spieler ist am Startpunkt (0, 0).");
        } else {
            System.out.println("Der Spieler ist nicht am Startpunkt.");
           
        }
    }
}
