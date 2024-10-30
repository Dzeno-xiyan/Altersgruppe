/* Aufgabe:

Erstellen Sie eine Klasse Wochenablauf, die per Switch-Case in der Konsole ausgibt was erledigt werden muss:

Montag: Einkaufen

Dienstag: Fortbildung

Donnerstag: Sport

Freitag: Party

Sonntag: Freunde treffen

Wenn nichts geplant ist dann wird sich um den Haushalt gekümmert.   */



package Scanner;


import java.util.Scanner;

public class wochenablauf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Wochentag als Zahl (1-7): ");
            int tag = scanner.nextInt();

            switch (tag) {
                case 1:
                    System.out.println("Montag: Einkaufen");
                    break;
                case 2:
                    System.out.println("Dienstag: Fortbildung");
                    break;
                case 3:
                    System.out.println("Mittwoch: Haushalt");
                    break;
                case 4:
                    System.out.println("Donnerstag: Sport");
                    break;
                case 5:
                    System.out.println("Freitag: Party");
                    break;
                case 6:
                    System.out.println("Samstag: Haushalt");
                    break;
                case 7:
                    System.out.println("Sonntag: Freunde treffen");
                    break;
                case 8:
                    tag = 1; 
                    System.out.println("BINGO GEWONNEN FREI ");
                    break;
                case 9 :
                	
                default:
                    System.out.println(" Nur eins bis 8 Möglich");
                 
            }
        }
    }

}




---------------------------------------------------  Manuelle Eingabe ------------------------------------

/*
package Scanner;

import java.util.Scanner;

public class wochenablauf {
    public static void main(String[] args) {
        int tag = 8; 

        switch (tag) {
            case 1:
                System.out.println("Montag: Einkaufen");
                break;
            case 2:
                System.out.println("Dienstag: Fortbildung");
                break;
            case 4:
                System.out.println("Donnerstag: Sport");
                break;
            case 5:
                System.out.println("Freitag: Party");
                break;
            case 7:
                System.out.println("Sonntag: Freunde treffen");
                break;
            default:
                if (tag == 3 || tag == 6) {
                    System.out.println("Haushalt");
                } else {
                    System.out.println("Ungültige Eingabe");
                }
        }
    }
}
*/



------------------------------------------ if else Abfrage --------------------------------------------------

/*
package Scanner;
public class Wochenplan {
    public static void main(String[] args) {
        int tag = 3; 

        if (tag == 1) {
            System.out.println("Montag: Einkaufen");
        } else if (tag == 2) {
            System.out.println("Dienstag: Fortbildung");
        } else if (tag == 3) {
            System.out.println("Mittwoch: Haushalt");
        } else if (tag == 4) {
            System.out.println("Donnerstag: Sport");
        } else if (tag == 5) {
            System.out.println("Freitag: Party");
        } else if (tag == 6) {
            System.out.println("Samstag: Haushalt");
        } else if (tag == 7) {
            System.out.println("Sonntag: Freunde treffen");
        } else {
            System.out.println("Ungültige Eingabe");
        }
    }
}



----------------------- Einfache Lösung mit Arrayss ---------------------------------------


/*public class wochenablauf {
 * 
 */
 /* 
    public static void main(String[] args) {
        String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        int tag = 3; 

        switch (wochentage[tag - 1]) { 
            case "Montag":
                System.out.println("Einkaufen");
                break;
            case "Dienstag":
                System.out.println("Fortbildung");
                break;
            case "Donnerstag":
                System.out.println("Sport");
                break;
            case "Freitag":
                System.out.println("Party");
                break;
            case "Sonntag":
                System.out.println("Freunde treffen");
                break;
            default:
                System.out.println("Haushalt");
        }
    }
} */
