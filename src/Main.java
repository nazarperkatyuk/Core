public class Main {
    public static void main(String[] args) {

        Number[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("вивід");

        Collection collection = new Collection(numbers);
        Iterator class_1 =collection.create1();
        while (class_1.hasNext()){
            Integer next = (Integer) class_1.next();
            if (next % 2 !=0) {
                System.out.println(0);
            }else {
                System.out.println(next + "");
            }
        }
        System.out.println("");

        Iterator class_2 = collection.create2();
        while (class_2.hasNext()){
            Integer next = (Integer) class_2.next();
            System.out.println(next + "");
        }
        System.out.println("");

        Iterator class_3 = collection.create_Anonim();
        while (class_3.hasNext()){
            Integer next = (Integer) class_3.next();
            if (next %2 != 0){
                System.out.println(next);
            }
        }
        System.out.println("");

        Iterator class_4 = collection.create_Local();
        while (class_4.hasNext()){
            System.out.println(class_4.next() + "");
        }

        }

    }

