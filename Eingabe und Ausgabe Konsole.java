Eingaben und Ausgaben in der Konsole 
Ausgabe in der Konsole
Für die Ausgabe in einem Konsolenprogramm nutzen wird die Klasse System. Diese bietet uns mit den Methoden println und print die Möglichkeit, einfache und zusammengesetzte Zeichenketten auszugeben. Der Unterschied zwischen println und print besteht darin, dass println nach der Ausgabe noch in die nächste Zeile springt, print nicht.

Beispiele für einfache und zusammengesetzte Ausgaben:

int i = 1;
 
System.out.println(i);                          // 1
System.out.println("Hallo");                    // Hallo
System.out.println("Die Zahl ist " + i + ".");  // Die Zahl ist 1.
Eingabe in einer Konsole
Für die Eingabe in einem Konsolenprogramm nutzen wir den Java Scanner. Dies ist eine Klasse, welche uns die Java API anbietet – wir müssen nicht wirklich wissen, wie sie arbeitet, nur wie wir sie verwenden.

Vor der Verwendung muss die Scannerklasse importiert werden – dies funktioniert (z. B. in Intellij) automatisch, wenn ein Scanner vereinbart wird. Danach wird ein Scanner-Objekt erzeugt, dieses kann nun beliebige Werte einlesen.

import java.util.Scanner; //Importanweisung für den Scanner
 
public class ScannerTest {
 
    public static void main(String[] args) {
        int i;
        double d;
        String s;
         
        Scanner sc = new Scanner(System.in);    // neues Scanner-Objekt sc
        i = sc.nextInt();                       // Einlesen einer Integer-Zahl
        System.out.println("Die Zahl ist " + i + ".");
        d = sc.nextDouble();                    // Einlesen einer Double-Zahl
        System.out.println("Die Double-Zahl ist" + d + ".");
        s = sc.next();                          // Einlesen eines Strings
        System.out.println(s);
    }
}
