/*
 	Anweisung:
 	Für die Berechnung des Body-Mass-Index (BMI) sollen Sie ein Programm schreiben. Der Body-Mass-
	Index dient als Maß zur generellen Beurteilung des Körpergewichts. Der Index gibt das Verhältnis
	des Körpergewichts G (kg) zu der Größe h (m) an. Er kann mit der folgenden Formel berechnet
	werden: BMI = G / h^2
	
	Soll-Verhalten:
	BMI < 20 				->	Untergewicht
	20  <= BMI < 25 		->  Normalgewicht
	25  <= BMI < 30 		->	Übergewicht
	30  <= BMI < 40 		->  Starkes Übergewicht
	BMI >= 40				->  Extremes Übergewicht
	
	Eingaben unter 0 / Fehlerhafte Eingaben behandeln
	
	Ausgabe:
	Gewicht, Größe, BMI, Beurteilung
 */

public class BodyMassIndex {

	public static void main(String[] args) {
		double weight = 140.6;
		double height = 2.7;
		double bmi = weight / (height*height);
		String rating;
		
		if (bmi < 20) {
			rating = "Untergewichtig!";
		}
		else if (20 <= bmi && bmi < 25) {
			rating = "Normalgewicht!";
		}
		else if (25 <= bmi && bmi < 30) {
			rating = "Übergewichtig!";
		}
		else if (30 <= bmi && bmi < 40) {
			rating = "Stark Übergewichtig!";
		}
		else {
			rating = "Extrem Übergeichtig";
		}
		
		System.out.print("Gewicht: " + weight + "kg"+
						 "\nGröße: " + height + "m" +
						 "\nBMI: " + bmi +
						 "\nBeurteilung: " + rating);
							
	}

}
