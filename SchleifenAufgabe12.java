/* Anmerkungzu4.: Einen Potenzoperator oder eine Potenzfunktion für Ganzzahlen gibtes in Java nicht.
 * Für die folgenden Aufgaben nehmen Sie bitte an,
 * dass eine Ganzzahl variable namens norbert ver-einbart und mit einer Zahl größer als 0 initialisiert wurde, 
 * etwa so:int norbert = EM.liesInt(); // Der Benutzer gibt eine positive Zahl ein
 * !.7.BefehlenSiedemAusführer,den größten Teilervon norbert (derkleinerals norbert ist)aus-zugeben. 
 * Falls norbert eine Primzahl ist, soll 1 ausgegeben werden.
 * 8.BefehlenSiedemAusführer,den kleinsten Teilervon norbert (dergrößerals1ist)auszugeben.
 * Falls norbert eine Primzahl ist, soll norbert selbst ausgegeben werden.
 * 9.BefehlenSiedemAusführer,dieMeldung "norbertistprim" bzw. "norbertistnicht prim" auszugeben,
 *  je nachdem, ob die Variable norbert eine Primzahl enthält oder nicht
 */





package Scanner;

import java.util.Scanner;

public class Schleifenaufgabe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine positive ganze Zahl ein: ");
        int norbert = scanner.nextInt();

        // Größter Teiler kleiner als norbert
        int groessterTeiler = 1;
        for (int i = norbert - 1; i > 1; i--) {
            if (norbert % i == 0) {
                groessterTeiler = i;
                break;
            }
        }
        System.out.println("Der größte Teiler von " + norbert + " ist: " + groessterTeiler);

        // Kleinster Teiler größer als 1
        int kleinsterTeiler = norbert;
        for (int i = 2; i <= Math.sqrt(norbert); i++) {
            if (norbert % i == 0) {
                kleinsterTeiler = i;
                break;
            }
        }
        System.out.println("Der kleinste Teiler von " + norbert + " ist: " + kleinsterTeiler);

        // Primzahlprüfung
        boolean istPrim = true;
        for (int i = 2; i <= Math.sqrt(norbert); i++) {
            if (norbert % i == 0) {
                istPrim = false;
                break;
            }
        }
        if (istPrim) {
            System.out.println("norbert ist prim");
        } else {
            System.out.println("norbert ist nicht prim");
        }
    }
}
