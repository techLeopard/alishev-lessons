public class If {
    public static void main(String[] args) {
        int myInt = 15;

        if (4 == 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if ( myInt < 10 ) {
            System.out.println("Меньше 10.");
        } else if ( myInt > 20 ) {
            System.out.println("Больше 20.");
        } else {
            System.out.println("От 10 до 20");
        }

    }
}
