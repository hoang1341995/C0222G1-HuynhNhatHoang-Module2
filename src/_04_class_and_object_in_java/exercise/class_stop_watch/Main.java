package _04_class_and_object_in_java.exercise.class_stop_watch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Watch watch = new Watch();
        int size = 10000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        long start = watch.Start();
        System.out.println("Start time: " + start );
        selectionSort(arr,size);
        long stop = watch.Stop();
        System.out.println("End time: " + stop);
        System.out.println("End - Start = "+ (stop - start));
    }

    public static void selectionSort(int[] array,int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
