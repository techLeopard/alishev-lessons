/*
Описание:
Напишите программу на Java,
которая генерирует случайное число от 1 до 100,
а затем предлагает пользователю угадать это число.
Если пользователь угадывает число,
программа выводит сообщение о победе.
Если пользователь не угадывает число,
программа сообщает, было ли загаданное число
больше или меньше предложенного пользователем числа,
и предлагает пользователю попробовать еще раз.
Программа продолжает предлагать пользователю
угадывать число до тех пор, пока пользователь
не угадает число.
 */

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        // Create a scanner.
        Scanner scanner = new Scanner(System.in);

        // Generate a random number from 1 to 100.
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int guess;

        System.out.print("Угадай число от 1 до 100: ");
        do {
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Бери ниже.");
            } else if (guess < randomNumber) {
                System.out.println("Бери выше.");
            }
        } while (guess != randomNumber);

        System.out.println("Вы угадали число " + randomNumber + "!");

        // Close the scanner object.
        scanner.close();
    }
}

/*
do {
            System.out.print("Попробуйте угадать: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Поздравляю! Вы угадали число!");
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
        } while (guess != secretNumber);
 */
