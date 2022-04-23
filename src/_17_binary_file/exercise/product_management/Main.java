package _17_binary_file.exercise.product_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display product list");
            System.out.println("2. Add product");
            System.out.println("3. Search product");
            System.out.println("0. Exit");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    ProductManager.showList();
                    break;
                case 2:
                    ProductManager.add();
                    break;
                case 3:
                    System.out.print("Enter product information: ");
                    ProductManager.searchProduct(sc.nextLine());
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }
}
