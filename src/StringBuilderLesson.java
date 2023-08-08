public class StringBuilderLesson {
    public static void main(String[] args) {
        System.out.print("String");
        System.out.println("String2");
        System.out.printf("This is a string, %s", "NICE");
        System.out.println();
        System.out.printf("This is a string, %d", 10);
        System.out.println();
        System.out.printf("%f This is %s a string, %d", 4.4, "HiHi", 20);
        System.out.println();
        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1000000000);
        System.out.printf("String %-10d \n", 532);
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 100000);
        System.out.printf("String %-10d \n", 100000000);
        System.out.printf("String %.2f", 10.333333);
    }
}

/*
%s для строк
%d для чисел
%f - floating point

\n перенос строки
%-10d числа слева
%.2f - 2 цифры после точки, а также округление.
 */