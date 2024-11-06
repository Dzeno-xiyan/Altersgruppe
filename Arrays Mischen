/* Arrays Mischen */

/* Funktion mische(a, b):
    Erzeuge ein neues leeres Array c mit der Länge: Länge(a) + Länge(b)
    i := 0  // Index für a
    j := 0  // Index für b
    k := 0  // Index für c

    Solange i < Länge(a) und j < Länge(b):
        Wenn a[i] <= b[j]:
            c[k] := a[i]
            i := i + 1
        Sonst:
            c[k] := b[j]
            j := j + 1
        k := k + 1

    // Alle restlichen Elemente aus a oder b in c kopieren
    Solange i < Länge(a):
        c[k] := a[i]
        i := i + 1
        k := k + 1
    Solange j < Länge(b):
        c[k] := b[j]
        j := j + 1
        k := k + 1

    Gib c zurück
*/

package Scanner;


public class mischen {

    public static int[] mische(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c; 

    }

    public static void main(String[] args) 
 {
    
        // Beispiel aus der Angabe
        int[] a1 = {2, 4, 4, 10, 15, 15};
        int[] b1 = {3, 4, 5, 10};
        int[] c1 = mische(a1, b1);
        printArray(c1);

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


