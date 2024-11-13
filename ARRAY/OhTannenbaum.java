/* Aufgabe 3 ~ Oh Tannenbaum!
Schwierigkeit:   

Da schon bald wieder Weihnachten ist, schreiben Sie ein Programm welches einen Tannenbaum
auf der Konsole ausgeben kann. Hierfür benötigen Sie zwei Methoden. Die erste Methode soll die
Krone des Baums ausgeben, die zweite Methode den Stamm. Der Benutzer soll zudem angeben
können, wie hoch die Krone des Baums sein soll. Der Stamm des Tannenbaums ist hierbei ein
drittel so hoch wie die Krone. Zudem ist der Stamm auch nur ein drittel so breit wie die breiteste
Stelle der Baumkrone. Für ein symmetrisches Bild muss die Breite des Stamms auch immer eine
ungerade Zahl sein.
Die Ausgabe kann beispielsweise so aussehen:

Crown Height: 7
  	     #
        ###
       #####
      #######
     #########
    ###########
   #############
      #####
      #####
Für ihr Programm können Sie folgende Methoden als Vorlage benutzen.

public static void printCrown(int height) {
}
public static void printStem(int height, int width, int gap) {
}
*/

package Scanner;

import java.util.Scanner;
import java.util.*;

public class ohtannenbaum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Höhe der Baumkrone ein: ");
        int kronenHoehe = scanner.nextInt();

        // Stammhöhe und -breite berechnen
        int stammHoehe = kronenHoehe / 3;
        int breitesteZeile = 2 * kronenHoehe - 1;
        int stammBreite = breitesteZeile / 3;

        // Krone und Stamm 
        printCrown(kronenHoehe);
        printStem(stammHoehe, stammBreite, (kronenHoehe - stammBreite) / 2, breitesteZeile);
    }

    public static void printCrown(int height) {
        for (int i = 1; i <= height; i++) {
            // Anzahl der Leerzeichen vor den Sternen berechnen
            int spaces = height - i;
            // Anzahl der Sterne berechnen
            int stars = 2 * i - 1;

            // Leerzeichen und Sterne ausgeben
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void printStem(int height, int width, int gap, int breitesteZeile) {
        for (int i = 0; i < height; i++) {
            // Neuer Abstand, um den Stamm nach rechts zu verschieben
            int newGap = gap + (breitesteZeile / 4); // <- abfuck

            for (int j = 0; j < newGap; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
