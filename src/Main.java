import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            showMenu();
            System.out.println("Введіть потрібне число: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            Parlament parlament = new Parlament();
            while (choice !=10){
                switch (choice){
                    case 1:
                        parlament.addFaction();
                        break;
                    case 2:
                        parlament.remove_faction();
                        break;
                    case 3:
                        parlament.showAllFactions();
                        break;
                    case 4:
                        parlament.deleteAllDeputyFromFaction();
                        break;
                    case 5:
                        parlament.showFaction();
                        break;
                    case 6:
                        parlament.addDeputyToTheFaction();
                        break;
                    case 7:
                        parlament.deleteDeputyFromFaction();
                        break;
                    case 8:
                        parlament.showAllBribeTakers();
                        break;
                    case 9:
                        parlament.theBiggestBribeTaker();
                        break;
                    case 10:
                        System.out.println(10);
                        break;
                    default:
                        System.out.println("Такого пункту меню не існує");

                }
                showMenu();
                choice = scanner.nextInt();
            }
        }

        private static void showMenu() {
            System.out.println("Меню: ");
            System.out.println("\t1. Додати фракцію");
            System.out.println("\t2. Видалити конкретну фракцію");
            System.out.println("\t3. Вивести усі фракції");
            System.out.println("\t4. Очистити конкретну фракцію");
            System.out.println("\t5. Вивести конкретну фракцію");
            System.out.println("\t6. Додати депутата у фракцію");
            System.out.println("\t7. Видалити депутата з фракції");
            System.out.println("\t8. Вивести список хабарників");
            System.out.println("\t9. Вивести найбільшого хабарника");
            System.out.println("10.Вийти");

        }
    }


