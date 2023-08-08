/*
Описание:
Напишите программу на Java,
которая запрашивает у пользователя целое
положительное число n и вычисляет его факториал.
Факториал числа n обозначается как n!
и представляет собой произведение
всех целых чисел от 1 до n.
 */


import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create the scanner object.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive number.
        System.out.print("Enter a positive number: ");

        // Read the user input as an integer.
        int n = scanner.nextInt();

        // Initialize a variable
        int factorial = 1;

        // Cycle
        for ( int i = n; i >= 1 ; i-- ) {
            factorial *= i;
        }

        // When cycle breaks...
        System.out.println("Factorial of number " + n + " is " + factorial);

        // Close the scanner object.
        scanner.close();
    }
}
