import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        char[] loud = {'a', 'o', 'u', 'e', 'i'};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer(input);

        System.out.println("Length = " + stringBuffer.length());

        for (int i = 0; i < input.length(); i++) {

            for (int j = 0; j < loud.length; j++)

                if (input.toLowerCase().charAt(i) == loud[j])
                    stringBuffer.setCharAt(i, '-');
        }
        System.out.println(stringBuffer);
    }
}

