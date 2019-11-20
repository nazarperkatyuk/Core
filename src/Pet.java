public class Pet {
    private String type;
    private String n;

    public Pet(String type, String n) {
        this.type = type;
        this.n = n;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", n='" + n + '\'' +
                '}';
    }

}
