package _11_dsa.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter Decimal: ");
        int decimal = Integer.parseInt(sc.nextLine());
        while (decimal > 0){
            stack.push(decimal%2);
            decimal = decimal/2;
        }
        //System.out.println(stack);
        String binary = "";
        while (!stack.isEmpty()){
            binary += stack.pop();
        }
        System.out.println(binary);

    }
}
