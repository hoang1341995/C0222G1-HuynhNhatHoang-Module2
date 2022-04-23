package _17_binary_file.exercise.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final String PATH = "src/_17_binary_file/exercise/product_management/ProducFile";
    static Scanner sc = new Scanner(System.in);
    static List<Product> products = readToFlie(PATH);


    public static void add() {
        System.out.println("Enter product id: ");
        String id = sc.nextLine();
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter product price: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product description: ");
        String description = sc.nextLine();
        Product product = new Product(id, name, brand, price, description);
        products.add(product);
        writeToFile(PATH, products);
        System.out.println("Add new successful");
    }

    public static void showList() {
        System.out.println("Product list:");
        List<Product> productDataFromFile = readToFlie(PATH);
        for (Product products : productDataFromFile) {
            System.out.println(products);
        }
    }

    public static List<Product> readToFlie(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (EOFException e) {
            System.out.println("Empty file");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchProduct(String info) {
        List<Product> productList = readToFlie(PATH);
        System.out.println("Search product " + info);
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            if (info.equals(productList.get(i).getId()) || info.equals(productList.get(i).getName())
                    || info.equals(productList.get(i).getBrand())) {
                System.out.println(productList.get(i));
                check = false;
            }
        }
        if (true) {
            System.out.println(" No matching products found ");
        }
    }

}
