/*
 * Geben Sie das Jahrhundert zurÃ¼ck, in dem sich eine Jahreszahl befindet.
 * Das erste Jahrhundert reicht vom Jahr 1 bis einschlieÃŸlich zum Jahr 100,
 * das zweite vom Jahr 101 bis einschlieÃŸlich zum Jahr 200, usw.
 */


package Scanner;

public class Century {
    public static void main(String[] args) {
        Century c = new Century(); // neue Variable C -> Objekt der Klasse von Century  , "new" erstellt ein neues Objekt von Century , Objekt = c
        int year = 999; // Jahr in int inizialisieren
        System.out.println("Year " + year + " \nCentury:  " + c.yearToCentury(year)); // Ausgabe Jahr , Enterzeichen jahrzent , variable c übergabe zu Jahr gibt ein jahrhundert
        																			 // Wert zurück als INT
    }

    int yearToCentury(int year) { // Int Variable ganzställige Zahl , 
    	// Um das Jahrhundert zu berechnen, teilen wir das Jahr durch 100 und runden auf.
        // Da das erste Jahrhundert vom Jahr 1 bis 100 reicht, müssen wir für Jahre wie 1900, 2000 usw.
        // eine spezielle Behandlung vorsehen.
        if (year % 100 == 0) { //(%) um den Rest der Division von year durch 100 zu berechnen. == 0 : Rest durch 0 teilbar = jahr durch 100 teilbar
            return year / 100; // falls eintrifft geb das Jahr wieder if else beendet , 
        } else { // sonst 
            return year / 100 + 1; // Division durch 100 ,  1 addiert um die korrekte Jahrhundertzahl zu erhalten. BSP: 2000 = 20 jahrhund , 2001 = 21 Jahrhundert etc
        }
    }
}
