import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File fileEmployee = new File("FileEmployee.txt");
        Employee employee = new Employee("Nazar", 1, 1000);
        System.out.println(" serialize/deserialize : \n" + employee);
        System.out.println();
        System.out.println("After serialize/deserialize : ");
        Methods.serialize(employee, fileEmployee);
        System.out.println(Methods.deserialize(fileEmployee));
        System.out.println();

        File fileListOfEmployees = new File("FileListOfEmployees.txt");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(new Employee("Oleg", 2, 2000));
        employeeList.add(new Employee("Olga", 3, 4500));

        System.out.println("\nList before serialization: ");
        for (Employee employee1 : employeeList) {
            System.out.println(employee1);
        }
    }
    }
