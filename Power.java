// Robin Johnson
// PA 8

import java.util.Scanner;

// Program that calculates a base raised to a power
public class Power
{
    // Main function that gets numbers from the user,
    // calculates the power, and prints the answer
    public static void main(String[] args)
    {
        // take a base and exponent from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        // calculate the power
        long solution;
        solution = calcPower(base, exponent);

        // print the power
        System.out.println("Solution: " + solution);
    }

    // Function that calculates a base raised to a power
    // using recursion
    private static long calcPower (int base, int exponent)
    {
        /*  The exponent decrements each time the function calls itself
         *  until it reaches 0, where 1 is returned, and multiplication
         *  can begin.
         *  Ex. 4^3 would return 4 * (4 * (4 * 1)) */
        if (exponent == 0) return 1;
        else return base * calcPower(base, (exponent - 1));
    }
}
