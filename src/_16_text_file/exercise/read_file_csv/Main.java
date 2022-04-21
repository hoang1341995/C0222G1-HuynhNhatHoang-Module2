package _16_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Country> countryMap = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn: ");
        readFile(checkPathFile());
    }

    public static void readFile(String path) throws IOException {

        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] arrStr = line.split(",");
            makeData(Integer.parseInt(arrStr[0]), arrStr[1], arrStr[2]);
        }
        for (Country countrys : countryMap){
            System.out.println(countrys.toString());
        }
    }

    public static void makeData(int id, String code, String name) {

        Country country = new Country(id, code, name);
        countryMap.add(country);
    }

    public static String checkPathFile() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String path = sc.nextLine();
                File file = new File(path);
                if (!file.exists()) {
                    throw new ExceptionCustom("File không tìm thấy");
                } else {
                    return path;
                }
            } catch (ExceptionCustom e) {
                System.err.println(e.getMessage());

            }
        }
    }
}
