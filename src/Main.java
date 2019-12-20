import Task1.Pet;

public class Main {
    public static void main(String[] args) {

        Pet cow = () -> System.out.println("I am - Muu - muu!");
        cow.voice();

        Pet cat = () -> System.out.println("I am  - Meow - meow!");
        cat.voice();

        Pet dog = () -> System.out.println("I am  - Gaf - Gaf!");
        dog.voice();
    }
}