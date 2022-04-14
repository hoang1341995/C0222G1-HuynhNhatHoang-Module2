package _11_dsa.exercise.invert_element;

import java.util.Scanner;
import java.util.Stack;

public class InvertElementString {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(" Enter string: ");
        String string = sc.nextLine();
        System.out.println("Befor: " + string);

        Stack<String> wStack = new Stack<>();
        String[] strArray = string.split("");
        for (String elements : strArray) {
            wStack.push(elements);
        }
        String afterString = "After: ";
        for (int j = 0; j < strArray.length; j++) {
            afterString += wStack.pop();
        }
        System.out.println(afterString);

    }
}
