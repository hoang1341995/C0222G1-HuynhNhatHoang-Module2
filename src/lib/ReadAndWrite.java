package lib;

import case_study_module2.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static case_study_module2.utils.ReadAndWrite.EMPLOYEE_FILE;

public class ReadAndWrite {
    public static List<String[]> readFile(String path){
        List<String[]> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)))) {
            String line = "";
            String[] arrayList;
            while ((line = bufferedReader.readLine()) != null){
                arrayList = line.split(",");
                list.add(arrayList);
            }
            return list;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showListToFile(){
            List<Employee> employeeList = new ArrayList<>();
            List<String[]> list = readFile(EMPLOYEE_FILE);
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
        for (Employee employees : employeeList) {
            System.out.println(employees.toString());
        }
    }

    public static void writeFile(String path, String toFile) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new BufferedWriter(new FileWriter(new File(path))))) {
            bufferedWriter.write(toFile);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("[Write file] File not found");
        }
    }


    //////////////////binary file




}
