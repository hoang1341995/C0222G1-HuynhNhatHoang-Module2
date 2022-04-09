package exercise_plus.teacher_student;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Person[] arr = new Person[50];

    public static void main(String[] args) {
        Person student = new Student("hoang", 27, true, 100);
        arr[0] = student;
        Person teacher = new Teacher("hoang111", 207, true, 1000);
        arr[1] = teacher;
        Person teacher1 = new Teacher("lua", 207, true, 1000);
        arr[2] = teacher1;
        boolean check = true;
        while (check) {
            System.out.println("1. Show list");
            System.out.println("2. Add new");
            System.out.println("3. Delete");
            System.out.println("0. Exit");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    showList();
                    break;
                case 2:
                    addNew();
                    break;
                case 3:
                    delete();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static void showList() {
        boolean check = true;
        while (check) {
            System.out.println("1. Show teacher");
            System.out.println("2. Show student");
            System.out.println("0. Return main menu");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    chooseShow(true);
                    break;
                case 2:
                    chooseShow(false);
                    break;
                case 0:
                    check =false;
                    break;
                default:
                    System.out.println("error");
            }
        }


    }

    public static void chooseShow(boolean choose) {
        // choose true = teacher, false = student
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (choose) {
                    if (arr[i] instanceof Teacher) {
                        System.out.println(arr[i]);
                    }
                } else {
                    if (arr[i] instanceof Student) {
                        System.out.println(arr[i]);
                    }
                }

            } else {
                break;
            }
        }
    }

    public static void addNew() {
        String choose = "teacher";
        boolean gender = false;
        System.out.println("1. Add new teacher");
        System.out.println("2. Add new student");
        if (Integer.parseInt(sc.nextLine()) == 2) {
            choose = "student";
        }
        System.out.print("Enter " + choose + " name: ");
        String name = sc.nextLine();
        System.out.print("Enter " + choose + " age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter " + choose + " gender, 1. male - 2. female: ");
        if (Integer.parseInt(sc.nextLine()) == 1) {
            gender = true;
        }
        if (choose.equals("teacher")) {
            System.out.print("Enter" + choose + " salary: ");
            int salary = Integer.parseInt(sc.nextLine());
            Person teacher = new Teacher(name, age, gender, salary);
            arr[findI()] = teacher;
        } else {
            System.out.print("Enter" + choose + " point: ");
            int point = Integer.parseInt(sc.nextLine());
            Person student = new Student(name, age, gender, point);
            arr[findI()] = student;
        }
        System.out.println("Add new successful");
    }

    public static int findI() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
        return 0;
    }

    public static void delete() {
        boolean check = true;
        while (check) {
            System.out.println("1. Delete teacher");
            System.out.println("2. Delete student");
            System.out.println("0. Return main menu");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    chooseDelete(true);
                    break;
                case 2:
                    chooseDelete(false);
                    break;
                case 0:
                    check =false;
                    break;
                default:
                    System.out.println("error");
            }
        }
    }

    public static void sortArray(int id){
        for (int i = id; i < arr.length; i++) {
            if (arr[i] != null){
                arr[i] = arr[(i+1)];
            }
        }
        System.out.println("delete successful");
    }
    public static void chooseDelete(boolean choose){
        // choose true = teacher, false = student
        String option = "student";
        if (choose){
            option = "teacher";
        }
        System.out.print("Enter name "+option+": ");
        String name = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (choose) {
                    if (arr[i] instanceof Teacher) {
                        if (arr[i].getName().equals(name)){
                            sortArray(i);
                            break;
                        }
                    }
                } else {
                    if (arr[i] instanceof Student) {
                        if (arr[i].getName().equals(name)){
                            sortArray(i);
                            break;
                        }
                    }
                }

            } else {
                break;
            }
        }

    }

}
