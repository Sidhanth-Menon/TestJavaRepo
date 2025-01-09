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
    }
}
