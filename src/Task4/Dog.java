package Task4;

public class Dog {
    private int speed;
    private int weight;

    public Dog(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
