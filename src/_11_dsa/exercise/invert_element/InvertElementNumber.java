package _11_dsa.exercise.invert_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InvertElementNumber {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter size array:");
        int[] array = new int[Integer.parseInt(sc.nextLine())];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = Integer.parseInt(sc.nextLine());
            stack.push(array[i]);
        }
        System.out.println("Stack: "+stack);
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Array: "+Arrays.toString(array));

    }
}
