public class Task3Main {
    public static void main(String ...args){
        Animal animal = new Animal("Tiger",80,9);
        System.out.println(animal.toString());
        System.out.println("name= "+animal.getName()+" age = "+ animal.getAge()+" speed = "+animal.getSpeed());

        System.out.println("====================");

        animal.setAge(20);
        animal.setName("Giraffe");
        animal.setSpeed(40);

        System.out.println(animal.toString());
    }
}