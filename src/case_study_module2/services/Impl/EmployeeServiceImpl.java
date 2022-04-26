package case_study_module2.services.Impl;

import case_study_module2.models.person.Employee;
import case_study_module2.services.EmployeeService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.regex.RegexInput;
import case_study_module2.utils.regex.RegexInputEmployee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static case_study_module2.utils.ReadAndWrite.EMPLOYEE_FILE;

public class EmployeeServiceImpl implements EmployeeService {
     List<Employee> employeeList = getListEmployee();
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

        System.out.print("Enter date of birth employee: ");
        employee.setBirthDay(RegexInput.returnBirthDay());

        System.out.println("Enter gender employee:\n" +
                "1. Male\n" +
                "2. Female");
        employee.setGender(RegexInput.returnGender());

        System.out.print("Enter id card number employee: ");
        employee.setIdCard(scanner.nextLine());

        System.out.print("Enter phone number employee: ");
        employee.setPhoneNumber(RegexInput.returnPhoneNumber());

        System.out.print("Enter email employee: ");
        employee.setEmail(RegexInput.returnEmail());

        System.out.println("Enter level employee: \n" +
                "1. Intermediate\n" +
                "2. College\n" +
                "3. Undergraduate\n" +
                "4. Graduate");
        employee.setLevel(RegexInputEmployee.returnLevelEmployee());

        System.out.println("Enter position employee:\n" +
                "1. Receptionist\n" +
                "2. Server\n" +
                "3. Specialist\n" +
                "4. Supervisor\n" +
                "5. Manager\n" +
                "6. Director");
        employee.setPosition(RegexInputEmployee.returnPositonEmployee());

        while (true) {
            try {
                System.out.print("Enter salary employee: ");
                employee.setSalary(Integer.parseInt(scanner.nextLine()));
                break;
            } catch (Exception e) {
                System.err.println("Wrong data type");
            }
        }

        ReadAndWrite.writeFile(EMPLOYEE_FILE,employee.toFile());
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
                        System.out.print("Enter new date of birth Employee: ");
                        employees.setBirthDay(RegexInput.returnBirthDay());
                        System.out.println("Edit date of birth employee successful");
                        break;
                    case 3:
                        System.out.println("Enter gender employee:\n" +
                                "1. Male\n" +
                                "2. Female");
                        employees.setGender(RegexInput.returnGender());
                        System.out.println("Edit gender of employee successful");
                        break;
                    case 4:
                        System.out.print("Enter new IDcard of Employee: ");
                        employees.setIdCard(scanner.nextLine());
                        System.out.println("Edit IDcard of employee successful");
                        break;
                    case 5:
                        System.out.print("Enter new phone number of Employee: ");
                        employees.setPhoneNumber(RegexInput.returnPhoneNumber());
                        System.out.println("Edit phone number of employee successful");
                        break;
                    case 6:
                        System.out.print("Enter new email of Employee: ");
                        employees.setEmail(RegexInput.returnEmail());
                        System.out.println("Edit email of employee successful");
                        break;
                    case 7:
                        System.out.print("Enter new level of Employee: ");
                        employees.setLevel(RegexInputEmployee.returnLevelEmployee());
                        System.out.println("Edit level of employee successful");
                        break;
                    case 8:
                        System.out.print("Enter new position of Employee: ");
                        employees.setPosition(RegexInputEmployee.returnPositonEmployee());
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
        List<Employee> list = getListEmployee();
        System.out.println("<<Employee List>>");
        for (Employee employees : list) {
            System.out.println(employees.toString());
        }

    }
    public  List<Employee> getListEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile(EMPLOYEE_FILE);
        System.out.println("<<Employee List>>");
        for (String[] lists : list) {
            employeeList.add(new Employee(
                    Integer.parseInt(lists[0]),
                    lists[1],
                    lists[2],
                    lists[3],
                    lists[4],
                    lists[5],
                    lists[6],
                    lists[7],
                    lists[8],
                    Integer.parseInt(lists[9])));
        }
        return employeeList;
    }


}
