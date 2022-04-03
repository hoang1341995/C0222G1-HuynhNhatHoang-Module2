package _03_array_and_method_in_java.exercise;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9,88};
        int arr2[] = {2,4,6,8,10,99};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(formatArray(arr1,arr2)));

    }
    public static int[] formatArray(int[] array1,int[] array2){
        int array3[] = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        int count = array1.length;
        for (int i = 0; count < array3.length; count++,i++) {
            array3[count] = array2[i];
        }
        return array3;
    }

}
