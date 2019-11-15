import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {


        Integer [] array = new Integer[20];
        for (int i = 0; i < array.length; i++) {
            array[i]=  (Integer)((int)(Math.random()*10)-2);
    }
        System.out.println();
        Arrays.sort(array);
        System.out.println("В порядку зростання: " + Arrays.toString(array));
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println("В порядку спадання: " + Arrays.toString(array));

    }
}
