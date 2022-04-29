package case_study_module2.services.impl;

import case_study_module2.models.person.Customer;
import case_study_module2.services.CustomerService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.regex.RegexInput;
import case_study_module2.utils.regex.RegexInputCustomer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static case_study_module2.utils.ReadAndWrite.CUSTOMER_FILE;

public class CustomerServiceImpl implements CustomerService {
    private Scanner scanner = new Scanner(System.in);
    List<Customer> customerList = getListCustomer();
    @Override
    public void addNew() {
        Customer customer = new Customer();
        System.out.print("Enter ID customer: ");
        customer.setId(RegexInput.returnOnlyNumber());

        System.out.print("Enter name customer: ");
        customer.setName(RegexInput.returnString());

        System.out.print("Enter date of birth customer: ");
        customer.setBirthDay(RegexInput.returnBirthDay());

        System.out.println("Enter gender customer:\n" +
                "1. Male\n" +
                "2. Female");
        customer.setGender(RegexInput.returnGender());

        System.out.print("Enter id card number customer: ");
        customer.setIdCard(scanner.nextLine());

        System.out.print("Enter phone number customer: ");
        customer.setPhoneNumber(RegexInput.returnPhoneNumber());

        System.out.print("Enter email customer: ");
        customer.setEmail(RegexInput.returnEmail());

        System.out.println("Enter type of custommer: \n" +
                "1. Diamond\n" +
                "2. Platinium\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        customer.setTypeCustumer(RegexInputCustomer.returnTypeOfCustomer());

        System.out.print("Enter address customer: ");
        customer.setAddress(scanner.nextLine());

        ReadAndWrite.writeFile(CUSTOMER_FILE,customer.toFile());
        System.out.println("add new customer successful");
    }

    @Override
    public void edit() {
        display();
        int idEdit = 0;
        System.out.print("Enter id of Customer you want edit: ");
        idEdit = RegexInput.returnOnlyNumber();
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
                        System.out.print("Enter new date of birth customer: ");
                        customers.setBirthDay(RegexInput.returnBirthDay());
                        System.out.println("Edit date of birth customer successful");
                        break;
                    case 3:
                        System.out.println("Enter gender customer:\n" +
                                "1. Male\n" +
                                "2. Female");
                        customers.setGender(RegexInput.returnGender());
                        System.out.println("Edit gender of customer successful");
                        break;
                    case 4:
                        System.out.print("Enter new IDcard of customer: ");
                        customers.setIdCard(scanner.nextLine());
                        System.out.println("Edit IDcard of customer successful");
                        break;
                    case 5:
                        System.out.print("Enter new phone number of customer: ");
                        customers.setPhoneNumber(RegexInput.returnPhoneNumber());
                        System.out.println("Edit phone number of customer successful");
                        break;
                    case 6:
                        System.out.print("Enter new email of customer: ");
                        customers.setEmail(RegexInput.returnEmail());
                        System.out.println("Edit email of customer successful");
                        break;
                    case 7:
                        System.out.print("Enter new type of custumer of customer: ");
                        customers.setTypeCustumer(RegexInputCustomer.returnTypeOfCustomer());
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
        List<Customer> customerList = getListCustomer();
        System.out.println("<<Customer List>>");
        for (Customer customers: customerList){
            System.out.println(customers.toString());
        }

    }
    public static List<Customer> getListCustomer(){
        List<Customer> customerList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile(CUSTOMER_FILE);
        for (String[] lists : list) {
            customerList.add(new Customer(
                    Integer.parseInt(lists[0]),
                    lists[1],
                    lists[2],
                    lists[3],
                    lists[4],
                    lists[5],
                    lists[6],
                    lists[7],
                    lists[8]));
        }
        return customerList;
    }
}
