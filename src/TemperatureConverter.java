import  java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");

        // Read the user input as a double
        double celsius = scanner.nextDouble();

        // Close the Scanner object
        scanner.close();

        // Convert celsius to fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the converted temperature in Fahrenheit to the user.
        System.out.print("The temperature in Fahrenheit is: " + fahrenheit);

    }
}