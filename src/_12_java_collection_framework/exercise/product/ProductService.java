package _12_java_collection_framework.exercise.product;
import java.util.Collections;
import java.util.Comparator;

import static _12_java_collection_framework.exercise.product.ProductManagement.list;
import static _12_java_collection_framework.exercise.product.ProductManagement.sc;

public class ProductService {
    public static void displayProductList(){
        for (Product pd: list){
            System.out.println(pd);
        }
    }
    public static void addProduct(){
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
        //check sản phẩm có tồn tại
        boolean check =true;
        for (Product pd: list){
            if (pd.getId() == id){
                check = false;
                break;
            }
            if (pd.getName().equals(name)){
                check = false;
                break;
            }
        }
        if (check){
            Product product = new Product(name,id,price);
            list.add(product);
            System.out.println("Thêm mới sản phẩm thành công!");
        }else{
            System.out.println("Sản phẩm đã tồn tại.");
        }
    }
    public static void editProductById(){
        System.out.print("Nhập id sản phẩm cần chỉnh sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean checkEditById = true;
        for (Product products : list){
            if (products.getId() == id){
                System.out.println("Nhập lại tên sản phẩm");
                String name = sc.nextLine();
                System.out.println("Nhập lại giá sản phẩm");
                int price = Integer.parseInt(sc.nextLine());
                Product product = new Product(name,id,price);
                list.remove(products);
                list.add(products.getId(),product);
                checkEditById = false;
                System.out.println("Sửa sản phẩm thành công");
                break;
            }
        }
        if (checkEditById){
            System.out.println("Id sản phẩm không tồn tại");
        }
    }
    public static void removeProductById(){
        System.out.print("Nhập id sản phẩm cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean checkRemoveById = true;
        for (Product products: list){
            if (products.getId() == id){
                list.remove(products);
                checkRemoveById = false;
                System.out.println("Xóa thành công");
                break;
            }
        }
        if (checkRemoveById){
            System.out.println("Id sản phẩm không tồn tại");
        }

    }
    public static void searchProductByName(){
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = sc.nextLine();
        boolean checkSearchByName = true;
        for (Product product:list){
            if (product.getName().toLowerCase().equals(name.toLowerCase())){
                System.out.println(product.toString());
                checkSearchByName = false;
                break;
            }
        }
        if (checkSearchByName){
            System.out.println("Tên sản phẩm không tồn tại trong danh sách");
        }
    }

    public static void sortProduct(){
        System.out.println("Chọn kiểu sắp xếp:");
        System.out.println("1. Giá tăng dần");
        System.out.println("2. Giá giảm dần");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                listUp();
                break;
            case 2:
                listDown();
                break;
            default:
                System.out.println("error");
        }
    }
    public static void listUp(){
        ComparatorUp listUp;
        listUp = new ComparatorUp();
        Collections.sort(list,listUp);
        for (Product product:list){
            System.out.println(product.toString());
        }
    }
    public static void listDown(){
        ComparatorDown listDown;
        listDown = new ComparatorDown();
        Collections.sort(list,listDown);
        for (Product product:list){
            System.out.println(product.toString());
        }
    }
}
