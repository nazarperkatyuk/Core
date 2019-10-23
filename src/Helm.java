public class Helm {

    private int diametr = 30;

    public Helm(int  diametr) {
        this.diametr = diametr;
    }
        public Helm(){}

        public int getDiametr () {
            return diametr; }
        public void setDiametr ( int diametr){
            this.diametr += diametr;
        }

    @Override
    public String toString() {
        return "Helm{" + "diameter = " + diametr +'}';
    }
    public void changeDiameter(){
        diametr += 2;
    }
}
