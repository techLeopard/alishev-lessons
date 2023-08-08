/*
	Описание:
    Напишите программу на Java,
    которая запрашивает у пользователя последовательность целых чисел.
    Программа должна выводить только четные числа из последовательности
    и прекращать вывод при встрече первого отрицательного числа.
 */

import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            }
        }

        System.out.println("END");

        scanner.close();
    }
}
