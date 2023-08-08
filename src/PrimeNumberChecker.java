import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object.
        Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число: ");
            // Initialize the variables
            int number = scanner.nextInt();

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }


            if (isPrime) {
                System.out.println(number + " - простое число.");
            } else {
                System.out.println(number + " - не простое число.");
            }
    }
}
