import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Parlament {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Faction> allFractions = new ArrayList<>();

    public void addFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();

        Faction faction = new Faction(name);
        allFractions.add(faction);
        System.out.println("Фракція " + faction.getName() + " успішно додана");
    }
    public void remove_faction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();

        Iterator<Faction> iterator = allFractions.iterator();
        while (iterator.hasNext()){
            Faction nextFaction = iterator.next();
            if ( nextFaction.getName().equalsIgnoreCase(name))
                iterator.remove();
            System.out.println("Фракція " + nextFaction.getName() + " успішно видалена ");
        }
    }
    public void showAllFactions(){
        System.out.println("Список усіх фракцій Верховної ради: ");
        Iterator<Faction> iterator2 = allFractions.iterator();
        while (iterator2.hasNext()){
            Faction nextFaction = iterator2.next();
            System.out.println(nextFaction.getName());
        }
    }
    public void showFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();

        for (Faction faction : allFractions){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.add();
            }
        }
    }
    public void addDeputyToTheFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        for (Faction faction : allFractions){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.all_deputy();
            }
        }
    }
    public void deleteDeputyFromFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        for (Faction faction : allFractions){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.remove();
            }
        }
    }
    public void deleteAllDeputyFromFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        for (Faction faction : allFractions){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.remove();
            }
        }
    }

    public void showAllBribeTakers(){
        for (Faction faction : allFractions){
            faction.biggest_grafter();
        }
    }
    public void theBiggestBribeTaker(){

        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        System.out.println("Найбільшим хабарником даної фракції є: ");
        for (Faction faction : allFractions){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.biggest_grafter();
            }
        }
    }

}
