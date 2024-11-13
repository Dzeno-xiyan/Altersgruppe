package Scanner;

import java.util.ArrayList;
import java.util.List;

public class arraylisten {
    public static void main(String[] args) {
        // Erstellen eines Arrays von Listen 
        List<String>[] einkaufslisten = new ArrayList[4]; // Für 4 Personen

        // Initialisieren der Listen
        for (int i = 0; i < einkaufslisten.length; i++) {
            einkaufslisten[i] = new ArrayList<>();
        }

        // Einkaufsartikeln
        einkaufslisten[0].add("Milch");
        einkaufslisten[0].add("Brot");
        einkaufslisten[1].add("Äpfel");
        einkaufslisten[1].add("Bananen");
        einkaufslisten[2].add("Nudeln");
        einkaufslisten[2].add("Soße");
        einkaufslisten[3].add("Kirschen");
        einkaufslisten[3].add("Vanille Soße");

        // Ausgabe der Einkaufslisten
        for (int i = 0; i < einkaufslisten.length; i++) {
            System.out.println("Einkaufsliste für Person " + (i + 1) + ": " + einkaufslisten[i]);
        }
    }
}
