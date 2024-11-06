package ial.aufgaben;

/*Anweisung:
 	Eine Firma die Tiernahrung verkauft hat Sie gebeten eine Software zu schreiben,
 	welche den passenden Mengenrabatt bei einer Bestellung berechnet. 
 	Ab 10kg soll es einen Rabatt von 10% geben und ab 50kg von 20%. 
	Schreiben Sie ein Programm, welches zunächst den Preis pro Kilogramm 
	und danach die Bestellmenge einließt.
	Danach soll das Programm den Preis ohne Rabatt, mit Rabatt und die Differenz ausgeben.
	
	Soll-Verhalten:
	Menge >= 10 && Menge < 50				->	10% Rabatt
	Menge >= 50								->  20% Rabatt
	
	Eingaben unter 0 / Fehlerhafte Eingaben behandeln
	
	Ausgabe:
	
 */

import java.math.*;

public class Praktiker {

	public static void main(String[] args) {
		double cost = 3.89;										// cost per kilogram
		double amount = 21.35;									// amount in kilogram
		double discount = 0;
		double totalcost = cost * amount;
		
		totalcost = (double)Math.round(totalcost * 100) / 100 ;	// round total cost
		
		
		if (amount >= 10 && amount < 50) {
			discount = (totalcost) * 0.1;
		}
		else if (amount >= 50) {
			discount = (totalcost) * 0.2;
		}
		
		discount = (double)Math.round(discount * 100) / 100;	// round discount
		
		
		System.out.print("Total cost:\t" + totalcost + "€" +
						 "\nWith discount:\t" + (totalcost - discount) + "€" +
						 "\nYou saved: \t" + discount + "€");

	}

}
