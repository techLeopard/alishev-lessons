public class ArraysOfStrings {
    public static void  main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "Betch";

        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for(int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for(String string : strings) {
            System.out.println(string);
        }

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int number: numbers1) {
            sum+=number;
        }

        System.out.println(sum);


        int value = 0; // выделяем 32 бита памяти.
        String s; // не знаем сколько будет занимать.
        // память выделяется под ссылку.

        // выделяем память под строку.
        String s1 = "fdfdf";

        String s0 = null; // по умолчанию

        // Аналогия адрес = дом
    }
}
