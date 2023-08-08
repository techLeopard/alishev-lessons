import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create the scanner;
        Scanner scanner = new Scanner(System.in);


        // Generate a random number between 1 and 100;
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;


        // Initialize variables
        int guess;
        int attempts = 0;

        //Game loop
        while (true) {
            // Prompt the user to enter a guess
            System.out.println("Guess the number between 1 and 100: ");
            guess = scanner.nextInt();
            attempts++;

            // Check if the guess is correct
            if (guess == randomNumber) {
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low. Guess again: ");
            } else {
                System.out.println("Too high. Guess again: ");
            }
        }

        // Display the final result
        System.out.println("Congrats! You guessed the number " + randomNumber + " in " + attempts + " attempts.");

        // Close the scanner;
        scanner.close();

    }
}
