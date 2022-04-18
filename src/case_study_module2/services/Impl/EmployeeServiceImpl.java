package case_study_module2.services.Impl;

import case_study_module2.models.Employee;
import case_study_module2.services.EmployeeService;
import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        System.out.print("Enter ID employee: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter name employee: ");
        String name = scanner.nextLine();

        System.out.print("Enter age employee: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter gender employee (1. male - 2. female): ");
        int genderInt = Integer.parseInt(scanner.nextLine());
        boolean gender = genderInt == 1;

        System.out.print("Enter id card number employee: ");
        int idCard = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter phone number employee: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email employee: ");
        String email = scanner.nextLine();

        System.out.print("Enter level employee: ");
        String level = scanner.nextLine();

        System.out.print("Enter position employee: ");
        String position = scanner.nextLine();

        System.out.print("Enter salary employee: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, age, idCard, phoneNumber, name,
                email, gender, level, position, salary);
        employeeList.add(employee);
        System.out.println("Add new employee successful");

    }

    @Override
    public void edit() {


    }

    @Override
    public void display() {
        for (Employee employees : employeeList) {
            System.out.println(employees.toString());
        }

    }

    @Override
    public void remove() {

    }
}
