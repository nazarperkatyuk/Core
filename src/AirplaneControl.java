public class AirplaneControl {

    void MoveUp(){
        int a = (int) (Math.random() * 100);
        System.out.println("Відстань вверх: " + a);

    }
    void MoveDown(){
        int b = (int) (Math.random() * 100);
        System.out.println("Відстань вниз: " + b);

    }
    public void MoveLeft(){
        int c = (int) (Math.random() * 200);
        System.out.println("Відстань вліво: " + c);

    }
    public void MoveRight(){
        int d = (int) (Math.random() * 200);
        System.out.println("Відстань вправо: " + d);

    }

}

