package _13_search_algorithm.exercise.search_longest_string;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > list.getLast()) {
                list.add(string.charAt(i));
            }
        }
        System.out.println(list);
    }
}