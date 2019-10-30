public class AirplaneControl {


        void MoveUp(){
            double a = Math.random() * 100;
            System.out.println("Відстань вверх: " + a);

        }
        void MoveDown(){
            double b = Math.random() * 100;
            System.out.println("Відстань вниз: " + b);

        }
        public void MoveLeft(){
            double  c = Math.random() * 200;
            System.out.println("Відстань вліво: " + c);

        }
        public void MoveRight(){
            double  d = Math.random() * 200;
            System.out.println("Відстань вправо: " + d);

        }

    }

