package Scanner;

public class eletauschen {
    public static int[] swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

    public static void main(String[] args) {
        int[]
 feld = {4, 2, 10, 3, -5, 0, 17};
        int index1 = 3;
        int index2 = 5;

        System.out.print("Feld: ");
        for (int num : feld) {
            System.out.print(num + " ");
        }

        System.out.println("\nParameter 1: " + index1);
        System.out.println("Parameter 2: " + index2);

        feld = swap(feld, index1, index2);

        System.out.print("Neues Feld: ");
        for (int num : feld) {
            System.out.print(num + " ");
        }
    }
}
