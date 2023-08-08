import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {

        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a positive integer.
        System.out.print("Enter a positive integer: ");

        // Read the user input as an integer.
        int number = scanner.nextInt();

        // Close the scanner object.
        scanner.close();

        // Calculate the sum of the digits of the entered number.
        int sum = 0;
        int tempNumber = number;
        // 45678
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber /= 10;
        }

        // Display the calculated sum.
        System.out.println("The sum of the integers in a number is: " + sum);
    }
}
