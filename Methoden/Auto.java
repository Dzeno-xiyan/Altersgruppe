package Scanner;



public class Auto {
    private String farbe;
    private int baujahr;
    private String modell;
    private int kilometerstand;

    // Konstruktor
    public Auto(String farbe, int baujahr, String modell) {
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.modell = modell;
        this.kilometerstand = 22; 
    }

    // Methoden
    public void steht() {
        System.out.println("Das Auto steht.");
    }

    public void faehrt() {
        System.out.println("Das Auto fährt.");
    }

    public void beschreibeDich() {
        System.out.println("Das Auto ist ein " + modell + " aus dem Jahr " + baujahr + ", hat die Farbe " + farbe + " und " + kilometerstand + " Kilometer auf dem Tacho.");
    }

    public int berechneAlter(int aktuellesJahr) {
        return aktuellesJahr - baujahr;
    }

    public void setzeKilometerstand(int neuerKilometerstand) {
        this.kilometerstand = neuerKilometerstand;
    }

    public void fahreStrecke(int kilometer) {
        kilometerstand += kilometer;
        System.out.println("Das Auto ist " + kilometer + " Kilometer gefahren.");
    }
    
    
    
}
