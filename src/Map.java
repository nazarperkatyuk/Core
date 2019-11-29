import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Map <K, V> extends MyEntry<K,V> {
    private LinkedHashMap<K, V> map;


    public Map(K k, V v) {
        super(k, v);
        this.map = new LinkedHashMap<K, V>();
        this.map.put(k, v);
    }

    public void addObject(K k, V v) {
        map.put(k, v);
    }
    public void deleteObjectKey(K k){
        System.out.print("Введіть ключ, за яким видалити елемент: ");
        map.remove(k);
    }

    public void deleteObjectValue(V v) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть значення, за яким видалити елемент: ");
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = iterator.next();
            if (next.getValue().equals(v)) {
                iterator.remove();
            }
        }
    }

    public void showSetKey() {
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = iterator.next();
            System.out.println(next.getKey().toString());
        }
    }

    public void showListValue() {
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<K, V> next = iterator.next();
            System.out.println(next.getValue().toString());
        }
    }

    public void show() {
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<K, V> next = iterator.next();
            System.out.println(next.getKey().toString() + " ---- " + next.getValue().toString());
        }
    }
}


