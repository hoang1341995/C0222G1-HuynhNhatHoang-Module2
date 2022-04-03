package _03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,size = 0;

        do{
            System.out.println("Nhập độ dài mảng");
            size = sc.nextInt();
            if (size>10){
                System.out.println("Nhập lại");
            }
        }while(size>10);
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("Nhập phần tử "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Phần tử nhỏ nhất là: "+formatArray(array));
    }
    public static int formatArray(int[] arr){
       int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
