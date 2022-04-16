package _12_java_collection_framework.exercise.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static Scanner sc = new Scanner(System.in);
    public static List<Product> list = new ArrayList<>();

    public static void main(String[] args) {
        Product product1 = new Product("Sting", 1, 10000);
        Product product2 = new Product("7Up", 2, 9000);
        Product product3 = new Product("Redbull", 3, 15000);
        Product product4 = new Product("Cocacola", 4, 12000);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        while (true) {
            System.out.println("\nMENU CHÍNH");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm theo id");
            System.out.println("4. Xóa sản phẩm theo id");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng, giảm dần theo giá");
            System.out.println("0. Thoát");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    ProductService.displayProductList();
                    break;
                case 2:
                    ProductService.addProduct();
                    break;
                case 3:
                    ProductService.editProductById();
                    break;
                case 4:
                    ProductService.removeProductById();
                    break;
                case 5:
                    ProductService.searchProductByName();
                    break;
                case 6:
                    ProductService.sortProduct();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }
}
