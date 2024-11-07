Absolut! Eine switch-Anweisung (case-Schleife) ist ideal, um verschiedene Fälle basierend auf einem Wert zu unterscheiden. Hier ist ein Beispiel, das die Buchstaben 'a' bis 'e' und die Zahlen 1 bis 5 abdeckt:

Java
import java.util.Scanner;

public class CaseBeispiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen Buchstaben (a-e) oder eine Zahl (1-5) ein: ");
        char eingabe = scanner.next().charAt(0);

        switch (eingabe) {
            case 'a':
                System.out.println("Sie haben 'a' eingegeben.");
                break;
            case 'b':
                System.out.println("Sie haben 'b' eingegeben.");
                break;
            case 'c':
                System.out.println("Sie haben 'c' eingegeben.");
                break;
            case 'd':
                System.out.println("Sie haben 'd' eingegeben.");
                break;
            case 'e':
                System.out.println("Sie haben 'e' eingegeben.");
                break;
            case '1':
                System.out.println("Sie haben 1 eingegeben.");
                break;
            case '2':
                System.out.println("Sie haben 2 eingegeben.");
                break;
            case '3':
                System.out.println("Sie haben 3 eingegeben.");
                break;
            case '4':
                System.out.println("Sie haben 4 eingegeben.");
                break;
            case '5':
                System.out.println("Sie haben 5 eingegeben.");
                break;
            default:
                System.out.println("Ungültige Eingabe.");
        }
    }
}
