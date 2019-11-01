import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число 1:");
        int a = scanner.nextInt();
        System.out.println("Введи число 2: ");
        int b = scanner.nextInt();
        System.out.println("Сума = " + (a + b));
    }
}