package Scanner;

public class autotestttt {
    public static void main(String[] args) {
        
        Auto meinAuto = new Auto("Rot", 2022, "Tesla Model 3");

        
        meinAuto.faehrt();
        meinAuto.steht();
        meinAuto.beschreibeDich();

        
        int aktuellesJahr = 2023;
        System.out.println("Das Auto ist " + meinAuto.berechneAlter(aktuellesJahr) + " Jahre alt.");

        
        meinAuto.setzeKilometerstand(10000);
        meinAuto.fahreStrecke(500);
        meinAuto.beschreibeDich();
    }
}
