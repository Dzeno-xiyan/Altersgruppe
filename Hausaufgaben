package Scanner;

import java.util.Scanner;										// einfügen für die Scanner Funktion also Handeingabe

public class Hausaufgaben {
	
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);					// System input scanner

    boolean weitermachen = true; 								// False am Ende deklariert

    while (weitermachen) {										// QUal der Wahl
    	 System.out.println("Was möchtest du tun?");
         System.out.println("1. Zahl größer als 5 prüfen");
         System.out.println("2. Produkt berechnen Multiplikation");
         System.out.println("3. Division berechnen");
         System.out.println("4. Subtraktion berechnen");
         System.out.println("5. Addition berechnen");
         System.out.println("6. Beenden");
         System.out.print("Deine Wahl: ");
        int wahl = scanner.nextInt();

        switch (wahl) {
      
        
            case 1:		// Eine Zahl eingeben soll größer oder kleiner 5 sein
            	System.out.print("Gib eine positive ganze Zahl ein: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ungültige Eingabe. Bitte gib eine positive ganze Zahl ein: Sonst Nachsitzen Dokumente bearbeiten ");
                    scanner.next();
                }
                int zahl = scanner.nextInt();

                if (zahl <= 0) {
                    System.out.println("Bitte gib eine positive Zahl ein. Größer als 0 du Pfeife");
                } else if (zahl > 5) {
                    System.out.println("Herr Müller sagt: Ihr dürft nach Hause gehen. Da die Zahl größer 5 ist");
                } else {
                    System.out.println("Ahah, nicht möglich unter 5 dulden wir nicht. Herr Müller sagt: Sie dürfen dennoch nach Hause gehen.");
                }
                break; // Aus dem Case ausbrechen in Case 2 etc 
                
                
            case 2:	 // Multiplikation 
            	System.out.print("Gib den ersten Wert für das Produkt ein: ");
                int a = scanner.nextInt();
                System.out.print("Gib den zweiten Wert für das Produkt ein: ");
                int b = scanner.nextInt();
                int produkt = a * b;
                System.out.println("Das Produkt von " + a + " und " + b + " ist: " + produkt);
                break;// Aus dem Case ausbrechen in Case 3 etc 
                
                
            case 3:	// Division
            	System.out.print("Gib den Dividenden ein: ");
            	while (!scanner.hasNextDouble()) {
            	    System.out.println("Ungültige Eingabe. Bitte gib eine Kommazahl ein: ");
            	    scanner.next();
            	}
            	double x = scanner.nextDouble();

            	System.out.print("Gib den Divisor ein: ");
            	while (!scanner.hasNextDouble()) {
            	    System.out.println("Ungültige Eingabe. Bitte gib eine Kommazahl ein: ");
            	    scanner.next();
            	}
            	double y = scanner.nextDouble();

            	if (y == 0) {
            	    System.out.println("Division durch Null ist nicht definiert!");
            	} else {
            	    double ergebnis = x / y;
            	    System.out.printf("Das Ergebnis der Division von %.2f durch %.2f ist: %.2f%n", x, y, ergebnis);
            	}
                break; // Aus dem Case ausbrechen in Case 4 etc
                
                
            case 4:
                // Subtraktion
                System.out.print("Gib den ersten Wert für die Subtraktion ein: ");
                int a1 = scanner.nextInt();
                System.out.print("Gib den zweiten Wert für die Subtraktion ein: ");
                int b1 = scanner.nextInt();
                int differenz = a1 - b1;
                System.out.println("Die Differenz von " + a1 + " und " + b1 + " ist: " + differenz);
                break;// Aus dem Case ausbrechen in Case 5 etc
                
                
            case 5:
                // Addition
                System.out.print("Gib den ersten Wert für die Addition ein: ");
                int x1 = scanner.nextInt();
                System.out.print("Gib den zweiten Wert für die Addition ein: ");
                int y1 = scanner.nextInt();
                int summe = x1 + y1;
                System.out.println("Die Summe von " + x1 + " und " + y1 + " ist: " + summe);
                break; // Aus dem Case ausbrechen in Case 6 etc 
            
            case 6:
            	
                weitermachen = false; // Programm mit Taste 6 beenden als 6 Case, True 1-5 ab zum anfang
                System.out.println("Programm beendet.");
                break;
            default:
                System.out.println("Ungültige Wahl. Nur von 1 bis 6 Erlaubt");
            
     
        }
    }}}
