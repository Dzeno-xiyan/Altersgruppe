package Scanner;

public class MethodeAufgabe5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                printProdukt(i, j);
            }
            System.out.println( "              " ); // Zeilenumbruch nach jeder Zeile
        }
    }

    public static void printProdukt(int zahl1, int zahl2) {
        int produkt = zahl1 * zahl2;
        System.out.print(zahl1 + " x " + zahl2 + " == " + produkt + "   ");
    }
}
