// Name: Krisha Shah
// PRN: 24070126512
// Batch: B3

// Main class

class Main {
    public static void main(String[] args) {
        // Creating an instance of Calculator to perform operations
        Calculator calculator = new Calculator();

        // Perform and display results of calculations
        System.out.println("Addition: " + calculator.addition());
        System.out.println("Subtraction: " + calculator.subtraction());
        System.out.println("Multiplication: " + calculator.multiplication());
        try {
            System.out.println("Division: " + calculator.division());
        } catch (ArithmeticException e) {
            System.out.println("Division Error: " + e.getMessage());
        }

        System.out.println("Fibonacci: " + calculator.fibonacci());
        System.out.println("Sum of Array: " + calculator.sumOfArray());
        System.out.println("Mean of Array: " + calculator.meanOfArray());
    }
}
