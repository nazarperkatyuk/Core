import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть потрібне число: ");
        String choice = scanner.nextLine();

        ZooClub zooClub = new ZooClub();

        while (!choice.equalsIgnoreCase("quit")) {
            switch (choice) {
                case "1":
                    zooClub.add();
                    break;
                case "2":
                    zooClub.addPet();
                    break;
                case "3":
                    zooClub.deleteAnimal();
                    break;
                case "4":
                    zooClub.delete();
                    break;
                case "5":
                    zooClub.deleteThisAnimal();
                    break;
                case "6":
                    zooClub.showZooClub();
                    break;
                case "7":
                    System.exit(0);
                    break;
            }
            System.out.println("Введіть потрібне число: ");
            showMenu();
            choice = scanner.nextLine();

        }

    }
    private static void showMenu() {
        System.out.println("Меню: ");
        System.out.println("\t1. Додати учасника клубу");
        System.out.println("\t2. Додати тваринку до учасника клубу");
        System.out.println("\t3. Видалити тваринку з учасника клубу");
        System.out.println("\t4. Видалити учасника з клубу");
        System.out.println("\t5. Видалити конкретнку тваринку зі всіх власників");
        System.out.println("\t6. Вивести на екран зооклуб");
        System.out.println("7.Вийти");
    }
}
