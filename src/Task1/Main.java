package Task1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int car1 = (int) (Math.random() * 3) + 1;
        ArrayList<ArrayList<Auto>>doubleArrayOfAuto = new ArrayList<ArrayList<Auto>>(car1);
        for (int i = 0; i < car1; i++) {
            int car2 = (int) (Math.random() * 5) + 2;
            ArrayList<Auto> temp = new ArrayList<Auto>();
            for (int j = 0; j < car2; j++) {
                temp.add(new Auto());
            }
            doubleArrayOfAuto.add(temp);
        }
        for (ArrayList<Auto> autos : doubleArrayOfAuto) {
            for (Auto auto : autos) {
                System.out.println(auto);
            }
        }
        menu(doubleArrayOfAuto);
    }

    public static void menu(ArrayList<ArrayList<Auto>> autos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make your choice");
        String choice = sc.nextLine();
        while (!choice.equalsIgnoreCase("exit")) {
            switch (choice) {
                case "1":
                    showMassive(autos);
                    break;
                case "2":
                    fillAllMassiveOfValue(autos, autos.get(0).get(0));
                    break;
            }
            choice = sc.nextLine();
        }
    }

    public static void showMassive(ArrayList<ArrayList<Auto>> autos) {
        System.out.println();
        for (ArrayList<Auto> arrayListOfAuto : autos) {
            for (Auto autoInArrayList : arrayListOfAuto) {
                System.out.println(autoInArrayList);
            }
        }
    }

    public static void fillAllMassiveOfValue(ArrayList<ArrayList<Auto>> autos, Auto auto) {
        for (int i = 0; i < autos.size(); i++) {
            Collections.fill(autos.get(i), auto);
        }
    }

}

