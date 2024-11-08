package Scanner;

public class StringAufgabe2 {
    public static void main(String[] args) {
        String str = "Dies ist ein Beispiel";
        String[] woerter = str.split("\\s+"); // Teilt den String an einem oder mehreren Leerzeichen auf
        boolean erstesWort = true;
        
        for (String wort : woerter) {
            if (wort.length() % 2 == 0) {
            	 if (!erstesWort) {            // entfernen des letzen Kommas
                     System.out.print(", ");
                 }
                 System.out.print(wort);
                 erstesWort = false;
             }
         }
    }
}

