package test_mobile.controllers;

import test_mobile.models.ChinhHang;
import test_mobile.models.XachTay;
import test_mobile.services.implement.PhoneImpl;

import java.util.Scanner;

import static exam_module2.utils.RegexInput.returnOnlyNumber;

public class DisplayMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static PhoneImpl phone = new PhoneImpl();
    public static void main(String[] args) {
        while (true){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xoá");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Exit");

            switch (returnOnlyNumber()){
                case 1:
                    addNewPhone();
                    break;
                case 2:
                    phone.delete();
                    break;
                case 3:
                    phone.display();
                    break;
                case 4:
                    phone.search();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.err.println("number not on the menu");
            }
        }
    }
    public static void addNewPhone(){
        boolean check = true;
        ChinhHang chinhHang;
        XachTay xachTay;
        while (check){
            System.out.println("--Chọn loại điện thoại cần thêm--");
            System.out.println("1. Điện thoại chính hãng");
            System.out.println("2. Điện thoại xách tay");
            System.out.println("3. Quay lại menu chính");
            switch (returnOnlyNumber()){
                case 1:
                    phone.addNew(1);
                    break;
                case 2:
                    phone.addNew(2);
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.err.println("number not on the menu");
            }
        }
    }
}
