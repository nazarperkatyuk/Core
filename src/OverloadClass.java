public class OverloadClass {
    private int a, b;

    OverloadClass(int a, int b ){
        this.a = a;
        this.b = b;
    }
    OverloadClass(){
        this(4,7);
    }
    int getA(){
        return a;
    }
    int getB () {
        return b;
    }

}