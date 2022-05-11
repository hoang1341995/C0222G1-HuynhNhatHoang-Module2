package exam_module2.utils;


import exam_module2.models.Bank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWrite {

    public static final String BANK_ACCOUNTS_PATH = "src/exam_module2/data/bank_accounts.csv";

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

    public static void reWriteList(String codeAccountRemove,List<Bank> newList, String path){
        try {
            File file = new File(path);
            file.delete();
            String line = "";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Bank elements : newList){
                if (!elements.getCodeAccount().equals(codeAccountRemove)){
                    line += elements.toFile()+"\n";
                }
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
