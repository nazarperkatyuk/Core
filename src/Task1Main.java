public class Task1Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[3];

        pets[0] = new Cat();
        pets[1] = new Dog();
        pets[2] = new Cow();

        for(Pet pet:pets){
            pet.voice();
        }
    }
}