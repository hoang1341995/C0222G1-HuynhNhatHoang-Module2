package _03_array_and_method_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size = 0;
        int arr1[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter length array maximum 10");
            size = sc.nextInt();
            if (size>10){
                System.out.println("Again");
            }
        }while (size>10);
        arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter value element "+ (i+1)+": ");
            arr1[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr1));
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i]>max){
                max = arr1[i];
            }
        }
        System.out.println("\n "+max);





    }
}
