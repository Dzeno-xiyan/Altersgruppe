/*

Variable Declaration:

int y: Declares an integer variable y to store the square of x.
int x = 1: Declares an integer variable x and initializes it to 1.
int total = 0: Declares an integer variable total to store the sum of the squares, initialized to 0.
do-while Loop:

The do-while loop ensures that the code inside the loop is executed at least once.
Inside the loop:
y = x * x: Calculates the square of x and stores the result in y.
System.out.println(y): Prints the current value of y to the console.
total = total + y: Adds the current y to the total variable.
x = x + 1: Increments the value of x by 1.
Loop Condition: The loop continues as long as x is less than or equal to 5.
Final Output:

After the loop finishes, the final value of total is printed to the console.
In essence, the code calculates the squares of numbers from 1 to 5, prints each square, and then calculates the sum of these squares.

Here's a breakdown of the calculations:

x = 1: y = 1 * 1 = 1, total = 0 + 1 = 1
x = 2: y = 2 * 2 = 4, total = 1 + 4 = 5
x = 3: y = 3 * 3 = 9, total = 5 + 9 = 14
x = 4: y = 4 * 4 = 16, total = 14 + 16 = 30
x = 5: y = 5 * 5 = 25, total = 30 + 25 = 55
The final output will be:

1
4
9
16
25
Total ist: 55

*/

************************************** DER CODE *************************************************************************

public static void main(String[] args) {
  int y;
  int x = 1;
  int total = 0;
 
  do {
    y = x * x;
    System.out.println(y);
    total = total + y;
    x = x + 1;
  } while (x <= 5);
 
  System.out.println("Total ist: " + total);
}

