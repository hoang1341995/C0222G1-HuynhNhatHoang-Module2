package case_study_module2.utils;

import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ReadAndWrite {
    public static final String EMPLOYEE_FILE = "src/case_study_module2/data/employee.csv";
    public static final String CUSTOMER_FILE = "src/case_study_module2/data/customer.csv";
    public static final String VILLA_FILE = "src/case_study_module2/data/villa.csv";
    public static final String ROOM_FILE = "src/case_study_module2/data/room.csv";
    public static final String HOUSE_FILE = "src/case_study_module2/data/house.csv";

    public static ArrayList<Employee> readFileEmployee() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        try {
            File file = new File(EMPLOYEE_FILE);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] employee;
            while ((line = bufferedReader.readLine()) != null) {
                employee = line.split(",");
                employeeArrayList.add(new Employee(
                        Integer.parseInt(employee[0]),
                        employee[1],
                        employee[2],
                        employee[3],
                        employee[4],
                        employee[5],
                        employee[6],
                        employee[7],
                        employee[8],
                        Integer.parseInt(employee[9])));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("[Read file employee] File not found");
        }
        return employeeArrayList;
    }

    public static void writeFileEmployee(Employee employee) {
        try {
            FileWriter fileWriter = new FileWriter(EMPLOYEE_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(employee.toFile());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("[Write file employee] File not found");
        }
    }

    public static LinkedList<Customer> readFileCustomer() {
        LinkedList<Customer> customerLinkedList = new LinkedList<>();
        try {
            File file = new File(CUSTOMER_FILE);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] customer;
            while ((line = bufferedReader.readLine()) != null) {
                customer = line.split(",");
                customerLinkedList.add(new Customer(
                        Integer.parseInt(customer[0]),
                        customer[1],
                        customer[2],
                        customer[3],
                        customer[4],
                        customer[5],
                        customer[6],
                        customer[7],
                        customer[8]));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("[Read file customer] File not found");
        }
        return customerLinkedList;
    }

    public static void writeFileCustomer(Customer customer) {
        try {
            FileWriter fileWriter = new FileWriter(CUSTOMER_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.toFile());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("[Write file customer] File not found");
        }
    }

    public static LinkedHashMap<Facility, Integer> readFileFacility(String path) {
        LinkedHashMap<Facility, Integer> list = new LinkedHashMap<>();
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] facility;
            while ((line = bufferedReader.readLine()) != null){
                facility = line.split(",");
                if (path.equals(VILLA_FILE)){
                    Villa newVilla = new Villa(facility[0],facility[1],Double.parseDouble(facility[2]),Double.parseDouble(facility[3]),
                            Integer.parseInt(facility[4]),facility[5],facility[6],
                            Double.parseDouble(facility[7]), Integer.parseInt(facility[8]));
                    list.put(newVilla,0);
                } else if (path.equals(HOUSE_FILE)) {
                    House newHouse = new House(facility[0],facility[1],Double.parseDouble(facility[2]),Double.parseDouble(facility[3]),
                            Integer.parseInt(facility[4]),facility[5],facility[6],Integer.parseInt(facility[7]) );
                }else{
                    Room newRoom = new Room(facility[0],facility[1],Double.parseDouble(facility[2]),Double.parseDouble(facility[3]),
                            Integer.parseInt(facility[4]),facility[5],facility[6]);
                }
            }
            bufferedReader.close();

        }catch (IOException e) {
            System.err.println("File not found");
        }
        return list;
    }

}












