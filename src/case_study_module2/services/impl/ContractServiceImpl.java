package case_study_module2.services.impl;

import case_study_module2.models.Booking;
import case_study_module2.models.Contracts;
import case_study_module2.models.person.Customer;
import case_study_module2.services.ContactService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.regex.RegexInput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static case_study_module2.controllers.FuramaController.scanner;
import static case_study_module2.services.impl.BookingServiceImpl.BOOKING_FILE;
import static case_study_module2.services.impl.BookingServiceImpl.CONTRACT_FILE;
import static case_study_module2.utils.ReadAndWrite.*;
import static case_study_module2.utils.regex.RegexInput.returnId;

public class ContractServiceImpl implements ContactService {
    List<Contracts> contractsList = getListContract();
    @Override
    public void createNewContract() {
        Contracts contracts = new Contracts();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        bookingService.displayListBooking();

        contracts.setIdContract(returnId(CONTRACT_FILE));

        System.out.println("choose id booking you want sign contract");
        Booking booking = findBookingById();

        contracts.setIdBooking(booking.getIdBooking());

        System.out.println("Enter repayment amount");
        contracts.setDeposit(RegexInput.returnOnlyNumber());

        System.out.println("Enter payment amount");
        contracts.setTotalPayment(RegexInput.returnOnlyNumber());

        contracts.setcustomer(booking.getCustomer());
        booking.setSignContract(true);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate today = LocalDate.now();
        contracts.setDate(today.format(formatter));

        contracts.setStatusDiscount("false");

        ReadAndWrite.writeFileContract(contracts,CONTRACT_FILE);
        reWriteFileBookingSignContract(booking);
        System.out.println("Add new Contract successful");


        //for ()
    }



    public Booking findBookingById(){
        int idBooking;
        Set<Booking> bookingSetList;
        boolean check = true;
        while (true){
            idBooking = RegexInput.returnOnlyNumber();
            bookingSetList = readFileBooking(BOOKING_FILE);
            for (Booking list : bookingSetList) {
                if (Integer.parseInt(list.getIdBooking()) == idBooking && !list.isSignContract()){
                    return list;
                } else if (Integer.parseInt(list.getIdBooking()) == idBooking && list.isSignContract()) {
                    check = false;
                }
            }
            if (check){
                System.err.println("Id not on booking list");
            }else {
                System.err.println("signed contract");
            }
        }
    }

    @Override
    public void displayListContract() {
        List<Contracts> contractsList = getListContract();
        System.out.println("<<Customer List>>");
        for (Contracts contracts: contractsList){
            System.out.println(contracts.toString());
        }
    }

    public static List<Contracts> getListContract(){
        List<Contracts> contractsList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile(CONTRACT_FILE);
        for (String[] lists : list) {
            contractsList.add(new Contracts(
                    Integer.parseInt(lists[0]),
                    lists[1],
                    Double.parseDouble(lists[2]),
                    Double.parseDouble(lists[3]),
                    lists[4],lists[5],lists[6]));
        }
        return contractsList;
    }

    @Override
    public void editContract() {
        displayListContract();
        int idContractEdit;
        boolean check = true;
        System.out.println("Enter id contract you want edit");
        idContractEdit = checkIdContractEdit();
        for (Contracts contractElement: contractsList){
            if (contractElement.getIdContract() ==  idContractEdit){
                check = false;
                System.out.println("Editing options\n" +
                        "1. Id Booking\n" +
                        "2. Deposit\n" +
                        "3. Total Payment\n" +
                        "4. Customer\n");
                System.out.print("Choose section you want to edit: ");
                switch (RegexInput.returnOnlyNumber()){
                    case 1:
                        System.out.print("Enter new id booking of Constract: ");
                        contractElement.setIdBooking(scanner.nextLine());
                        System.out.println("Edit id booking successful");
                        break;
                    case 2:
                        System.out.print("Enter new deposit of Constract: ");
                        contractElement.setDeposit(RegexInput.returnOnlyNumber());
                        System.out.println("Edit deposit successful");
                        break;
                    case 3:
                        System.out.print("Enter new total payment of Constract: ");
                        contractElement.setTotalPayment(RegexInput.returnOnlyNumber());
                        System.out.println("Edit total payment successful");
                        break;
                    case 4:
                        System.out.print("Enter new customer of Constract: ");
                        contractElement.setcustomer(scanner.nextLine());
                        System.out.println("Edit customer successful");
                        break;
                    default:
                        System.err.println("number not on the menu");
                }
                reWriteListConstract();
                break;
            }
        }

    }

    public  void reWriteListConstract(){
        try {
            File file = new File(CONTRACT_FILE);
            file.delete();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            for (Contracts contracts : contractsList){
                bufferedWriter.write(contracts.toFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int checkIdContractEdit(){
        List<Contracts> contractsList = getListContract();
        int id;
        boolean check = true;
        while (true){
            id = RegexInput.returnOnlyNumber();
            for (Contracts list: contractsList){
                if (list.getIdContract() == id){
                    return id;
                }
            }
            if (check){
                System.err.println("id not on the Contract list. please re-enter");
            }

        }
    }

}
