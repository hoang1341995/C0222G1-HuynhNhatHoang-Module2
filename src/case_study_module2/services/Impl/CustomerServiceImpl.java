package case_study_module2.services.Impl;

import case_study_module2.services.Service;

import java.util.Scanner;

public class CustomerServiceImpl implements Service {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void addNew() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        String age = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter id card number");
        int idCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone number");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter type custumer: "); ///line
        String level = scanner.nextLine();
        System.out.println("Enter position: ");
        String position = scanner.nextLine();
        System.out.println("Enter salary");
        int salary = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {

    }

    @Override
    public void remove() {

    }
}
