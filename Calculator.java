//Calculator class


class Calculator {
    private int[] numbers;
    private int[] array;

    // Constructor to initialize numbers and array
    Calculator() {
        UserInput input = new UserInput();
        numbers = input.userInput();
        array = input.arrayInput();
    }

    // Method to perform addition
    public int addition() {
        return numbers[0] + numbers[1];
    }

    // Method to perform subtraction
    public int subtraction() {
        return numbers[0] - numbers[1];
    }

    // Method to perform multiplication
    public int multiplication() {
        return numbers[0] * numbers[1];
    }

    // Method to perform division
    public int division() {
        if (numbers[1] == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numbers[0] / numbers[1];
    }

    // Method to calculate Fibonacci sequence
    public int fibonacci() {
        if (numbers[2] == 0) return 0;
        if (numbers[2] == 1) return 1;

        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= numbers[2]; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    // Method to calculate sum of the array
    public int sumOfArray() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate mean of the array
    public double meanOfArray() {
        return (double) sumOfArray() / array.length;
    }
}
