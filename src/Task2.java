
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");

        double a = scanner.nextDouble();
        if (a % 1 != 0) {
            System.out.println("Помилка");
        } else {
            System.out.println("Ціле");
        }
        if (a % 2 == 0) {
            System.out.println("парне");
        }
        else {
            if (a % 1 == 0) {
                System.out.println("Непарне");

            }
        }
    }
}