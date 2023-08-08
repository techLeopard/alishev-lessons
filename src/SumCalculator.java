/*
Описание:
Напишите программу на Java,
которая запрашивает у пользователя целые числа
до тех пор, пока он не введет число 0.
Затем программа выводит сумму всех введенных чисел.
 */

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int sum = 0;

        while (true) {
            // Prompt the user to enter numbers
            System.out.println("Enter the number. Enter '0' to see the sum.");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else {
                sum += input;
            }
        }

        // See the result
        System.out.println("The sum is: " + sum);


        // Close the scanner object
        scanner.close();
    }
}
