import java.util.Scanner;

public class home5_4 {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] strMassive = str.split(" ");
        for(String str1: strMassive){
            System.out.println(str1 + " " + str1.length());
        }
    }
}