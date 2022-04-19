package _14_sort_algorithm.exercise.insertion_sort_algorithm;

import java.util.Arrays;

public class Main {
static int[] array = {9,7,30,1,9,6,5,3,12,43,4,8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        insertionSort(array);
    }

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.println(array[pos]+ " đổi cho " + array[pos-1]);
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
    }

}
