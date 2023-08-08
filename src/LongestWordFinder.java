/*
Описание:
Напишите программу на Java,
которая создает массив строк,
заполняет его значениями
и находит самое длинное слово в массиве.
 */
import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        // Create a scanner object.
        Scanner scanner = new Scanner(System.in);

        // Указываем размер массивы в переменной.
        int size = 5;

        // Объявляем массив строк.
        String[] words = new String[size];

        // Инициализируем переменную longestWord
        String longestWord = "";

        // Цикл для заполнения массива значениями.
        for(String word : words) {
            System.out.print("Введите слово: ");
            word = scanner.nextLine();

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Самое длинное слово: " + longestWord);

        // Close the scanner object.
        scanner.close();
    }
}
