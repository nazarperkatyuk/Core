package Task2;

import java.util.Comparator;

public class AutoIncreaseComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Auto) o2).getHorsePower() - ((Auto) o1).getHorsePower();
    }
}