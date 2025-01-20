// Calculator .java
import java.io.*;

class Calculator {

    private int[] numbers;

    // Constructor to initialize the numbers array
    Calculator() {
        UserInput input = new UserInput(); 
        numbers = input.userInput();      
    }

    // Method to perform addition
    public int addition() {
        return numbers[0] + numbers[1];
    }

    // Method to perform subtraction
    public int subtraction() {
        return numbers[0] - numbers[1];
    }
}