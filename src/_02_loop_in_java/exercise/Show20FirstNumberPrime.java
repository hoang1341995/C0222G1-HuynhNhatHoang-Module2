package _02_loop_in_java.exercise;

import java.util.Scanner;

public class Show20FirstNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra:");
        int numbers = scanner.nextInt();
        int count = 0;
        int num = 2;
        while (count < numbers) {
            int a = 0;
            for (int i = 2; num > i; i++) {
                if (num % i == 0) {
                    a++;
                }
            }
            if (a == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
