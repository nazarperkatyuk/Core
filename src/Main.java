public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new Map<>(4, 2);
        map.addObject(3,2);
        map.addObject(2,3);
        map.addObject(5,1);
        map.show();
        map.deleteObjectKey(6);
        map.show();
        map.deleteObjectValue(3);
        map.show();
        map.showSetKey();
        map.showListValue();

    }
}
