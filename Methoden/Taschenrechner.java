

package Scanner;



public class Taschenrechner {
    private double zwischenergebnis = 0;

    // Methode zum Addieren
    public double addiere(double zahl) {
        setZwischenergebnis(getZwischenergebnis() + zahl);
        return getZwischenergebnis();
    }

    // Methode zum Subtrahieren
    public double subtrahiere(double zahl) {
        setZwischenergebnis(getZwischenergebnis() - zahl);
        return getZwischenergebnis();
    }

    // Methode zum Multiplizieren
    public double multipliziere(double zahl) {
        setZwischenergebnis(getZwischenergebnis() * zahl);
        return getZwischenergebnis();
    }

    // Methode zum Dividieren 
    public double dividiere(double zahl) {
        if (zahl == 0) {
            System.out.println("Division durch Null!");
            return Double.NaN; // NaN
        }
        setZwischenergebnis(getZwischenergebnis() / zahl);
        return getZwischenergebnis();
    }

    // Methode zum Zurücksetzen des Zwischenergebnisses
    public void reset() {
        setZwischenergebnis(0);
    }

    // Statische Methode zur Berechnung von Pi
    public static final double pi() {
        return Math.PI;
    }

	public double getZwischenergebnis() {
		return zwischenergebnis;
	}

	public void setZwischenergebnis(double zwischenergebnis) {
		this.zwischenergebnis = zwischenergebnis;
	}
}
