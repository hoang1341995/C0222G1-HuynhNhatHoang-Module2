package _03_array_and_method_in_java.practice;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1. Fahrenheit to Celsius \n2. Celsius to Fahrenheit\n0. Exit");
            int input = sc.nextInt();
            double celsius,fahrenheit;
            switch (input){
                case 1:
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = sc.nextInt();
                    celsius = (fahrenheit - 32)/1.8;
                    System.out.println(fahrenheit+" F = "+celsius+" C");
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    celsius = sc.nextInt();
                    fahrenheit = (celsius*1.8)+32;
                    System.out.println(celsius+" C = "+ fahrenheit+" F");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter Again");
            }
        }
    }
}
