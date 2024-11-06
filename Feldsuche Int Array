public class FeldSuche {
    public static int searchIndex(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i; // Wert gefunden, gib den Index zurück
            }
        }
        return -1; // Wert nicht gefunden, gib -1 zurück
    }

    public static void main(String[] args) {
        int[] zahlen = {2, 5, 8, 12, 7, 3};
        int suchWert = 8;

        int index = searchIndex(zahlen, suchWert);

        if (index != -1) {
            System.out.println("Der Wert " + suchWert + " wurde an der Stelle " + index + " gefunden.");
        } else {
            System.out.println("Der Wert " + suchWert + " wurde nicht gefunden.");
        }
    }
}
