/*
 * Aufgabe 5 ~ Musterbeispiel
Schwierigkeit:   
Schreiben Sie ein Programm welches auf der Konsole das Muster .:|: wiederholt ausgibt. Die
genaue Anzahl an Zeichen die Ausgegeben werden soll wird über die Tastatur eingelesen.
Amount tokens: 7
.:|:.:|
Amount tokens: 21
.:|:.:|:.:|:.:|:.:|:.
Amount tokens: 2
.:

Mit dem Modulo-Operator und einer Schleife können Sie eine sich wiederholende
Kette an Zahlen erzeugen.
Extra ~ Wrappy Words
Schwierigkeit:   
Anstatt einer Anzahl von Zeichen einzulesen soll nun ein Wort eingelesen werden. Dieses Wort soll
anschließend in das Muster eingefügt werden. Eine mögliche Ausgabe könnte wie folgt aussehen:
Word to wrap: Hello
.:H:.:e:.:l:.:l:.:o:.
 */







package Scanner;

import java.util.Scanner;




public class Wrappywords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte wählen Sie:");

            System.out.println("1. Einfaches Muster");
            System.out.println("2. Wort-Ummantelung");
            System.out.print("Ihre Wahl: ");
            int choice; // Declare choice as int for selection

            // Use scanner.nextLine() for both input
            String choiceString = scanner.nextLine();
            try {
                choice = Integer.parseInt(choiceString);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Wahl. Bitte geben Sie eine Zahl ein (1 oder 2).");
                continue; // Skip to next iteration if input is not a number
            }

            switch (choice) {
                case 1:
                    System.out.print("Amount tokens: ");
                    int amount = scanner.nextInt();

                    if (amount <= 0) {
                        System.out.println("Bitte geben Sie eine positive Zahl ein.");
                        continue;
                    }

                    StringBuilder pattern = new StringBuilder();
                    for (int i = 0; i < amount; i++) {
                        pattern.append(".:|");
                    }
                    if (amount % 2 != 0) {
                        pattern.deleteCharAt(pattern.length() - 1);
                    }
                    System.out.println(pattern);
                    break;
                case 2:
                    System.out.print("Word to wrap: ");
                    String word = scanner.nextLine();

                    pattern = new StringBuilder();
                    for (int i = 0; i < word.length(); i++) {
                        pattern.append(".:").append(word.charAt(i)).append(":");
                    }
                    System.out.println(pattern);
                    break;
                default:
                    System.out.println("Ungültige Wahl.");
            }
        }
    }
}
