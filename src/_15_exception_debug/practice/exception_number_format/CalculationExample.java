package _15_exception_debug.practice.exception_number_format;

import java.util.Scanner;

public class CalculationExample {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập y: ");
        int y = Integer.parseInt(sc.nextLine());
        CalculationExample cal = new CalculationExample();
        cal.calculate(x,y);
    }

    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e){
            System.out.println("Ngoại lệ "+ e.getMessage());
        }
    }
}
