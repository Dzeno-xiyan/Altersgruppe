package Scanner;

public class Aufsteigend {
    public static void main(String[] args) {
        int[] myNumbers = { 9, 3, 2, 8, 6, 7, 5, 4, 1 };

        // Bubble Sort in aufsteigender Reihenfolge
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < myNumbers.length - 1; i++) {
                if (myNumbers[i] > myNumbers[i + 1]) { // Vergleiche hier > statt <
                    // Vertausche Elemente
                    int temp = myNumbers[i];
                    myNumbers[i] = myNumbers[i + 1];
                    myNumbers[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        // Ausgabe des sortierten Arrays
        for (int number : myNumbers) {
            System.out.print(number + " ");
        }
    }
}
