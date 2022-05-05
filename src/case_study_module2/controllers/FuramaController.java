package case_study_module2.controllers;

import case_study_module2.services.impl.*;
import case_study_module2.utils.regex.RegexInput;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static BookingServiceImpl bookingService = new BookingServiceImpl();
    static ContractServiceImpl contractService = new ContractServiceImpl();
    static PromotionServiceImpl promotionService = new PromotionServiceImpl();



    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("0. Exit");
            switch (RegexInput.returnOnlyNumber()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    System.err.println("not on the menu");
            }
        }
    }

    public static void displayEmployeeMenu() {

        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            switch (RegexInput.returnOnlyNumber()) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.err.println("Not on the menu");
            }
        }
    }

    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            switch (RegexInput.returnOnlyNumber()) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.err.println("Not on the menu");
            }
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            switch (RegexInput.returnOnlyNumber()) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    addNewFacilitySubMenu();
                    break;
                case 3:
                    //displayFacilityMenu();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.err.println("Not on the menu");
            }
        }
    }

    public static void addNewFacilitySubMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back to menu");

            switch (RegexInput.returnOnlyNumber()) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.err.println("Not on the menu");
            }
        }
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            switch (RegexInput.returnOnlyNumber()) {
                case 1:
                    bookingService.addBooking();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.displayListContract();
                    break;
                case 5:
                    contractService.editContract();
                    break;
                case 6:
                    check = false;
                    break;
                default:
                    System.out.println("not on the menu");
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");

            switch (RegexInput.returnOnlyNumber()) {
                case 1:
                    promotionService.display();
                    break;
                case 2:
                    promotionService.getVoucher();
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("not on the menu");
            }
        }
    }
}
