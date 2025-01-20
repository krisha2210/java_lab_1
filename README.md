 # Project: Calculator and Fibonacci Sequence Program

# Overview

This project implements a calculator program in Java, which performs basic arithmetic operations, computes Fibonacci sequences, calculates the sum and mean of an array, and handles user input dynamically. The program is divided into three files:

Main.java: Entry point of the application.

UserInput.java: Handles user input for numbers and arrays.

Calculator.java: Contains all the calculation logic.

## File Descriptions

Main.java

Purpose: Acts as the entry point of the program. It interacts with the user and displays the results of various operations.

Key Features:

Creates an instance of the Calculator class.

Calls various calculation methods and displays the results.

UserInput.java

Purpose: Handles user input for basic numbers and arrays.

Methods:

int[] userInput():

Accepts two numbers and an index for the Fibonacci sequence from the user.

Validates inputs, ensuring the Fibonacci index is non-negative.

Returns an array of three integers.

int[] arrayInput():

Prompts the user for the size of an array.

Accepts array elements from the user.

Validates that the array size is positive.

Returns the populated array.

Calculator.java

Purpose: Performs calculations based on user input.

Methods:

int addition():

Returns the sum of the first two user-inputted numbers.

int subtraction():

Returns the difference between the first and second numbers.

int multiplication():

Returns the product of the first two numbers.

int division():

Returns the quotient of the first number divided by the second.

Throws an exception if division by zero is attempted.

int fibonacci():

Computes the Fibonacci number at the user-provided index.

Uses an iterative approach for efficiency.

Throws an exception if the Fibonacci index is negative.

int sumOfArray():

Calculates and returns the sum of all elements in the user-inputted array.

double meanOfArray():

Computes and returns the mean of all elements in the array.

Leverages the sumOfArray() method for calculation
