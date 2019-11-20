import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Car BMW = new Car("BMW", 2);
        Car Opel = new Car("Opel", 4);
        Car Audi = new Car("Audi", 1);
        Car Renault = new Car("Renault", 6);
        Car Volvo = new Car("Volvo", 3);
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(BMW);
        cars.add(Opel);
        cars.add(Audi);
        cars.add(Renault);
        cars.add(Volvo);

        System.out.println("перед сортуванням:");
        System.out.println(cars);

        Set<Car> carsTreeSetByBrend = new TreeSet<>(cars);
        carsTreeSetByBrend.addAll(cars);
        System.out.println("сортування по бренду");
        System.out.println(carsTreeSetByBrend);

        TreeSet<Car> carsTreeSetByAge = new TreeSet<>(new CompareAge());
        carsTreeSetByAge.addAll(cars);
        System.out.println("сортування по віку");
        System.out.println(carsTreeSetByAge);
    }
}


