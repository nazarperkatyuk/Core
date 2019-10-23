import java.io.IOException;
import java.util.Scanner;

public class home5_1 {
    public static void main(String ...args) throws IOException {

        System.out.print("Input Boolean: ");
        Scanner scBool = new Scanner(System.in);
        boolean bool1 = scBool.nextBoolean();
        System.out.println("Boolean = " + bool1+ "\n");

        System.out.print("Input integer: ");
        Scanner scInt = new Scanner(System.in);
        int int1 = scInt.nextInt();
        System.out.println("Integer = " + int1 + "\n");

        System.out.print("Input byte: ");
        Scanner scByte = new Scanner(System.in);
        byte byte1 = scInt.nextByte();
        System.out.println("Byte = " + byte1+ "\n");

        System.out.print("Input char: ");
        Scanner scChar = new Scanner(System.in);
        char char1 = scChar.next().charAt(0);
        System.out.println("Char = " + char1+ "\n");

        System.out.print("Input short: ");
        Scanner scShort = new Scanner(System.in);
        short short1 = scInt.nextShort();
        System.out.println("Short = " + short1+ "\n");

        System.out.print("Input long: ");
        Scanner scLong = new Scanner(System.in);
        long long1 = scInt.nextLong();
        System.out.println("Long = " + long1+ "\n");

        System.out.print("Input float: ");
        Scanner scFloat = new Scanner(System.in);
        float float1 = scInt.nextFloat();
        System.out.println("Float = " + float1+ "\n");

        System.out.print("Input double: ");
        Scanner scDouble = new Scanner(System.in);
        double double1 = scInt.nextDouble();
        System.out.println("Double = " + double1+ "\n");

    }
}