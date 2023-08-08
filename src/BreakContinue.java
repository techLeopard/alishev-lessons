public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i==5) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла.");

        for ( int c = 0; c <= 15 ; c++) {
            if (c%2==0) {
                continue;
            }
            System.out.println("Это нечетное число " + c);
        }
    }
}
