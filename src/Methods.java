public class Methods {
    void numbers(double a, double b) throws MyException {
        try {
            checkNumbers(a, b);
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println(a + b);
    }
    private void checkNumbers(double a, double b) throws IllegalAccessException, MyException {
        if (a < 0 && b < 0){
            throw new IllegalArgumentException();

        } else if (( a == 0 && b != 0) || ( a != 0 && b == 0)){
            throw new ArithmeticException();

        }  else if (a == 0 && b == 0){
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        } else if ( a > 0 && b > 0) {
            throw new MyException();
        }
    }

    void riznytsya (double a, double b){
        System.out.println( a - b);
    }

    void dobytk (double a, double b){
        System.out.println( a * b);
    }

    void dilennya (double a, double b){
        System.out.println( a / b);
    }
}

