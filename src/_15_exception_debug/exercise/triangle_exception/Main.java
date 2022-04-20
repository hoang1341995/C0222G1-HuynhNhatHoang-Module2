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
                if (Integer.parseInt(str) <= 0) {
                    throw new IllegalTriangleException("[Exception] cạnh phải lớn hơn 0 !");
                } else {
                    return Integer.parseInt(str);
                }
            } catch (NumberFormatException e) {
                System.out.println("[Exception] cạnh phải là số !");
                System.out.print("Nhập cạnh " + num + ": ");
                str = sc.nextLine();
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.print("Nhập cạnh " + num + ": ");
                str = sc.nextLine();
            }
        }
    }

    public static void CheckTriangleSide(int side1, int side2, int side3) {
        if ((side1 + side2) < side3 || (side1 + side3) < side2 || (side2 + side3) < side1) {
            try {
                throw new IllegalTriangleException("[Exception] không phải là tam giác");
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println("Là tam giác");
        }
    }
}
