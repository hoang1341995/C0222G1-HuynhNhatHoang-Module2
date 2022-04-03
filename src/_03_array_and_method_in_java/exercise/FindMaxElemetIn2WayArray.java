package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElemetIn2WayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, xx = 0, yy = 0;
        float max;
        do {
            System.out.println("Nhâp độ dài x");
            x = sc.nextInt();
            System.out.println("Nhập độ dài y");
            y = sc.nextInt();
            if (x > 5 && y > 5) {
                System.out.println("Quá dài, nhập lại");
            }
        } while (x > 5 && y > 5);
        int array[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Nhập phần tử " + i + " " + j + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    xx = x;
                    yy = y;
                }
            }
        }
        System.out.println("Số lớn nhất: "+max);
        System.out.println("tại vị trí: x="+xx+", y="+yy);
    }
}
