package _16_text_file.practice.find_max_in_file_text;

import java.util.List;

import static _16_text_file.practice.find_max_in_file_text.ReadAndWriteFile.findMax;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/_16_text_file/practice/find_max_in_file_text/numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/_16_text_file/practice/find_max_in_file_text/result.txt", maxValue);
    }
}
