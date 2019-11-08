import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input palindrome, please");
        String string = scanner.nextLine();
        char[] str = string.toCharArray();

        boolean f = true;
        if (str.length == 5) {
            for (int i = 0; i < string.length(); i++) {
                if (str[i] != str[str.length - i - 1]) {
                    System.out.println("Слово не паліндром");
                    f = false;
                    break;
                }
            }
            if (f)
                System.out.println("Слово паліндром");
        } else {
            System.out.println("Слово не з 5 букв");
        }
    }
}