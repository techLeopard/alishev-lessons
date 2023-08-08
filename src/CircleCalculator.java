import java.util.Scanner;
import java.lang.Math;


public class CircleCalculator {
    public static void main(String[] args) {
        // Create the scanner.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle.
        System.out.print("Enter the radius of the circle: ");

        // Read the input as a double
        double radius = scanner.nextDouble();

        // Close the scanner object.
        scanner.close();

        // Calculate the area of the circle using the formula "area = PI * radius^2"
        double area = Math.PI * radius * radius;

        // Calculate the circumference of the circle using the formula: circumference = 2 * PI * radius.
        double circumference = 2 * Math.PI * radius;

        // Output the area and circumference values.
        System.out.println("Area of the circle is: " + area);
        System.out.println("Circumference of the circle is: " + circumference);

    }
}
