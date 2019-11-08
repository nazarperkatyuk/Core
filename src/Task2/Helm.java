package Task2;

public class Helm {
    private double diameter;
    private String helmMaterial;

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", helmMaterial='" + helmMaterial + '\'' +
                '}';
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getHelmMaterial() {
        return helmMaterial;
    }

    public void setHelmMaterial(String helmMaterial) {
        this.helmMaterial = helmMaterial;
    }
}
