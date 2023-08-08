/*
Описание:
Напишите программу на Java, которая создает числовой массив,
заполняет его значениями,
а затем вычисляет сумму всех элементов массива.
 */
import java.util.Random;

public class ArraySumCalculator {
    public static void main(String[] args) {

        // Создаем объект рандома.
        Random random = new Random();

        // Задайте размер массива.
        int size = 5;

        int[] array = new int[size];

        // Выводим массив на экран.
        System.out.println("Сгенерированный массив: ");

        // Генерация случайных чисел от 0 до 99.
        for(int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        // Инициализируем переменную Сумма.
        int sum = 0;

        // Суммируем значения массива.
        for(int i = 0; i < size; i++) {
            sum += array[i];
        }


        // Выводим значение суммы.
        System.out.println("Сумма: " + sum);
    }
}
