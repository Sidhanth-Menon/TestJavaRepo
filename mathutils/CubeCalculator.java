package mathutils;

import utilities.MathUtils;

public class CubeCalculator {

    // Function to calculate the cube of a number
    public static int calculateCube(int number) {
        return number * number * number;
    }

    // Function to calculate the sum of cubes up to a given number
    public static int calculateSumOfCubes(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += calculateCube(i);
        }
        return sum;
    }

    public static void displayCubeDetails(int number) {
        int cube = calculateCube(number);
        int sumOfCubes = calculateSumOfCubes(number);

        System.out.println(MathUtils.formatResult("cube", number, cube));
        System.out.println("The sum of cubes from 1 to " + number + " is: " + sumOfCubes);
    }
}
