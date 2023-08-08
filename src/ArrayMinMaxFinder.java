/*
Описание:
Напишите программу на Java,
которая создает числовой массив,
заполняет его значениями
и находит минимальное и максимальное число в массиве.
 */

 import java.util.Random;
public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        // Создаем класс Random.
        Random random = new Random();

        // Задаём число значений массива.
        int size = 5;

        // Создаём числовой массив.
        int[] array = new int[size];

        // Выводим значения элементов массива
        System.out.println("Значения элементов массива: ");
        // Создаем цикл для вывода значений массива
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        // Инициализируем переменные min и max.
        int min = array[0];
        int max = array[0];

        // Вывести максимальное значение из массива.
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

    }
}
