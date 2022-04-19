package _14_sort_algorithm.exercise.insertion_sort_algorithm_setting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập độ dài của mảng");
        int length = Integer.parseInt(sc.nextLine());
        int[] arrray = new int[length];
        for (int i = 0; i < arrray.length; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            arrray[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng chưa sắp xếp: "+Arrays.toString(arrray));
        System.out.println("  Mảng đã sắp xếp: "+Arrays.toString(insertionSort(arrray)));
    }

    public static int[] insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
        return array;
    }
}
