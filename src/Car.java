public class Car implements Comparable<Car> {
    private String brend;
    private int age;

    public Car(String brend, int age) {
        this.brend = brend;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", age=" + age +
                '}';
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Car car) {
        return 0;
    }

//    @Override
//    public int compareTo(Car o) {
//        return brend.equalsIgnoreCase(o.brend);
    }


