import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.')
                count++;
        }
        System.out.println(string  + ": " + "\n" + count + " sentence");
    }
}