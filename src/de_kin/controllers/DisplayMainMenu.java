package de_kin.controllers;

import de_kin.services.FacilityService;

import de_kin.services.implement.BookingImpl;
import de_kin.services.implement.CustomerImpl;
import de_kin.services.implement.FacilityImpl;

import java.util.Scanner;

import static exam_module2.utils.RegexInput.returnOnlyNumber;

public class DisplayMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static FacilityService facilityService = new FacilityImpl();
    public static CustomerImpl customerImpl = new CustomerImpl();
    public static BookingImpl booking = new BookingImpl();
    public static void main(String[] args) {
        while (true){
            System.out.println("----Main Menu----");
            System.out.println("1. Display Facility");
            System.out.println("2. Add new Facility");
            System.out.println("3. Edit Facility");
            System.out.println("4. Add new Customer");
            System.out.println("5. Display customer");
            System.out.println("6. Display Booking");
            System.out.println("7. Add new Booking");
            System.out.println("0. Exit");

            switch (returnOnlyNumber()){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    facilityService.edit();
                    break;
                case 4:
                    customerImpl.addNew();
                    break;
                case 5:
                    customerImpl.display();
                    break;
                case 6:
                    booking.display();
                    break;
                case 7:
                    booking.addNew();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("number not on the menu");
            }
        }
    }
    public static void addNewFacility(){
        while (true){
            System.out.println("----Add new facility Menu----");
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("0. Return main menu");

            switch (returnOnlyNumber()){
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 0:
                    return;
                default:
                    System.err.println("number not on the menu");
            }
        }
    }
}
