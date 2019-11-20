import java.util.*;


public class ZooClub {
    private Map<Person, List<Pet>> mapZooClub = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Введіть ім'я учасника : ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        mapZooClub.put(person, new ArrayList<Pet>());
        System.out.println("Новий учасник " + person);
    }

    public void addPet(){
        System.out.println("Введіть ім'я учасника, до якого хочете додати тваринку: ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (mapZooClub.containsKey(person)){
            System.out.println("Введіть тип тваринки : ");
            String type= scanner.next();
            System.out.println("Введіть імя  тваринки : ");
            String n = scanner.next();
            Pet pet = new Pet(type, n);
            mapZooClub.get(person).add(pet);
            System.out.println("Тваринка " + pet + " успішно додана до учасника клубу " + person);
        }

    }
    public void deleteAnimal(){
        System.out.println("Введіть ім'я учасника, з якого хочете видалити тваринку: ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);
        if (mapZooClub.containsKey(person)){
            System.out.println("Введіть тип тваринки : ");
            String type = scanner.next();
            System.out.println("Введіть імя тваринки : ");
            String n = scanner.next();
            Pet pet = new Pet(type, n);
            mapZooClub.get(person).remove(pet);
            System.out.println("Тваринка " + person + " успішно видалена від учасника клубу " + person);
        }
    }
    public void delete(){
        System.out.println("Введіть ім'я учасника клубу, якого хочете видалити: ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (mapZooClub.containsKey(person)){
            mapZooClub.remove(person);
            System.out.println("Учасник " + person + " успішно видалений з клубу.");
    }
}
    public void deleteThisAnimal(){
        System.out.println("Введіть тип тваринки, яку хочете видалити : ");
        String type = scanner.next();
        System.out.println("Введіть кличку тваринки, яку хочете видалити  : ");
        String n = scanner.next();
        Pet pet = new Pet(type, n);

        Set<Map.Entry<Person, List<Pet>>> entryes = mapZooClub.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entryes.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();

            Iterator<Pet> iteratorPets = next.getValue().iterator();
            next.getValue().remove(pet);
        }
    }
    public void showZooClub(){
        Set<Map.Entry<Person, List<Pet>>> entries = mapZooClub.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<Person, List<Pet>> next = iterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }
    }
}


