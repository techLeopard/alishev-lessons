public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);


        /*
        1, 2, 3, 4, 5, 6, 0, -2

        123
        345
        678
        Сначала указать номер строки, затем номер столбца.
        Отсчет так же, с нуля.
         */

        int[][] matrix = {  {1,2,3},
                            {4,5,6},
                            {7,8,9}};

        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);

        int[] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "hello";
        System.out.println(strings[0][1]);

        System.out.println();


        // как выводить массив на экран в виде таблицы.
        // один цикл вложен во второй. один цикл проходит про строкам, другой - по столбцам.

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
