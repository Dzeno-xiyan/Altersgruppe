package Scanner;

import java.util.Scanner;


/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 *We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
*/


public class AngryMonkey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Monkey A am lachen? (true/false): ");
        boolean aSmile = scanner.nextBoolean();

        System.out.print("Monkey B am lachen? (true/false): ");
        boolean bSmile = scanner.nextBoolean();  


        boolean aerger = monkeyTrouble(aSmile, bSmile);
        System.out.println("Monkey Trouble: " + aerger);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);	// beide am Lachen && , !&&! verneint , 
    }
}
