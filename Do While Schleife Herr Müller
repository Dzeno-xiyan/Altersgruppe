package beispiel;

/*
 *  a) 0, 1, 3, 6, 10, 15, 					(Immer +1 mehr pro Iteration)
 *  b) 0, 1, 4, 9, 16, 25, 36... (<100)		(Immer mit der nächstgrößeren ungerade Zahl addieren)
 *  c) Fibonacci Zahlenfolge				(Die letzten beiden Zahlen ergeben die neue Zahl)
 */

public class DoWhileBeispiel {

	public static void main(String[] args) {

        // a
		int i = 0;
		int k = 1;
		
		do {
			System.out.print(i + ", ");
			i += k;
			k++;
		} while (i <= 100);
		
		System.out.println();
		// b
		
		i = 0;
		k = 1;
		
		do {
			System.out.print(i + ", ");
			i = k*k;
			k++;
		} while (i<= 100);
		
		
		System.out.println();
		// c
		int f = 0;
		int zahl1 = 0;
		int zahl2 = 1;
		System.out.print(zahl1 + ", " + zahl2 + ", ");
		do {
			f = zahl1 + zahl2;
			System.out.print(f + ", ");
			zahl1 = zahl2;
			zahl2 = f;
		} while (f <= 200);
		
    }
} 
