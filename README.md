# Altersgruppe
Altersgruppe

package Scanner;

import java.util.Scanner;

public class Altersueberpruefung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean weitermachen = true;

        while (weitermachen) {
            System.out.print("Alter: ");

            while (true) {
                if (scanner.hasNextInt()) {
                	
                    int alter = scanner.nextInt();
                    if (alter >= 0) {
                    
                        switch (alter) {
                        
                            case 0:
                            	System.out.println("Sehr gut!");
                            break;
                            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13:
                                System.out.println("Du darfst noch nicht Mofa fahren.");
                                break;
                            case 14, 15:
                                System.out.println("Du darfst Mofa fahren, aber nicht Moped.");
                                break;
                            case 16, 17:
                                System.out.println("Du darfst Moped fahren, aber nicht Auto.");
                                break;
                            case 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99:
                                System.out.println("Theoretisch darfst du Auto fahren, praktisch lass es lieber.");
                                break;
                            default:
                                if (alter >= 100) {
                                    System.out.println("Gültigkeit abgelaufen. Gut gemeistert bis hier her ! Viel Erfolg weiterhin !");
                                } else {
                                    System.out.println("Du darfst endlich Auto fahren!");
                                }
                        }
                        break; // Schleife verlassen
                    } else {
                        System.out.println("Zombie? Alien? Mumifiziert?" + alter + "Gratulation du bist der erste!");
                    }
                } else {
                    System.out.println("Also , oder . gibt es nicht , ganz oder gar nicht!");
                    scanner.next(); // Ungültige Eingabe überspringen
                }
            }

            // Wiederholung
            System.out.print("Ab an den Anfang? (ja/nein): ");
            String antwort = scanner.next();
            weitermachen = antwort.equalsIgnoreCase("ja");
        }
    }
}
