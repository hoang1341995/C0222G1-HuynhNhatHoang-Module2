package backup_exam_module2.exam_module2.utils;


import exam_module2.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWrite {
    public static final String CUSTOMER_PATH = "src/exam_module2/data/customer.csv";
    public static void write(String path, String line) {
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

    public static void reWriteList(List<Customer> newList, String path){
        try {
            File file = new File(path);
            file.delete();
            String line = "";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Customer elements : newList){
                line += elements.toFile()+"\n";
            }
            bufferedWriter.write(line);
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
