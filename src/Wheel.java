public class Wheel {

    private int radius = 50;
    private int width = 200;

     public Wheel (int radius, int width){
         this.radius = radius;
         this.width=width;
    }
     public Wheel (){}

    public int getRadius(){
        return radius; }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getWidth(){
        return width; }
    public void setWidth(int width) {
        this.width  = width;
    }
    @Override
    public String toString() {
        return "Wheel{" + "radius = " + radius +
                ", width=" + width +'}';
    }
    public void changeRadius(){
        radius *= 2;
    }
}

