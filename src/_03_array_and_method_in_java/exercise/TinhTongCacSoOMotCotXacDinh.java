package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] array = returnArray2d();
        System.out.println("Nhập cột cần tính tổng");
        int column = sc.nextInt();
        System.out.println("Tổng cột "+column+" là: "+totalColumnInArray2d(column,array));
    }
    public static int totalColumnInArray2d(int Column,int[][] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == Column){
                    total += arr[i][j];
                }
            }
        }
        return total;
    }
    public static int[][] returnArray2d(){
        int x = 0, y = 0;
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

        return array;
    }
}
