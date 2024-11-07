package Scanner;

public class Arraysaufgabe1 {
    public static double berechneDurchschnitt(int[] zahlen) {
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        return (double) summe / zahlen.length;
    }

    public static void main(String[] args) {
        int[] Nummern = {26, 54, 8, 17, 23, 4, 33, 56, 100};
        double durchschnitt = berechneDurchschnitt(Nummern);
        System.out.println("Der Durchschnitt ist: " + durchschnitt);
    }
}
