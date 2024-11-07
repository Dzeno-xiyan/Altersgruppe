package Scanner;

public class ArrayAufgabe3 {
    public static int[] entferneElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Ungültig. Index muss zwischen 0 und " + (array.length - 1) + " liegen.");
            return array; // Original-Array zurückgeben, da keine Änderung vorgenommen wurde
        }

        int[] neuesArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                neuesArray[j] = array[i];
                j++;
            }
        }
        return neuesArray;
    }

    public static void main(String[] args) {
        int[] numbers = {26, 54, 8, 17, 23, 4, 33};
        int indexEntfernen = 9;

        int[] neuesArray = entferneElement(numbers, indexEntfernen);

        System.out.print("Neues Array: ");
        for (int zahl : neuesArray) {
            System.out.print(zahl + " ");
        }
    }
}
