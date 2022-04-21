package _16_text_file.exercise.copy_file_text;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập file nguồn: ");
        String source = HandlingFile.checkPathFile();
        System.out.println("Nhập file đích: ");
        String target = HandlingFile.checkPathFile();
        HandlingFile.readFile(source, target);
        //HandlingFile.readFile("src/_16_text_file/exercise/copy_file_text/source.txt","src/_16_text_file/exercise/copy_file_text/target.txt");


    }
}

