package case_study_module2.services.Impl;

import case_study_module2.models.Customer;
import case_study_module2.services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements Service {
    private List<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void addNew() {
        System.out.print("Enter ID customer: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter name customer: ");
        String name = scanner.nextLine();

        System.out.print("Enter age customer: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter gender customer (1. male - 2. female): ");
        int genderInt = Integer.parseInt(scanner.nextLine());
        boolean gender = genderInt == 1;

        System.out.print("Enter id card number customer: ");
        int idCard = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter phone number customer: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email customer: ");
        String email = scanner.nextLine();

        System.out.print("Enter address customer: ");
        String address = scanner.nextLine();

        System.out.print("Enter type of custommer: ");
        String typeOfCustomer = scanner.nextLine();

        Customer customer = new Customer(id,age,idCard,phoneNumber,name,email, gender,typeOfCustomer,address);
        customerList.add(customer);
        System.out.println("add new customer successful");
    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        for (Customer customers: customerList){
            System.out.println(customers.toString());
        }

    }

    @Override
    public void remove() {

    }
}
