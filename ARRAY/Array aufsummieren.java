package Scanner;

public class aufsummieren {

    public static int[] sumUp(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] zahlen = {4, 3, 1, 9, -5, 4};

        System.out.print("Ursprüngliches Array: ");
        for (int num : zahlen) {
            System.out.print(num + " ");
        }

        zahlen = sumUp(zahlen);

        System.out.print("\nArray nach der Aufsummierung: ");
        for (int num : zahlen) {
            System.out.print(num + " ");
        }
    }
}
