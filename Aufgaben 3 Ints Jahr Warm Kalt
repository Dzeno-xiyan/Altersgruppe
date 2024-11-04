package Scanner;

/*public class Monatkaltwarm {
    public static void main(String[] args) {
        int zahl1 = 10;
        int zahl2 = 19;
        int zahl3 = 19;

        int gWert = gZahl(zahl1, zahl2, zahl3);
        System.out.println("Der größte Wert ist: " + gWert);
    }

    public static int gZahl(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}*/

public class Monatkaltwarm {
    public static void main(String[] args) {
        int monat = 6; // Juni
        double temperatur = 20.5;
        String jahreszeit = getJahreszeit(monat);

        String temperaturempfinden = temperatur >= getSchwellenwert(jahreszeit) ? "warm" : "kalt";
        System.out.println("Der " + getMonatsName(monat) + " ist mit " + temperatur + "°C für diese " + jahreszeit + " relativ " + temperaturempfinden);
    }

    public static String getJahreszeit(int monat) {
        switch (monat) {
            case 3: case 4: case 5:
                return "Frühling";
            case 6: case 7: case 8:
                return "Sommer";
            case 9: case 10: case 11:
                return "Herbst";
            default:
                return
 "Winter";
        }
    }

    public static double getSchwellenwert(String jahreszeit) {
        switch (jahreszeit) {
            case "Frühling":
                return 20;
            case "Sommer":
                return 25;
            case "Herbst":
                return 15;
            default:
                return 5;
        }
    }

    public static String getMonatsName(int monat) {
        String monatsName = "";
        switch (monat) {
            case 1: monatsName = "Januar"; break;
            case 2: monatsName = "Februar"; break;
            case 3: monatsName = "März"; break;
            case 4: monatsName = "April"; break;
            case 5: monatsName = "Mai"; break;
            case 6: monatsName = "Juni"; break;
            case 7: monatsName = "Juli"; break;

            case 8: monatsName = "August"; break;
            case 9: monatsName = "September"; break;
            case 10: monatsName = "Oktober"; break;
            case 11: monatsName = "November"; break;
            case 12: monatsName = "Dezember"; break;
            default: monatsName = "Ungültiger Monat";

        }
        return monatsName;
    }
}
