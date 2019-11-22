import java.util.Objects;

public class Car {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age &&
                Objects.equals(brend, car.brend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brend, age);
    }
}
