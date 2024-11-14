package Scanner;

public class Aufgabetest {
    public static void main(String[] args) {
        int x = 5, y = 0, z = 7;
        char c1 = 'a', c2 = 'b', c3 = 'A';
        boolean a = true, b = false;
        double i = 5, j = 2.5, k = 0;

        // Ausdruck 1: (x > y + 3 && z > x)
        System.out.println(x > y + 3 && z > x); // true

        // Ausdruck 2: !(y + 6 < x * y)
        System.out.println(!(y + 6 < x * y)); // false

        // Ausdruck 3: (c1 == c3)
        System.out.println(c1 == c3); // false

        // Ausdruck 4: (x || i == x)
        //System.out.println(x || i == x);  Exception

        // Ausdruck 5: (a ^ !b || (x != i) && y * z + z * x > 15)
        System.out.println(a ^ !b || (x != i) && y * z + z * x > 15); // true

        // Ausdruck 6: !(b != a) || (b == a)
        System.out.println(!(b != a) || (b == a)); // true

        // Ausdruck 7: (i + 2 * j == 5.0 * 2)
        System.out.println(i + 2 * j == 5.0 * 2); // true

        // Ausdruck 8: (i / k > 0)
        // System.out.println(i / k > 0); // Exception

        // Ausdruck 9: (a && !b || x > 1 && c1 != c2 || k + 1 * x / 2 > 10)
        System.out.println(a && !b || x > 1 && c1 != c2 || k + 1 * x / 2 > 10); // true

        // Ausdruck 10: (a ^ !b && !( (!b == a) || !a != b ))
        System.out.println(a ^ !b && !( (!b == a) || !a != b )); // true
    }
}
