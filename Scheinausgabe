package Scanner;
 
import java.util.Scanner;

/* Implementieren Sie ein Programm , welches zu einem vorgegeben Geldwert ausrechnet, 
 * mit welchem Geldscheinen man ihn auszahlen kann. 
 * Die Auswahl 500 , 200 , 100 , 50 , 20 , 10 , 5 Euro stehen zur Verfügung.
 
 *Ausgabe:
 *Wie teilt sich der Geldbetrag : 1058
 *500er - Scheine : 2
 *200er - Scheine : 0
 *100er - Scheine : 0
 *50er 	- Scheine : 0
 *20er  - Scheine : 0
 *10er  - Scheine : 0
 *5er   - Scheine : 0
 *
 *Rest            : 3
 */
/*-----------------------------------------------------------------
public class Scheinausgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geldbetrag: ");
        int betrag = scanner.nextInt();

        int[] scheine = {500, 200, 100, 50, 20, 10, 5};	// Array 

        System.out.println("Wie teilt sich der Geldbetrag: " + betrag);

        for (int scheinwert : scheine) {	// for schleife , neue Variable deklarieren für das durchlaufen , aus dem Array Scheine
            int anzahlScheine = betrag / scheinwert; // neue Variable , divison wie oft passt es rein
            betrag %= scheinwert;	// Berechnung des Restes der division , wird dann wieder dem betrag zugewiesen , wiederholung bis nichts mehr da ist
            System.out.printf("%der Scheine: %d\n", scheinwert, anzahlScheine);  // Platzhalter
        }

        System.out.println("Rest: " + betrag);
    }
}
*/

public class Scheinausgabe {
    public static void main(String[] args) {
        int betrag = 4238; 

        System.out.println("Wie teilt sich der Geldbetrag: " + betrag);

        // 500er Scheine
        int anzahl500er = betrag / 500;
        betrag %= 500;
        System.out.println("500er Scheine: " + anzahl500er);

        // 200er Scheine
        int anzahl200er = betrag / 200;
        betrag %= 200;
        System.out.println("200er Scheine: " + anzahl200er);
        
        // 100er Scheine
        int anzahl100er = betrag / 100;
        betrag %= 100;
        System.out.println("100er Scheine: " + anzahl100er);
        
        // 50er Scheine
        int anzahl50er = betrag / 50;
        betrag %= 50;
        System.out.println("50er Scheine: " + anzahl50er);
        
        // 20er Scheine
        int anzahl20er = betrag / 20;
        betrag %= 20;
        System.out.println("20er Scheine: " + anzahl20er);
        
        // 10er Scheine
        int anzahl10er = betrag / 10;
        betrag %= 10;
        System.out.println("10er Scheine: " + anzahl200er);
        
        // 5er Scheine
        int anzahl5er = betrag / 5;
        betrag %= 5;
        System.out.println("5er Scheine: " + anzahl5er);

        System.out.println("Rest: " + betrag);
    }
}
