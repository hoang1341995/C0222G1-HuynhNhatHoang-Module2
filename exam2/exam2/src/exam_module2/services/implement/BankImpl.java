package exam_module2.services.implement;


import exam_module2.models.Bank;
import exam_module2.models.PaymentAccount;
import exam_module2.models.SaverAccount;
import exam_module2.services.BankService;
import exam_module2.utils.ReadAndWrite;
import exam_module2.utils.exception.BankException;
import exam_module2.utils.regex.Regex;

import java.util.ArrayList;
import java.util.List;

import static exam_module2.controllers.DisplayMainMenu.scanner;
import static exam_module2.utils.ReadAndWrite.*;
import static exam_module2.utils.regex.Regex.autoIncrementId;

public class BankImpl implements BankService {

    List<Bank> bankList = getBankList();

    @Override
    public void display() {
        bankList = getBankList();
        for (Bank lists : bankList) {
            System.out.println(lists.toString());
        }
    }

    @Override
    public void addNewSaverAccount() {
        SaverAccount saverAccount = new SaverAccount();
        saverAccount.setIdAccount(autoIncrementId(getBankList()));
        System.out.println("Nhập mã số tài khoản");
        saverAccount.setCodeAccount(scanner.nextLine());
        System.out.println("Nhập tên tài khoản");
        saverAccount.setNameAccount(Regex.regexName());
        System.out.println("Nhập ngày tạo tài khoản");
        saverAccount.setStartDay(Regex.regexDate());

        System.out.println("Nhập số tiền gửi tiết kiệm");
        saverAccount.setMoneySaver(Regex.regexNumber());
        System.out.println("Nhập ngày gửi tiết kiệm");
        saverAccount.setSaverDay(Regex.regexDate());
        System.out.println("Nhập Nhập lãi suất %");
        saverAccount.setInterest(Regex.regexNumber());
        System.out.println("Nhập kì hạn (Tháng)");
        saverAccount.setTimeLimit(Regex.regexNumber());

        ReadAndWrite.write(BANK_ACCOUNTS_PATH, saverAccount.toFile());
        System.out.println("Thêm tài khoản tiết kiệm thành công");
    }

    @Override
    public void addnewPaymentAccount() {
        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.setIdAccount(autoIncrementId(getBankList()));
        System.out.println("Nhập mã số tài khoản");
        paymentAccount.setCodeAccount(scanner.nextLine());
        System.out.println("Nhập tên tài khoản");
        paymentAccount.setNameAccount(Regex.regexName());
        System.out.println("Nhập ngày tạo tài khoản");
        paymentAccount.setStartDay(Regex.regexDate());

        System.out.println("Nhập số thẻ");
        paymentAccount.setNumberAccount(Regex.regexNumber());
        System.out.println("Nhập số tiền trong tài khoản");
        paymentAccount.setMoneyInAccount(Regex.regexNumber());

        ReadAndWrite.write(BANK_ACCOUNTS_PATH, paymentAccount.toFile());
        System.out.println("Thêm tài khoản thanh toán thành công");
    }

    @Override
    public void remove() {
        String codeAccountRemove;
        boolean check = true;
        bankList = getBankList();
        for (Bank lists : bankList) {
            System.out.println(lists.toString());
        }
        System.out.println("Nhập mã tài khoản muốn xoá");
        try {
            while (check) {
                codeAccountRemove = scanner.nextLine();
                for (Bank lists : bankList) {
                    if (lists.getCodeAccount().equals(codeAccountRemove)) {
                        check = false;
                        System.out.println("Chọn\n 1. xác nhân xoá\n 2. huỷ bỏ");
                        if (Regex.regexNumber() == 1) {
                            reWriteList(codeAccountRemove, bankList, BANK_ACCOUNTS_PATH);
                            System.out.println("Xoá thành công");
                            break;
                        } else {
                            break;
                        }
                    }
                }
                if (check) {
                    throw new BankException("Tài khoản không tồn tại");
                }
            }
        }catch (BankException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập mã tài khoản hoặc tên chủ tài khoản cần tìm kiếm");
        String textFind = scanner.nextLine();
        bankList = getBankList();
        for (Bank lists : bankList) {
            if (lists.getCodeAccount().contains(textFind) || lists.getNameAccount().contains(textFind)){
                System.out.println(lists);
            }
        }
    }

    public static List<Bank> getBankList() {
        List<Bank> bankList1 = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read(BANK_ACCOUNTS_PATH);
        for (String[] lists : list) {
            if (lists.length == 8) {
                bankList1.add(new SaverAccount(Integer.parseInt(lists[0]),
                        lists[1],
                        lists[2],
                        lists[3],
                        Integer.parseInt(lists[4]),
                        lists[5],
                        Integer.parseInt(lists[6]),
                        Integer.parseInt(lists[7])));
            } else {
                bankList1.add(new PaymentAccount(Integer.parseInt(lists[0]),
                        lists[1],
                        lists[2],
                        lists[3],
                        Integer.parseInt(lists[4]),
                        Integer.parseInt(lists[5])));
            }
        }
        return bankList1;
    }

}
