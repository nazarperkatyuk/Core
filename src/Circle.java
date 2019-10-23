public class Circle {

    private double radius;
    private double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public Circle() {
        radius = 8;
        diameter = 6;
    }

    @Override
    public String toString() {
        return "Радіус кола " + radius + '\n' +
                "Діаметр кола " + diameter + '\n' +
                "Площа кола = " + square() + '\n' +
                "Периметр кола = " + perimeter();
    }

    public double square() {
        return ( Math.PI * Math.pow(diameter, 2) / 4);
    }

    public double perimeter() {
        return (Math.PI * 2 * radius);

    }

}