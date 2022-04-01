package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int array[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số cần chèn");
        int elementX = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = sc.nextInt();
        if (index < 0 && index >= array.length) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            System.out.println(Arrays.toString(formatArray(elementX, index, array)));
        }


    }

    public static int[] formatArray(int x, int i, int[] arr) {
        int temp = arr[i];
        int temp2 = 0;
        arr[i] = x;
        for (i++; i < arr.length; i++) {
            temp2 = arr[i];
            arr[i] = temp;
            temp = temp2;
        }
        return arr;
    }
}
