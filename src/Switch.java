import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи возраст: ");
        int age = scanner.nextInt();

        switch (age) {
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println(" ни одно условие не подошло");
        }

        // String age = scanner.nextLine();
        // switch(age)
        // case "ноль"
    }
}
