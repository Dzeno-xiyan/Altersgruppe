package Scanner;

public class Taschentesten {
    public static void main(String[] args) {
        Taschenrechner rechner = new Taschenrechner();

        // Berechnungen
        rechner.addiere(5);
        rechner.multipliziere(2);
        rechner.subtrahiere(3);

        // Ausgabe des Zwischenergebnisses
        System.out.println("Zwischenergebnis: " + rechner.getZwischenergebnis());

        // Verwendung von Pi
        double ergebnisMitPi = rechner.multipliziere(Taschenrechner.pi());
        System.out.println("Ergebnis mit Pi: " + ergebnisMitPi);

        // Zurücksetzen
        rechner.reset();
        System.out.println("Zwischenergebnis nach Reset: " + rechner.getZwischenergebnis());
    }
}
