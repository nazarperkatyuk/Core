import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

        Class<Car> car = Car.class;
        System.out.println(car);

        System.out.println(car.getName());
        System.out.println(car.getSimpleName());

        System.out.println();
        int mod = car.getModifiers();

        System.out.println("Кількість модифікаторів - " + mod);
        System.out.println(" - " + Modifier.isPublic(mod));
        System.out.println(" - " + Modifier.isStatic(mod));
        System.out.println(" - " + Modifier.isPrivate(mod));
        System.out.println(" - " + car.getSuperclass());
        System.out.println();

        System.out.println("\tКонструктор:");
        Constructor<?>[] constructors = car.getConstructors();

        for (Constructor cons: constructors){
            System.out.println(cons);
        }

        System.out.println("\tСписок  полів: ");
        Field[] fields = car.getFields();

        for (Field field: fields){
            System.out.println(field);
        }
        System.out.println();

        System.out.println("\tСписок всіх полів: ");
        Field[] declaredFields = car.getDeclaredFields();

        for (Field field: declaredFields){
            System.out.println(field);
        }
        System.out.println();

        System.out.println("\tСписок всіх методів: ");
        Method[] methods = car.getMethods();
        for (Method m:methods) {
            System.out.println(m);
        }
        System.out.println();

        Car car1 = car.getConstructor(String.class, int.class).newInstance(new Object[]{"Toyota", 6});
        System.out.println("Новий об'єкт - " + car1);
        System.out.println();

        Field brend = car1.getClass().getField(" brend");
        brend.set(car1,"Lexus");
        System.out.println("Зміна поля об'єкта -" + car1);
        System.out.println();

        Method setAge = car.getMethod("setAge", int.class);
        setAge.invoke(car1,4);
        System.out.println("Зміна віку - " + car1.toString());
        System.out.println();

        Method setBrend = car.getMethod("setBrend", String.class, int.class);
        setBrend.invoke(car1, "Acura", 4);
        System.out.println("Зміна всіх полів - " + car1.toString());
        System.out.println();

    }
}
