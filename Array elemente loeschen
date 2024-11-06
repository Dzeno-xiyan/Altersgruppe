public class LoeschenElement {

    public static int[] delElement(int[] a, int w) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == w) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return a; // Element nicht gefunden
        }

        // eine posi nach links
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        // Erstelle ein neues Array
        int[] neuesArray = new int[a.length - 1];
        for (int i = 0; i < neuesArray.length; i++) {
            neuesArray[i] = a[i];
        }

        return neuesArray;
    }

    public static void main(String[] args) {
        int[] feld = {3, 4, 1, 9, -5, 4};
        int zuLoeschen = 9;

        System.out.print("Feld: ");
        for (int num : feld) {
            System.out.print(num + " ");
        }

        System.out.println("\nZu löschendes Element: " + zuLoeschen);

        feld = delElement(feld, zuLoeschen);

        System.out.print("Neues Feld: ");
        for (int num : feld) {
            System.out.print(num + " ");
        }
    }
}
