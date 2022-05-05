package case_study_module2.services.impl;

import case_study_module2.models.Contracts;
import case_study_module2.models.person.Employee;
import case_study_module2.services.PromotionService;
import case_study_module2.utils.regex.RegexInput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static case_study_module2.services.impl.BookingServiceImpl.CONTRACT_FILE;
import static case_study_module2.services.impl.ContractServiceImpl.getListContract;
import static case_study_module2.utils.ReadAndWrite.EMPLOYEE_FILE;
import static case_study_module2.utils.regex.RegexInput.returnMonthAndYear;
import static case_study_module2.utils.regex.RegexInput.returnOnlyNumber;

public class PromotionServiceImpl implements PromotionService {
    @Override
    public void display() {
        System.out.println("Enter year you want display customer use service");
        int year = returnOnlyNumber();
        DateTimeFormatter formatter;
        LocalDate testDay;
        List<Contracts> contractsList = getListContract();
        for (Contracts contracts : contractsList) {
            formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            testDay = LocalDate.parse(contracts.getDate(), formatter);
            if (year == testDay.getYear()) {
                System.out.println(contracts.toString());
            }
        }
    }

    @Override
    public void getVoucher() {
        System.out.println("Enter the month and year you want to issue the voucher: \n example: 01/2000");
        String monthAndYear = returnMonthAndYear();
        List<Contracts> contractsList = getListContract();
        List<Contracts> contractsListnew = new ArrayList<>();
        Stack<Contracts> discountList = new Stack<>();
        Contracts contracts;
        int voucher10 = 0;
        int voucher20 = 0;
        int voucher50 = 0;
        int count = 0;
        for (Contracts contract : contractsList) {
            if (contract.getDate().substring(3).equals(monthAndYear)&& contract.getStatusDiscount().equals("false")) {
                discountList.add(contract);
                count++;
                System.out.println(contract.toString());
            }else {
                contractsListnew.add(contract);
            }
        }
        if (count == 0){
            System.err.println("not found booking");
        }else{
            while (true) {
                System.out.println("Enter count of voucher 10%. max = " + count);
                voucher10 = RegexInput.returnOnlyNumber();
                System.out.println("Enter count of voucher 20%. max = " + (count - voucher10));
                voucher20 = RegexInput.returnOnlyNumber();
                System.out.println("Enter count of voucher 50%. max = " + (count - voucher20 - voucher10));
                voucher50 = RegexInput.returnOnlyNumber();
                if ((voucher10 + voucher20 + voucher50) == count) {
                    break;
                } else {
                    System.err.println("voucher not equal customer. The number of customer is " + count + ". Please re-enter");
                }
            }
            for (int i = 1; i <= count; i++) {
                 contracts = discountList.pop();
                if (i <= voucher10){
                    contracts.setStatusDiscount("Voucher 10%");
                    contractsListnew.add(contracts);
                    System.out.println(contracts);
                } else if (i <= (voucher10+voucher20)) {
                    contracts.setStatusDiscount("Voucher 20%");
                    contractsListnew.add(contracts);
                    System.out.println(contracts);
                }else {
                    contracts.setStatusDiscount("Voucher 50%");
                    contractsListnew.add(contracts);
                    System.out.println(contracts);
                }
            }
            try {
                File file = new File(CONTRACT_FILE);
                file.delete();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                for (Contracts contracts1 : contractsListnew){
                    bufferedWriter.write(contracts1.toFile());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("done !");
        }


    }


}
