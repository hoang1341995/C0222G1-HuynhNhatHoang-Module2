package de_kin.utils;

import case_study_module2.models.person.Employee;
import de_kin.models.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static case_study_module2.utils.ReadAndWrite.CUSTOMER_FILE;
import static case_study_module2.utils.ReadAndWrite.EMPLOYEE_FILE;

public class ReadAndWrite {
    public static final String FACILITY_PATH = "src/de_kin/data/facility.csv";
    public static final String CUSTOMER_PATH = "src/de_kin/data/customer.csv";
    public static final String BOOKING_PATH = "src/de_kin/data/booking.csv";

    public static void write( String path, String line) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> read(String path) {
        List<String[]> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arr = line.split(",");
                list.add(arr);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public  void reWriteListCustomer(List<Customer> customerList){
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

    /**
      public static String returnSubjectCode(){
              String code;
              while (true){
                  code = scanner.nextLine();
                  if (Pattern.matches(REGEX_CODE,code)){
                      return code;
                  }else{
                      System.err.println("Wrong format subject code, please re-enter");
                  }
              }
          }
     */

}
