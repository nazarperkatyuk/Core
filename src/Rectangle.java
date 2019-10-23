public class Rectangle {

    private int width;
    private int length;

    public Rectangle(){
        length = 20;
        width = 100;
    }

    public  Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Довжина прямокутника: " + length + "\nШирина прямокутника: "+ width
                + "\nПлоща прямокутника = " + Square()
                +"\nПериметр прямокутника = "+ Perimeter() + "\n";
    }

    public double Square() {
        return width * length;
    }
    public double Perimeter(){
        return (width + length) * 2;
    }
}