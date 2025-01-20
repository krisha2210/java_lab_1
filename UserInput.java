// Userinput class

import java.util.*;

class UserInput {
    private Scanner scan = new Scanner(System.in);

    // Method to read two numbers and Fibonacci index
    public int[] userInput() {
        int[] numbers = new int[3];
        try {
            System.out.println("Enter first number: ");
            numbers[0] = scan.nextInt();

            System.out.println("Enter second number: ");
            numbers[1] = scan.nextInt();

            System.out.println("Enter index for Fibonacci sequence: ");
            numbers[2] = scan.nextInt();

            if (numbers[2] < 0) {
                throw new IllegalArgumentException("Fibonacci index must be non-negative.");
            }
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Invalid input. Please enter integers only.", e);
        }
        return numbers;
    }

    // Method to read an array of numbers
    public int[] arrayInput() {
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        if (size <= 0) {
            throw new IllegalArgumentException("Array size must be positive.");
        }

        int[] array = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt(); // This line completes the for loop
        }
        return array; // Return the populated array
    }
}
