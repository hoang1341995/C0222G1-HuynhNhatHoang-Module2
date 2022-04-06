package exercise_plus;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int size = 50;
    static Student[] student = new Student[size];
    public static void main(String[] args) {
        boolean check = true;
        student[0] = new Student("Hoang", 25, "Đà Nẵng", 10);
        student[1] = new Student("Hoa", 250, "Đà Nẵng", 9);
        student[2] = new Student("Hao", 90, "Đà Nẵng", 8);
        System.out.println("1. Show list student\n2. add student\n3. remove student\n0. exit");

        while (check) {
            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    showListStudent();
                    menu();
                    break;
                case 2:
                    addStudent();
                    menu();
                    break;
                case 3:
                    removeStudent();
                    menu();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter again");
            }
        }
    }
    public static void menu(){
        System.out.println("\n1. Show list student\n2. add student\n3. remove student\n0. exit");
    }
    public static void showListStudent(){
        for (int i = 0; i < size; i++) {
            if (student[i] != null) {
                System.out.println("ID:"+(i+1)+" "+student[i]);
            }
        }
    }
    public static void addStudent(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter point: ");
        int point = Integer.parseInt(sc.nextLine());
        int num = 0;
        for (int i = 0; i < size; i++) {
            if (student[i] == null) {
                num = i;
                break;
            }
        }
        student[num] = new Student(name, age, address, point);
        System.out.println("add student successful");
    }
    public static void removeStudent(){
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(sc.nextLine());
        id--;
        for (int i = id; i < size; i++) {
            if (student[i] != null){
                student[i] = student[(i+1)];
            }
        }
        System.out.println("remove student successful");
    }

}
