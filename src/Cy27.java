public class Cy27 extends Airplane implements SpecialFeatures {

    AirplaneControl airplaneControl = new AirplaneControl();

    private int MaxSpeed;
    private String color;

    void getAirplaneControl() {
        airplaneControl.MoveUp();
        airplaneControl.MoveLeft();
        airplaneControl.MoveDown();
        airplaneControl.MoveRight();

    }


    public Cy27(int length, int weight, int wight, int maxSpeed, String color) {
        super(length, weight, wight);
        MaxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void turboAcceleration() {
        int speed = (int) (Math.random() * 100 + MaxSpeed);
        System.out.println("Вмикається турбо-прискорення " + speed + " км/год.");


    }

    @Override
    public void stealsTechnology() {
        int time = (int) (Math.random() * 30);
        System.out.println("Літака не видно на радарі впродовж " + time + " хвилин. Режим Стелс активовано.");

    }

    @Override
    public void nuclearStrike() {
        int strike = (int) (Math.random() * 7) ;
        System.out.println("Буде скинуто така кількість " + strike + " боєголовок.");

    }
    @Override
    public String toString() {
        return "Літак Cy27 {" +
                " максимальна швидкість = " + MaxSpeed +
                ", колір = '" + color + '\'' +
                ", довжина = " + length +
                ", ширина = " + weight +
                ", вага = " + wight +
                '}';
    }
}
