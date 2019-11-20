public class Human {
    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

        @Override
        public String toString() {
            return "Human{" +
                    "height=" + height +
                    ", weight=" + weight +
                    '}';

    }
}
