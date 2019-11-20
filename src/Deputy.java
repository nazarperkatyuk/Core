import java.util.Scanner;

public class Deputy extends Human{

    private String surname;
    private String name;
    private int age;
    private boolean grafter;
    private int sizeBribe;

    public Deputy(String surname, String name, int age, boolean grafter, int sizeBribe) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.grafter = grafter;
        this.sizeBribe = sizeBribe;
    }

    public Deputy(double weight, double height, String surname, String name, int age, boolean grafter) {
        super();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public int getSizeBribe() {
        return sizeBribe;
    }

    public void setSizeBribe(int sizeBribe) {
        this.sizeBribe = sizeBribe;
    }
    @Override
    public String toString() {
        return "Deputy{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grafter=" + grafter +
                ", sizeBribe=" + sizeBribe +
                '}';
    }

    private void brideGive(){
        if (grafter == false) {
            System.out.println("Цей депутат не бере хабарів");
        }
        if (grafter == true){
            System.out.println("Введіть суму хабаря: ");
            Scanner scanner = new Scanner(System.in);
            int graft = scanner.nextInt();
            if (graft > 5000){
                System.out.println("Міліція ув'язнить депутата");
            } else {
                this.sizeBribe = graft;

            }
        }

    }
}

