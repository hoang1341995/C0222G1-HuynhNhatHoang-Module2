package _11_dsa.exercise.tree_map;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        String string = sc.nextLine().toLowerCase();
        String[] newString = string.split(" "); /// huynh kim hieu
        int count = 1;
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < newString.length; i++) {
            if (treeMap.containsKey(newString[i])) {
                treeMap.put(newString[i], treeMap.get(newString[i]) + 1);
            } else {
                treeMap.put(newString[i], 1);
            }
        }
        System.out.println(treeMap);

    }
}
