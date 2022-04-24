package case_study_module2.services.Impl;

import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;
import case_study_module2.services.Service;
import case_study_module2.utils.ReadAndWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static case_study_module2.utils.ReadAndWrite.CUSTOMER_FILE;
import static case_study_module2.utils.ReadAndWrite.EMPLOYEE_FILE;

public class CustomerServiceImpl implements Service {
    private Scanner scanner = new Scanner(System.in);
    List<Customer> customerList = ReadAndWrite.readFileCustomer() ;
    @Override
    public void addNew() {
        Customer customer = new Customer();
        while (true){
            try {
                System.out.print("Enter ID customer: ");
                customer.setId(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (Exception e){
                System.err.println("Wrong data type");
            }
        }

        System.out.print("Enter name customer: ");
        customer.setName(scanner.nextLine());

        System.out.print("Enter age customer: ");
        customer.setAge(scanner.nextLine());

        System.out.print("Enter gender customer: ");
        customer.setGender(scanner.nextLine());

        System.out.print("Enter id card number customer: ");
        customer.setIdCard(scanner.nextLine());

        System.out.print("Enter phone number customer: ");
        customer.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter email customer: ");
        customer.setEmail(scanner.nextLine());

        System.out.print("Enter type of custommer: ");
        customer.setTypeCustumer(scanner.nextLine());

        System.out.print("Enter address customer: ");
        customer.setAddress(scanner.nextLine());

        ReadAndWrite.writeFileCustomer(customer);
        System.out.println("add new customer successful");
    }

    @Override
    public void edit() {
        display();
        int idEdit = 0;
        while (true) {
            try {
                System.out.print("Enter id of Customer you want edit: ");
                idEdit = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Wrong, id must be number, please re-enter.");
            }
        }
        boolean check = true;
        for (Customer customers : customerList) {
            if (idEdit == customers.getId()) {
                check = false;
                int choose = 0;
                System.out.println("Editing options\n" +
                        "1. Name\n" +
                        "2. Age\n" +
                        "3. Gender\n" +
                        "4. ID Card\n" +
                        "5. Phone number\n" +
                        "6. Email\n" +
                        "7. Type of custumer\n" +
                        "8. Address\n" +
                        "0. Exit\n");
                while (true){
                    try {
                        System.out.print("Choose section you want to edit: ");
                        choose = Integer.parseInt(scanner.nextLine());
                        break;
                    }catch (NumberFormatException e){
                        System.err.println("Wrong, please re-enter.");
                    }
                }
                switch (choose){
                    case 1:
                        System.out.print("Enter new name of customer: ");
                        customers.setName(scanner.nextLine());
                        System.out.println("Edit name of customer successful");
                        break;
                    case 2:
                        System.out.print("Enter new age of customer: ");
                        customers.setAge(scanner.nextLine());
                        System.out.println("Edit age of customer successful");
                        break;
                    case 3:
                        System.out.print("Enter new gender of customer: ");
                        customers.setGender(scanner.nextLine());
                        System.out.println("Edit gender of customer successful");
                        break;
                    case 4:
                        System.out.print("Enter new IDcard of customer: ");
                        customers.setIdCard(scanner.nextLine());
                        System.out.println("Edit IDcard of customer successful");
                        break;
                    case 5:
                        System.out.print("Enter new phone number of customer: ");
                        customers.setPhoneNumber(scanner.nextLine());
                        System.out.println("Edit phone number of customer successful");
                        break;
                    case 6:
                        System.out.print("Enter new email of customer: ");
                        customers.setEmail(scanner.nextLine());
                        System.out.println("Edit email of customer successful");
                        break;
                    case 7:
                        System.out.print("Enter new type of custumer of customer: ");
                        customers.setTypeCustumer(scanner.nextLine());
                        System.out.println("Edit type of custumer successful");
                        break;
                    case 8:
                        System.out.print("Enter new address of customer: ");
                        customers.setAddress(scanner.nextLine());
                        System.out.println("Edit address successful");
                        break;
                }
                reWriteListCustomer();
                break;
            }
        }
        if (check) {
            System.err.println("id does not exist");
        }
    }

    public  void reWriteListCustomer(){
        try {
            File file = new File(CUSTOMER_FILE);
            file.delete();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Customer customers : customerList){
                bufferedWriter.write(customers.toFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void display() {
        System.out.println("<<Customer List>>");
        for (Customer customers: customerList){
            System.out.println(customers.toString());
        }

    }
}
