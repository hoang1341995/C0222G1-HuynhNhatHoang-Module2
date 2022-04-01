package _02_loop_in_java.practice;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi");
        money = input.nextDouble();
        System.out.println("Nhập tháng muốn gửi");
        month = input.nextInt();
        System.out.println("Nhập lãi suất muốn gửi");
        interestRate = input.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng lãi trong "+month+" tháng là "+total);
    }
}
