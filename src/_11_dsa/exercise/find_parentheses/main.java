package _11_dsa.exercise.find_parentheses;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        boolean check = true;
        System.out.print("Enter String: ");
        String[] arrayStr = sc.nextLine().split("");
        for (int i = 0; i < arrayStr.length; i++) {
            if (!checkSym(arrayStr[i])) {
                check = false;
                break;
            }
        }
        if (stack.isEmpty()&& check){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

    public static boolean checkSym(String element) {
        if (element.equals("(")) {
            stack.push(element);
            return true;
        } else if (element.equals(")")) {
            if (stack.isEmpty()) {
                return false;
            } else {
                stack.pop();
                return true;
            }
        }else{
            return true;
        }
    }

}
