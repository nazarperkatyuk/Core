import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Faction {

    private String name;

    public Faction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    ArrayList<Deputy> ListOfDeputy = new ArrayList<Deputy>();
    static Scanner scanner = new Scanner(System.in);

    public void add () {
        System.out.println("Введіть прізвище депутата");
        String surname = scanner.next();
        System.out.println("Введіть ім'я депутата");
        String name = scanner.next();
        System.out.println("Введіть вік депутата");
        int age = scanner.nextInt();
        System.out.println("Введіть вагу депутата");
        double weight = scanner.nextDouble();
        System.out.println("Введіть ріст депутата");
        double height = scanner.nextInt();
        System.out.print("Депутат хабарник? (true : false): ");
        boolean grafter = scanner.nextBoolean();

        Deputy deputy = new Deputy(weight, height, surname, name, age, grafter);

        ListOfDeputy.add(deputy);
        System.out.print("Новий депутат: ");
        deputy.toString();

        if (deputy.isGrafter()) {
            deputy.getSizeBribe();
        }
    }

        public void  remove(){
            System.out.println("Введіть прізвище депутата");
            String surname = scanner.next();
            System.out.println("Введіть ім'я депутата");
            String name = scanner.next();

            Iterator<Deputy>iterator = ListOfDeputy.iterator();

            while (iterator.hasNext()){
                Deputy nextDeputy = iterator.next();
                if (nextDeputy.getSurname().equalsIgnoreCase(surname) &&nextDeputy.getName().equalsIgnoreCase(name)){
                    iterator.remove();
                    System.out.println("Депутат " + nextDeputy.toString() + " успішно видалений з фракції.");
                }
            }
        }
    public void all_grafter(){
        System.out.println("Виведемо всіх хабарників у фракції:");
        for (Deputy deputy : ListOfDeputy){
            if (deputy.isGrafter()){
                System.out.println("Депутат, який бере хабарь: " + deputy.toString());
            } else {
                System.out.println("Нема депутатів, які беруть хабарі");
            }
        }
    }
    public void biggest_grafter(){
        int SiseBride = 0;
        int indexOfDeputy = -1;

        for (int i = 0; i < ListOfDeputy.size() ; i++) {
            if (ListOfDeputy.get(i).isGrafter()){
                if (ListOfDeputy.get(i).getSizeBribe() > SiseBride){
                    SiseBride = ListOfDeputy.get(i).getSizeBribe();
                    indexOfDeputy = ListOfDeputy.indexOf(ListOfDeputy.get(i));
                }
            }
        }
        if (indexOfDeputy >= -1) {
            System.out.println(ListOfDeputy.get(indexOfDeputy).getName());
        } else {
            System.out.println("В даній фракції хабарників нема");
        }
    }
    public void all_deputy(){
        System.out.println("Виведемо всіх депутатів у фракції:");
        Iterator<Deputy> iterator = ListOfDeputy.iterator();
        while (iterator.hasNext()){
            Deputy nextDeputy = iterator.next();
            System.out.println(nextDeputy);
        }
    }
    public void clean_faction(){
        ListOfDeputy.clear();
        System.out.println("Фракцію очищено");
    }

    }


