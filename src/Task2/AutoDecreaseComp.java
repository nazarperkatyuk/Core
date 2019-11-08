package Task2;

import java.util.Comparator;

public class AutoDecreaseComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Auto) o1).getHorsePower() - ((Auto) o2).getHorsePower();
    }
}
