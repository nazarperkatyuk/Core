

import java.util.function.Consumer;

public class Main3 {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Max float in exp: " + Float.MAX_VALUE);
        consumer.accept("Min float in exp: " + Float.MIN_VALUE);
        consumer.accept("Max double in exp: " + Double.MAX_VALUE);
        consumer.accept("Min double in exp: " + Double.MIN_VALUE);
    }
}