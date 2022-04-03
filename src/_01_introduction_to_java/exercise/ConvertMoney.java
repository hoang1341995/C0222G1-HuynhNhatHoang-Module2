package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập USD");
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd*23000;
        System.out.printf("%d VND",vnd);
    }
}
