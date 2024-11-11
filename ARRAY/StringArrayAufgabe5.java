package Scanner;



	import java.util.Random;
	import java.util.Scanner;

	public class StringArrayAufgabe5 {
	    public static void main(String[] args) {
	        String[] tiere = {"Katze", "Hund", "Elefant", "Löwe", "Tiger", "Giraffe", "Bär", "Gepard", "Vogel", "Nashorn", "Zebra", "Fisch"};
	        Random random = new Random();
	        int zufaelligeZahl = random.nextInt(tiere.length);
	        String zuErratendesWort = tiere[zufaelligeZahl];
	        char[] versuche = new char[zuErratendesWort.length()];
	        int versucheZaehler = 0;
	        boolean gewonnen = false;

	        // Initialisiere das Array mit Unterstrichen
	        for (int i = 0; i < versuche.length; i++) {
	            versuche[i] = '_';
	        }

	        Scanner scanner = new Scanner(System.in);

	        while (!gewonnen && versucheZaehler < 10) {
	            System.out.print("Dein Stand: ");
	            for (char buchstabe : versuche) {
	                System.out.print(buchstabe + " ");
	            }
	            System.out.println();

	            System.out.print("Gib einen Buchstaben ein: ");
	            char eingabe = scanner.next().charAt(0);

	            boolean getroffen = false;
	            for (int i = 0; i < zuErratendesWort.length(); i++) {
	                if (zuErratendesWort.charAt(i) == eingabe) {
	                    versuche[i] = eingabe;
	                    getroffen = true;
	                }
	            }

	            if (!getroffen) {
	                versucheZaehler++;
	                System.out.println("falsch!");
	            }

	            // Überprüfung
	            gewonnen = true;
	            for (char buchstabe : versuche) {
	                if (buchstabe == '_') {
	                    gewonnen = false;
	                    break;
	                }
	            }
	        }

	        if (gewonnen) {
	            System.out.println("Du hast das Tier erraten: " + zuErratendesWort);
	        } else {
	            System.out.println("Leider verloren! Das Tier war: " + zuErratendesWort);
	        }
	    }
	}
