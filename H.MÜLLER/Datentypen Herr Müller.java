package ialPackage;

public class Datentypen2 {

	public static void main(String[] args) {
	
	// Ganze Zahlen
		byte eineKleineZahl = 127; 
		System.out.println("byte: " + eineKleineZahl);			
		
		short wert = 32000;								 
		System.out.println("short: " + wert);					
		
		int zahl = 20000000;								
		System.out.println("int: " + zahl);					
		
		long einLongWert = 2000000000000L;					// Typzuweisung über "l" bzw. "L"	
		System.out.println("long: " + einLongWert);	
			
	// Gleitkomma Zahlen
		
		float einFloat = 5.604F;							// Typzuweisung über "f" bzw. "F"		
		System.out.println("float: " + einFloat);				
		
		double kommaZahl = 24.87;
		System.out.println("double: " + kommaZahl);
	
	// char --> Zeichen Datentyp (char für Character)
	
		char einZeichen = '&'; 							
		System.out.println("char Zeichen : " + einZeichen);
		
		char einZeichenMitUnicode = '\u003F';
		System.out.println("char mit Unicode: " + einZeichenMitUnicode);
		
		char einZeichenMitDezimal = 63;
		System.out.println("char mit dezimal Zahl: " + einZeichenMitDezimal);
		
		char einZeichenMitBinaer = 0b0001111;
		System.out.println("char mit Dual Zahl: " + einZeichenMitBinaer);
		
		
	// boolean - Logik Datentyp
		
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("boolean: " + isTrue + " / " + isFalse);
		
	}
	
}
