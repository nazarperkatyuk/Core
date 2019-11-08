package Task2;

public class Auto {
    private int year;
    private int horsePower;
    private Engine engine = new Engine();
    private Helm helm = new Helm();

     {//random constructor
        year = (int) (Math.random() * 124 + 1895);
        horsePower = (int) (Math.random() * 1000);

        helm = new Helm();
        helm.setDiameter(Math.random() * 30 + 20);
        helm.setHelmMaterial("Leather type: " + (int) (Math.random() * 100));

        engine = new Engine();
        engine.setCountOfCylinders((int) (Math.random() * 10) + 1);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "year=" + year +
                ", horsePower=" + horsePower +
                ", engine=" + engine +
                ", helm=" + helm +
                '}';
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }
}
