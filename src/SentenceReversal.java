import java.util.Scanner;
public class SentenceReversal {
    public static void main(String[] args) {
        // Create a scanner.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence.
        System.out.print("Enter a sentence: ");

        // Read the user input as a String class.
        String sentence = scanner.nextLine();

        // Close the scanner object.
        scanner.close();

        // Split the sentence into words.
        String[] words = sentence.split(" ");

        // Reverse the order of the words.
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        // Remove trailing whitespace
        reversedSentence = new StringBuilder(reversedSentence.toString().trim());

        // Display the reversed sentence to the user.
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
