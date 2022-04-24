package case_study_module2.services.Impl;

import case_study_module2.models.person.Employee;
import case_study_module2.services.EmployeeService;
import case_study_module2.utils.ReadAndWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static case_study_module2.utils.ReadAndWrite.EMPLOYEE_FILE;


public class EmployeeServiceImpl implements EmployeeService {
     List<Employee> employeeList = ReadAndWrite.readFileEmployee();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        Employee employee = new Employee();
        while (true) {
            try {
                System.out.print("Enter ID employee: ");
                employee.setId(Integer.parseInt(scanner.nextLine()));
                break;
            } catch (Exception e) {
                System.err.println("Wrong data type");
            }
        }

        System.out.print("Enter name employee: ");
        employee.setName(scanner.nextLine());

        System.out.print("Enter age employee: ");
        employee.setAge(scanner.nextLine());

        System.out.print("Enter gender employee ");
        employee.setGender(scanner.nextLine());

        System.out.print("Enter id card number employee: ");
        employee.setIdCard(scanner.nextLine());

        System.out.print("Enter phone number employee: ");
        employee.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter email employee: ");
        employee.setEmail(scanner.nextLine());

        System.out.print("Enter level employee: ");
        employee.setLevel(scanner.nextLine());

        System.out.print("Enter position employee: ");
        employee.setPosition(scanner.nextLine());

        while (true) {
            try {
                System.out.print("Enter salary employee: ");
                employee.setSalary(Integer.parseInt(scanner.nextLine()));
                break;
            } catch (Exception e) {
                System.err.println("Wrong data type");
            }
        }

        ReadAndWrite.writeFileEmployee(employee);
        System.out.println("Add new employee successful");

    }

    @Override
    public void edit() {
        display();
        int idEdit = 0;
        while (true) {
            try {
                System.out.print("Enter id of Employee you want edit: ");
                idEdit = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Wrong, id must be number, please re-enter.");
            }
        }
        boolean check = true;
        for (Employee employees : employeeList) {
            if (idEdit == employees.getId()) {
                check = false;
                int choose = 0;
                System.out.println("Editing options\n" +
                        "1. Name\n" +
                        "2. Age\n" +
                        "3. Gender\n" +
                        "4. ID Card\n" +
                        "5. Phone number\n" +
                        "6. Email\n" +
                        "7. Level\n" +
                        "8. Position\n" +
                        "9. Salary\n" +
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
                        System.out.print("Enter new name of Employee: ");
                        employees.setName(scanner.nextLine());
                        System.out.println("Edit name of employee successful");
                        break;
                    case 2:
                        System.out.print("Enter new age of Employee: ");
                        employees.setAge(scanner.nextLine());
                        System.out.println("Edit age of employee successful");
                        break;
                    case 3:
                        System.out.print("Enter new gender of Employee: ");
                        employees.setGender(scanner.nextLine());
                        System.out.println("Edit gender of employee successful");
                        break;
                    case 4:
                        System.out.print("Enter new IDcard of Employee: ");
                        employees.setIdCard(scanner.nextLine());
                        System.out.println("Edit IDcard of employee successful");
                        break;
                    case 5:
                        System.out.print("Enter new phone number of Employee: ");
                        employees.setPhoneNumber(scanner.nextLine());
                        System.out.println("Edit phone number of employee successful");
                        break;
                    case 6:
                        System.out.print("Enter new email of Employee: ");
                        employees.setEmail(scanner.nextLine());
                        System.out.println("Edit email of employee successful");
                        break;
                    case 7:
                        System.out.print("Enter new level of Employee: ");
                        employees.setLevel(scanner.nextLine());
                        System.out.println("Edit level of employee successful");
                        break;
                    case 8:
                        System.out.print("Enter new position of Employee: ");
                        employees.setPosition(scanner.nextLine());
                        System.out.println("Edit position of employee successful");
                        break;
                    case 9:
                        while (true){
                            try {
                                System.out.print("Enter new salary of Employee: ");
                                employees.setSalary(Integer.parseInt(scanner.nextLine()));
                                System.out.println("Edit salary of employee successful");
                                break;
                            }catch (NumberFormatException e){
                                System.err.println("Wrong, please re-enter.");
                            }
                        }
                        break;
                }
                reWriteListEmployee();
                break;
            }
        }
        if (check) {
            System.err.println("id does not exist");
        }

    }

    public  void reWriteListEmployee(){
        try {
            File file = new File(EMPLOYEE_FILE);
            file.delete();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Employee employees : employeeList){
                bufferedWriter.write(employees.toFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void display() {
        System.out.println("<<Employee List>>");
        for (Employee employees : employeeList) {
            System.out.println(employees.toString());
        }

    }

}
