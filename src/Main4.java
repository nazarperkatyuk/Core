import Task4.Dog;
import Task4.Interface;

public class Main4 {
    public static void main(String[] args) {
        Interface intDog = Dog::new;
        Dog dog = intDog.creatNewDog(40, 30);
        System.out.println(dog);
    }
}

