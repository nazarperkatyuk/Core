package Task2;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Auto[][] doubleArrayOfCars = new Auto[(int) (Math.random() * 3) + 1][(int) (Math.random() * 3) + 1];
        for (int i = 0; i < doubleArrayOfCars.length; i++) {
            for (int j = 0; j < doubleArrayOfCars[i].length; j++) {
                doubleArrayOfCars[i][j] = new Auto();
            }
        }
        System.out.println(Arrays.deepToString(doubleArrayOfCars));
        menu(doubleArrayOfCars);
    }

    public static void menu(Auto[][] cars) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make your choice");
        String choice = sc.nextLine();
        while (!choice.equalsIgnoreCase("exit")) {
            switch (choice) {
                case "1":
                    showMassive(cars);
                    break;
                case "2":
                    fillAllMassiveOfValue(cars, cars[0][0]);
                    break;
            }
            choice = sc.nextLine();
        }
    }

    public static void showMassive(Auto[][] autos) {
        System.out.println("Deep string\n" + Arrays.deepToString(autos));
        System.out.println("To string");
        for (int i = 0; i < autos.length; i++) {
            for (int j = 0; j < autos[i].length; j++) {
                System.out.println(autos[i][j]);
            }
        }
    }

    public static void fillAllMassiveOfValue(Auto[][] autos, Auto auto) {
        for (int i = 0; i < autos.length; i++) {
            Arrays.fill(autos[i], auto);
        }
    }

    private static void menu() {
        System.out.println("Menu: ");
        System.out.println("\t1. Вивести рандомні авто");
        System.out.println("\t2. Заповнити масив одним рандомним авто");
    }
}
