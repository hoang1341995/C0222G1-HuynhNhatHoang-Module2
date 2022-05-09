package de_kin.services.implement;

import de_kin.models.person.Customer;
import de_kin.services.CustomerService;
import de_kin.utils.ReadAndWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static case_study_module2.utils.ReadAndWrite.CUSTOMER_FILE;
import static de_kin.controllers.DisplayMainMenu.booking;
import static de_kin.controllers.DisplayMainMenu.scanner;
import static de_kin.utils.ReadAndWrite.CUSTOMER_PATH;
import static de_kin.utils.RegexInput.*;

public class CustomerImpl implements CustomerService {
        List<Customer> customerList = getCustomerList();
    @Override
    public void display() {
        customerList = getCustomerList();
        for (Customer customers: customerList){
            System.out.println(customers.toString());
        }
    }

    @Override
    public void addNew() {
        Customer customer = new Customer();
        System.out.println("Enter id customer (CUS-XXXX)");
        customer.setId(returnIdCustomer());
        System.out.println("Enter Name customer");
        customer.setName(scanner.nextLine());
        System.out.println("Enter birthDay");
        customer.setBirthDay(checkBirthDayCustomer());
        customer.setBookingStatus("NO");
        ReadAndWrite.write(CUSTOMER_PATH,customer.toFile());
        System.out.println("Add new customer successfull");
    }

    @Override
    public void edit() {
//        display();
//        String newIdCustomer;
//        customerList = getCustomerList();
//        System.out.println("Enter id customer you want edit");
//        boolean check  = true;
//        while (check){
//            newIdCustomer = scanner.nextLine();
//            for (Customer customers: customerList){
//                if (customers.getId().equals(newIdCustomer)){
//                    System.out.println("");
//                    check = false;
//                    break;
//                }
//            }
//            if (check){
//                System.err.println("id customer not on the data.please re-enter");
//            }
//        }
//


    }

    public static List<Customer> getCustomerList(){
        List<Customer> customers = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read(CUSTOMER_PATH);
        for (String[] lists : list){
            customers.add(new Customer(lists[0],
                                    lists[1],
                                    lists[2],
                                    lists[3]));
        }
        return customers;
    }



}
