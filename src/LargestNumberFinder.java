/*
Напишите программу на Java,
которая запрашивает у пользователя несколько целых чисел
и находит наибольшее из них.
 */

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        // Create a scanner object.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of numbers he wants to compare.
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        // Initializing variables
        int largestNumber = Integer.MIN_VALUE;

        // Cycle for number of iterations
        for ( int i = 1; i <= count ; i++) {
            System.out.println("Введите число " + i + ": ");
            int number = scanner.nextInt();

            if (number > largestNumber) {
                largestNumber = number;
            }

        }

        System.out.println("Наибольшее число: " + largestNumber);

        // Close the scanner object.
        scanner.close();
    }
}
