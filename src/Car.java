public class Car {

    private int age;
    private String model = "Opel";
    private int number ;

    public Car() {
    }

    public Car(String age, String model, int number) {
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    Body body = new Body();
    Helm helm = new Helm();
    Wheel wheel = new Wheel();

    @Override
    public String toString() {
        return "Car{" +
                "age='" + age + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                '}';
    }

    public void carBody(int width) {
        body.setWidth(width);
    }

    public void carHelm(int diametr) {

        helm.setDiametr(diametr);
    }

    public void carWheel(int radius) {

        wheel.setRadius(radius);
    }
}

