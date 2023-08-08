public class Arrays { // Массивы
    public static void main(String[] args) {
        int number = 10; // Примитивный тип данных (коробка) [10]
        char character = 'h'; // Примитивный тип данных
        String string = "hello"; // Ссылочный тип данных
        String s1 = new String("World"); // new создает новый объект класса String

        // Ссылочные типы данных, например, string или s1 (пульты управления) ссылаются на объекты.

        // Массив -- это ссылочный тип данных.

        // Создаем целочисленный массив
        int[] numbers = new int[5];
        /* По сравнению с примитивным типом данных
        (коробкой где лежит значение переменной),
        название массива ссылается на объект new int[5].
        number --> [массив].
        В пустом массиве все ячейки массива автоматически инициализируются как 0.
         */

        System.out.println(numbers[3]); // в квадратных скобках указан индекс.
                                        // отсчет индексов идет с нуля. 0 1 2 3 4

        // Можно инициализировать построчно.
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        // можно использовать цикл for.
        for ( int i = 0; i < numbers.length; i++ ) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        System.out.println();
        // когда числа заранее известны.
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++ ) {
            System.out.println(numbers1[i]);
        }

        /* тоже самое что и последний цикл
        int[] numbers1 = {1, 2, 3};
        for (int j : numbers1) {
            System.out.println(j);
        }
         */
    }
}
