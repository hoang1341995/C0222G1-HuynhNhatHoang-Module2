package _15_exception_debug.exercise.triangle_exception;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IllegalTriangleException {

        System.out.print("Nhập cạnh 1: ");
        int side1 = tryCatch(sc.nextLine(), 1);
        System.out.print("Nhập cạnh 2: ");
        int side2 = tryCatch(sc.nextLine(), 2);
        System.out.print("Nhập cạnh 3: ");
        int side3 = tryCatch(sc.nextLine(), 3);
        CheckTriangleSide(side1, side2, side3);

    }

    public static int tryCatch(String input, int num) {
        String str = input;
        while (true) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("[Exception] Vui lòng nhập số !");
                System.out.print("Nhập cạnh " + num + ": ");
                str = sc.nextLine();
            }
        }
    }

    public static void CheckTriangleSide(int side1, int side2, int side3) throws IllegalTriangleException {
        if ((side1 + side2) < side3 || (side1 + side3) < side2 || (side2 + side3) < side1) {
            try {

                throw new IllegalTriangleException("[Exception] Tổng 2 cạnh nhỏ hơn cạnh còn lại");
            }catch (IllegalTriangleException e){
                System.out.println("[Exception] Tổng 2 cạnh nhỏ hơn cạnh còn lại");
            }
        } else {
            System.out.println("Là tam giác");
        }
    }
}
