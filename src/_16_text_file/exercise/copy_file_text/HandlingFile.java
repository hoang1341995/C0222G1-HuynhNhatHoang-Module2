package _16_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class HandlingFile {

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

    public static void readFile(String source, String target) throws IOException {
        File sourceFile = new File(source);
        int sum = 0;
        String data = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
        while ((data = bufferedReader.readLine()) != null) {
            sum += writeFile(data, target);
        }
        System.out.println("Tổng kí tự sao chép là: " + sum);


    }


    public static int writeFile(String data, String target) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter writer = new FileWriter(target, true);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();
            bufferedWriter.write(data);
            return data.length();
        } catch (IOException e) {
            System.err.println("[exception] writeFile ");
        } finally {
            bufferedWriter.close();
        }
        return -1;
    }
}
