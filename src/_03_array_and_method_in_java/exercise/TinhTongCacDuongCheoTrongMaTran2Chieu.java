package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacDuongCheoTrongMaTran2Chieu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int xy = 0;
        do {
            System.out.print("Nhâp độ dài xy: ");
            xy = sc.nextInt();
            if (xy >10) {
                System.out.println("Quá dài, nhập lại");
            }
        } while (xy > 10);
        System.out.println("Tổng đường chéo là: "+returnSumNumberDiagonal(xy));
    }
    public static int returnSumNumberDiagonal(int size){
        int total = 0;
        int array[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử " + i + " " + j + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < size; i++) {
            total += array[i][i];
        }
        return total;
    }
}
