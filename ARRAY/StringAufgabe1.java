package Scanner;

public class StringAufgabe1 {
	    public static void main(String[] args) {
	        String text = "Dieses Java Programm funktioniert und hat auch ein großes A";
	        char[] charArray = text.toLowerCase().toCharArray();
	        int zaehlerA = 0;

	        for (char c : charArray) {
	            if (c == 'a') {
	                zaehlerA++;
	            }
	        }

	        System.out.println("Der Buchstabe 'a' (groß oder klein) kommt " + zaehlerA + " Mal vor.");
	    }
	}
