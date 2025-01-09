public class SquareCalculator {

    // Function to calculate the square of a number
    public static int calculateSquare(int number) {
        return number * number;
    }

    // New function: calculate cube
    public static int calculateCube(int number) {
        return number * number * number;
    }

    // New function: calculate square root (integer part only)
    public static int calculateSquareRoot(int number) {
        int root = 0;
        while (root * root <= number) {
            root++;
        }
        return root - 1;
    }


    public static void main(String[] args) {
        // Example usage of the functions
        int number = 5;
        int square = calculateSquare(number);
        int cube = calculateCube(number);            // Call new function
        int sqrt = calculateSquareRoot(number);     // Call new function



        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The cube of " + number + " is: " + cube);
        System.out.println("The integer square root of " + number + " is: " + sqrt);


    }

    //New Function added
    public static int powerOfNumber(int num, int power) {
        return (int) Math.pow(num, power);  // Note: Casting to int might truncate for larger results
    }
}