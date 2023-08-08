import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String string = scanner.nextLine();
        System.out.println("Вы ввели: " + string);

        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        System.out.println("Вы ввели: " + x);

    }
}
