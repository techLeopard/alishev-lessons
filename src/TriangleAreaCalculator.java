import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Prompt the user to enter the lengths of the three sides of the triangle.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of three sides of the triangle.
        System.out.print("Enter the length of side 1: ");
        // Read the user input as a double
        double side1 = scanner.nextDouble ();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble ();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble ();

        // Close the scanner object
        scanner.close();

        // Calculate the semi-perimeter of the triangle
        double semiPerimeter = (side1 + side2 + side3) / 2;

        // Calculate the area of the triangle using Heron's formula
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        // Display the calculated area of the triangle to the user
        System.out.println("The area of the triangle is: " + area);

    }
}
