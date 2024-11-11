package Scanner;


import java.util.*;

public class WuerfelObjekMetho {

    public static void main(String[] args) {
        Spieler spieler1 = new Spieler("Max");
        Spieler spieler2 = new Spieler("Knax");

        int runden = 3; // 
        int punkteSpieler1 = spieler1.spieleRunden(runden);
        int punkteSpieler2 = spieler2.spieleRunden(runden);

        System.out.println(spieler1.getName() + " hat insgesamt " + punkteSpieler1 + " Punkte.");
        System.out.println(spieler2.getName() + " hat insgesamt " + punkteSpieler2 + " Punkte.");

        if (punkteSpieler1 > punkteSpieler2) {
            System.out.println(spieler1.getName() + " hat gewonnen!");
        } else if (punkteSpieler2 > punkteSpieler1) {
            System.out.println(spieler2.getName() + " hat gewonnen!");
        } else {
            System.out.println("Unentschieden!");
        }
    }
}

class Spieler {
    private String name;

    public Spieler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int spieleRunden(int anzahlRunden) {
        int gesamtPunkte = 0;
        for (int i = 0; i < anzahlRunden; i++) {
            gesamtPunkte += würfeln();
            System.out.println(name + " hat in Runde " + (i+1) + " eine " + würfeln() + " gewürfelt.");
        }
        return gesamtPunkte;
    }

    public static int würfeln() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
