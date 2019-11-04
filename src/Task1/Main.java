package Task1;
import java.util.Scanner;

/**
 *
 */

/**
 * @since JDK 1.8
 * @author Nazar
 * @version 0.01
 * */
public class Main {
    // зміна для введеня рядка читання
    static Scanner scanner;
    //зберегти введення
    public static void main(String[] args) {
        showMenu();
        scanner = new Scanner(System.in);
        String line = scanner.next();
        // виявлення помилки
        while (!line.equalsIgnoreCase("quit")) {
            switch (line) {
                case "1":
                    try {
                        item_1();
                    } catch (WrongInputConsoleParametersException e) {
                        System.out.println("Stack Trac:");
                        e.printStackTrace();
                        System.out.println("Error message:");
                        System.out.println(e.getMessage());
                        System.out.println("Problem string:");
                        System.out.println(e.returnProblemNumber());
                    }
                    break;
                case "2":
                    item_2();
                    break;
                case "3":
                    item_3();
                    break;
                case "4":
                    item_4();
                    break;
                case "5":
                    item_5();
                    break;
                case "6":
                    item_6();
                    break;
                case "7":
                    item_7();
                    break;
                case "8":
                    item_8();
                    break;
                case "9":
                    item_9();
                    break;
                case "10":
                    item_10();
                    break;
                case "11":
                    System.out.println(11);
                    break;
                default:
                    System.out.println("Такого пункту меню не існує");
            }
            showMenu();
            line = scanner.next();
            }

        }
//      Перевірка чи шснує такий місяць
        private static void item_1() throws WrongInputConsoleParametersException {
            boolean a = false;
            System.out.println("Перевірити чи є такий місяць");
            String month = scanner.next();
            for (Months months : Months.values()) {
                if (months.name().equalsIgnoreCase(month)) {
                    System.out.println("Місяць існує");
                    a = true;
                }
            }
            //      System.out.println("Місяць не існує");
            if (!a) throw new WrongInputConsoleParametersException("Місяць не існує", month);
        }
        // перевіка ти існє така пора року
    private static void item_2() {
        boolean a = false;
        System.out.println("Введи пору року: ");
        String str = scanner.next();
        for (Months months : Months.values()) {
            if (months.getSeanons().name().equalsIgnoreCase(str)) {
                System.out.println(months.name());
                a = true;
            }
        }
        if (!a) {
            System.out.println("Місяців не знайдено");
        }
    }
//  Перевірка всі місяці з одинаквою кількістю днів
    private static void item_3() {
        boolean a = false;
        System.out.println("Введи кількість днів у місяці: ");
        int day = scanner.nextInt();
        for (Months mon : Months.values()) {
            if (mon.getDays() == day) {
                System.out.println(mon.name());
                a = true;
            }
        }
        if (!a) {
            System.out.println("Місяців не знайдено");
        }
    }
    //  Перевірка всі місяці з одинаквою кількістю днів
    private static void item_4() {
        boolean a = false;
        System.out.println("Введи кількість днів у місяці: ");
        int day = scanner.nextInt();
        for (Months mon : Months.values()) {
            if (mon.getDays() < day) {
                System.out.println(mon.name());
                a = true;
            }
        }
        if (!a) {
            System.out.println("Місяців не знайдено");
        }
    }
    //  Перевірка всі місяці з одинаквою кількістю днів
    private static void item_5() {
        boolean a = false;
        System.out.println("Введи кількість днів у місяці: ");
        int day = scanner.nextInt();
        for (Months mon : Months.values()) {
            if (mon.getDays() > day) {
                System.out.println(mon.name());
                 a = true;
            }
        }
        if (!a) {
            System.out.println("Місяців не знайдено");
        }
    }
// Перевірка чи є така пора року
    private static void item_6() {
        boolean a = false;
        System.out.println("Введи пору року: ");
        String str = scanner.next();
        for (Seasons s : Seasons.values()) {
            if (s.name().equalsIgnoreCase(str)) {
                if (s.ordinal() == 3) {
                    System.out.println("Наступна пора року: " + Seasons.values()[0]);
                } else {
                    System.out.println("Наступна пора року: " + Seasons.values()[s.ordinal() + 1]);
                }
                a = true;
            }
        }
        if (!a) {
            System.out.println("Пору року не знайдено");
        }
    }
    //  Перевірка всі місяці з одинаквою кількістю днів
    private static void item_7() {
        boolean a = false;
        System.out.println("Введи пору року: ");
        String str = scanner.next();
        for (Seasons s : Seasons.values()) {
            if (s.name().equalsIgnoreCase(str)) {
                if (s.ordinal() == 0) {
                    System.out.println("Попередня пора року: " + Seasons.values()[3]);
                } else {
                    System.out.println("Попередня пора року: " + Seasons.values()[s.ordinal() - 1]);
                }
                a = true;
            }
        }
        if (!a) {
            System.out.println("Пору року не знайдено");
        }
    }
//Перевірка чи інсує місяць з парною кількістю днів
    private static void item_8() {
        boolean a = false;
        System.out.println("Місяці з парною кількістю днів: ");
        for (Months mon : Months.values()) {
            if (mon.getDays() % 2 == 0) {
                System.out.println(mon.name());
                a = true;
            }
        }
        if (!a) {
            System.out.println("Місяців не знайдено");
        }
    }
    //Перевірка чи інсує місяць з непарною кількістю днів
    private static void item_9() {
        boolean a = false;
        System.out.println("Місяці з непарною кількістю днів: ");
        for (Months mon : Months.values()) {
            if (mon.getDays() % 2 == 1) {
                System.out.println(mon.name());
                a = true;
            }
        }
        if (!a) {
            System.out.println("Місяців не знайдено");
        }
    }

    private static void item_10() {
        boolean a = false;
        System.out.println("Введи місяць: ");
        String str = scanner.next();
        for (Months mon : Months.values()) {
            if (mon.name().equalsIgnoreCase(str)) {
                if (mon.getDays() % 2 == 0) {
                    System.out.println("Місяць з парною кількість днів");
                    a = true;
                }
                else if (mon.getDays() % 2 == 1) {
                    System.out.println("Місяць з непарною кількість днів");
                    a = true;
                }
            }
        }
        if (!a) {
            System.out.println("Місяць не знайдено");
        }
    }
        private static void showMenu() {
            System.out.println("Меню: ");
            System.out.println("\t 1. Перевірити, чи є такий місяць");
            System.out.println("\t 2. Вивести всі місяці з такою ж порою року");
            System.out.println("\t 3. Вивести всі місяці, які мають таку саму кількість днів");
            System.out.println("\t 4. Вивести всі місяці, які мають меншу кількість днів");
            System.out.println("\t 5. Вивести всі місяці, які мають більшу кількість днів");
            System.out.println("\t 6. Вивести наступну пору року");
            System.out.println("\t 7. Вивести попередню пору року");
            System.out.println("\t 8. Вивести всі місяці, які мають парну кількість днів");
            System.out.println("\t 9. Вивести всі місяці, які мають непарну кількість днів");
            System.out.println("\t 10. Перевірити, чи введений місяць має парну кількість днів ");
            System.out.println("\t 11. Вийти ");
        }
}


