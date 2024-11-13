package Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        // Erstelle einen neuen StringBuilder
        StringBuilder sb = new StringBuilder();

        // Füge Zeichen hinzu
        sb.append("Hallo, ");  // Zeichen Kette Anhängen append
        sb.append("Welt!");

        // Füge einen String ein
        sb.insert(7, "schöne "); // Einfügen an 7 Stelle 
        sb.replace(0, 5, "liebe"); // Ersetzt Stelle 0 bis 5 im String
       
     // Finde den Index, an dem "schöne" beginnt
        int startIndex = sb.indexOf("schöne");

        // Finde den Index, an dem "schöne" endet
        int endIndex = startIndex + "schöne".length();

        // Extrahiere den Teil "schöne" und kehre ihn um
        String toReverse = sb.substring(startIndex, endIndex);
        StringBuilder reversedPart = new StringBuilder(toReverse).reverse();

        // Ersetze den ursprünglichen Teil durch den umgekehrten Teil
        sb.replace(startIndex, endIndex, reversedPart.toString());
        
        sb.reverse(); // Umkehrung des Strings

        // Gib den gesamten String aus
        System.out.println(sb); // Ausgabe: Hallo, schöne Welt!
    }
}
