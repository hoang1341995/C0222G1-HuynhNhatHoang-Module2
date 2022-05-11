package exam_module2.controllers;

import exam_module2.services.implement.BankImpl;

import java.util.Scanner;

import static exam_module2.utils.regex.Regex.regexNumber;

public class DisplayMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static BankImpl bank = new BankImpl();
    public static void main(String[] args) {
        while (true){
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG----");
            System.out.println("1. THÊM MỚI");
            System.out.println("2. XOÁ");
            System.out.println("3. XEM DANH SÁCH CÁC TÀI KHOẢN NGÂN HÀNG");
            System.out.println("4. TÌM KIẾM");
            System.out.println("5. THOÁT");

            switch (regexNumber()){
                case 1:
                    addNew();
                    break;
                case 2:
                    bank.remove();
                    break;
                case 3:
                    bank.display();
                    break;
                case 4:
                    bank.search();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.err.println("số không có trong menu");
            }
        }
    }

    public static void addNew(){
        while (true){
            System.out.println("----MENU THÊM TÀI KHOẢN----");
            System.out.println("1. THÊM TÀI KHOẢN TIẾT KIÊM");
            System.out.println("2. THÊM TÀI KHOẢN THANH TOÁN");
            System.out.println("3. QUAY LẠI MENU CHÍNH");

            switch (regexNumber()){
                case 1:
                    bank.addNewSaverAccount();
                    break;
                case 2:
                    bank.addnewPaymentAccount();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("number not on the menu");
            }
        }
    }


}
