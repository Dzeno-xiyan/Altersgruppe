package Scanner;

public class ArrayAufgabe2 {
    public static int findeIndex(int[] array, int gesuchtesElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == gesuchtesElement) { // // Index gefunden 
                return i; // Index gefunden 
            }
        }
        return -1; // Index nicht gefunden
    }

    public static void main(String[] args) {
        int[] numbers = {26, 54, 8, 17, 23, 4, 33};
        int elementSuchen = 55; // Welche Zahl wird gesucht

        int index = findeIndex(numbers, elementSuchen);

        if (index != -1) {
            System.out.println("Das Element " + elementSuchen + " wurde an Index " + index + " gefunden.");
        } else {
            System.out.println("Das Element " + elementSuchen + " wurde nicht gefunden.");
        }
    }
}
