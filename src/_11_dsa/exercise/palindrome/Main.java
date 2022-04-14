package _11_dsa.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String result ="";
        System.out.print("Enter String: ");
        String[] arrayStr = sc.nextLine().toLowerCase().split("");
        for (int i = 0; i < arrayStr.length; i++) {
                stack.add(arrayStr[i]);
                queue.add(arrayStr[i]);
        }
        while (!stack.isEmpty()){
            if (stack.pop().equals(queue.poll())){
                result = "Palindrome";
            }else{
                result = "Not a Palindrome";
                break;
            }
        }
        System.out.println(result);

    }
}

