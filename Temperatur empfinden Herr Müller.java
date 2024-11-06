package beispiel;

/*Schreiben Sie eine Klasse die je nach Jahreszeit und Temperatur bestimmt ob es für den Monat warm oder kalt ist.

März April Mai (Frühling  >=20 warm  <20 kalt)
Juni Juli August (Sommer >= 25 warm <20 kalt)
September Oktober November (Herbst >=15 warm <15 kalt)
Dezember Januar Februar (Winter >=5 warm <5 kalt)

Monate als int
Jahreszeit als String
Temperatur als double

Ausgabe: Der "monat" ist mit "temperatur"°C für diese "jahreszeit" realtiv "temperaturempfinden" */

public class Seasons {

	public static void main(String[] args) {
		int monat = 12000;
		String jahreszeit = "";
		double temperatur = 70.0;
		String temperaturempfinden = "";
		boolean flag = true;
		
		switch (monat) {
			case 3, 4, 5:								// Frühling
				jahreszeit = "Frühling";
				if (temperatur >= 20) {
					temperaturempfinden = "warm";
				}
				else {
					temperaturempfinden = "kalt";
				}
				break;
			case 6, 7, 8:								// Sommer
				jahreszeit = "Sommer";
				if (temperatur >= 25) {
					temperaturempfinden = "warm";
				}
				else {
					temperaturempfinden = "kalt";
				}
				break;
			case 9, 10, 11:								// Herbst 
				jahreszeit = "Herbst";
				if (temperatur >= 15) {
					temperaturempfinden = "warm";
				}
				else {
					temperaturempfinden = "kalt";
				}
				break;
			case 12, 1, 2:								// Winter
				jahreszeit = "Winter";
				if (temperatur >= 5) {
					temperaturempfinden = "warm";
				}
				else {
					temperaturempfinden = "kalt";
				}
				break;
			default:
				flag = false;
				break;	
		}
			// Hier landen wir nach einem break
		if (flag) {
			System.out.print("Der " +monat+". Monat ist mit "+temperatur+"°C für diesen "+jahreszeit+" relativ "+ temperaturempfinden);
		}
		else {
			System.out.print("Monat nicht korrekt!!!!!");
		}
	}

}
