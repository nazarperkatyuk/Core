package Task2;

public class Engine {
    private int countOfCylinders;

    @Override
    public String toString() {
        return "Engine{" +
                "countOfCylinders=" + countOfCylinders +
                '}';
    }

    public int getCountOfCylinders() {
        return countOfCylinders;
    }

    public void setCountOfCylinders(int countOfCylinders) {
        this.countOfCylinders = countOfCylinders;
    }
}
