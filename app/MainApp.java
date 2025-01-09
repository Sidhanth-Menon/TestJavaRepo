package app;

import mathutils.SquareCalculator;
import mathutils.CubeCalculator;
import utilities.MathUtils;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Validate input using MathUtils
        if (!MathUtils.validatePositiveNumber(number)) {
            System.exit(1);
        }

        // Display square details using SquareCalculator
        System.out.println("\nCalculating square details...");
        SquareCalculator.displaySquareDetails(number);

        // Display cube details using CubeCalculator
        System.out.println("\nCalculating cube details...");
        CubeCalculator.displayCubeDetails(number);

        // Calculate and display the integer square root
        System.out.println("\nCalculating square root...");
        int squareRoot = MathUtils.calculateSquareRoot(number);
        System.out.println(MathUtils.formatResult("integer square root", number, squareRoot));

        System.out.println("\nCalculating sum of squares...");
        int sumOfSquares = MathUtils.calculateSumOfSquares(number); // Call new function
        System.out.println(MathUtils.formatResult("sum of squares up to", number, sumOfSquares));

        int numberPower = SquareCalculator.powerOfNumber(number, 3);
        System.out.println("Power of the number is " + numberPower);
    }

    // New function: calculate factorial (Added but not used, for CR analysis testing)
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }

    }
}
