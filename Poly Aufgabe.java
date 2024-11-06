package Scanner;

/* import java.util.Scanner;

	public class Poly {
	    public static int polygonGroesse(int n) {		// rekursive innerhalb der Klasse
	        //  1-faches Polygon
	        if (n == 1) {
	            return 1;
	        }

	        
	        int vorherigeGroesse = polygonGroesse(n - 1);
	        // Hnzugefügten Quadrate: (n-1) * 4 (obere, untere, linke, rechte Seite)
	        int neueQuadrate = (n - 1) * 4;
	        return vorherigeGroesse + neueQuadrate;
	    }

	    public static void main(String[] args) {
	        int n = 2; 
	        int groesse = polygonGroesse(n);
	        System.out.println("Das " + n + "-fache Polygon besteht aus " + groesse + " Quadraten.");
	    }
	}

*/
	
		import java.util.Scanner;

		public class Poly {
		    public static int polygonGroesse(int n) {
		        // Rekursive Berechnung der Polygongröße
		        if (n == 1) {
		            return 1;
		        } else {
		            int vorherigeGroesse = polygonGroesse(n - 1);
		            int neueQuadrate = (n - 1) * 4;
		            return vorherigeGroesse + neueQuadrate;
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Bitte geben Sie die Anzahl der Polygone (n) ein: ");
		 
		        int n = scanner.nextInt();

		        int groesse = polygonGroesse(n);
		        System.out.println("Das " + n + "-fache Polygon besteht aus " + groesse + " Quadraten.");
		    }
		}
