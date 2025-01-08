package utilities;

public class MathUtils {

    // Function to calculate the integer part of the square root of a number
    public static int calculateSquareRoot(int number) {
        int root = 0;
        while (root * root <= number) {
            root++;
        }
        return root - 1;
    }

    // Function to format the result for output
    public static String formatResult(String operation, int number, int result) {
        return "The " + operation + " of " + number + " is: " + result;
    }

    // Function to validate if a number is positive
    public static boolean validatePositiveNumber(int number) {
        if (number < 0) {
            System.err.println("Error: Number must be positive.");
            return false;
        }
        return true;
    }
}
