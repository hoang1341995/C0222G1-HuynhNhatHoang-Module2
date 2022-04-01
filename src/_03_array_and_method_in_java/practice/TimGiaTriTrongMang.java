package _03_array_and_method_in_java.practice;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String nameStudent = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)){
                System.out.println("sinh viên "+students[i]+" có trong danh sách");
            check = true;
            }
        }
        if (!check){
            System.out.println(nameStudent+" không có trong danh sách");
        }
    }
}
