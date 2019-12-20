package Task2;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> position = () -> ((int) ((Math.random()) * 10)) % 2 == 0 ? "heads" : "tails";
        System.out.println(position.get());
    }

}