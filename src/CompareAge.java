import java.util.Comparator;

public class CompareAge implements Comparator<Car> {
    @Override
    public int compare (Car o1, Car o2) {
        return o1.getAge() -o2.getAge();
    }

}
