import Task5.Amphibia;

public class Main5 {
    public static void main(String[] args) {
        Amphibia eat = () -> System.out.println("Amphibious is eating!");
        eat.doSomething();

        Amphibia sleep = () -> System.out.println("Amphibious is sleeping!");
        sleep.doSomething();

        Amphibia swim = () -> System.out.println("Amphibious is swimming!");
        swim.doSomething();

        Amphibia walk = () -> System.out.println("Amphibious is walking!");
        walk.doSomething();

    }
}