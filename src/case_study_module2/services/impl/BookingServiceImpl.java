package case_study_module2.services.impl;

import case_study_module2.models.Booking;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;
import case_study_module2.services.BookingService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.regex.RegexInput;

import java.util.List;
import java.util.Set;

import static case_study_module2.controllers.FuramaController.scanner;
import static case_study_module2.services.impl.CustomerServiceImpl.getListCustomer;
import static case_study_module2.utils.ReadAndWrite.readFileBooking;
import static case_study_module2.utils.regex.RegexInput.returnIdBooking;

public class BookingServiceImpl implements BookingService {
    public static final String BOOKING_FILE = "src/case_study_module2/data/booking.csv";
    public static final String CONTRACT_FILE = "src/case_study_module2/data/contract.csv";
     Set<Booking> bookingSet = readFileBooking(BOOKING_FILE);
    static List<Customer> customerList = getListCustomer();

    @Override
    public void addBooking() {
        String idBooking = String.valueOf(returnIdBooking());
        System.out.println("Enter start date: ");
        String startDate = scanner.nextLine();

        System.out.println("Enter end date: ");
        String endDate = scanner.nextLine();

        System.out.println("Enter id customer: ");
        String idCustomer = chooseIDCustomer();

        System.out.println("Enter id Facility: ");
        Facility idFacility = chooseService();
        String nameFacility = idFacility.getNameService();

        System.out.println("Enter type service: ");
        String typeService = scanner.nextLine();

        Booking booking = new Booking(idBooking,startDate,endDate,idCustomer,nameFacility,typeService);
        bookingSet.add(booking);
        ReadAndWrite.writeFileBooking(booking,BOOKING_FILE);
        ReadAndWrite.editUsesOfFacility(idFacility.toString());
        System.out.println("Add new booking successful");
    }

    @Override
    public void displayListBooking() {
        Set<Booking> bookingSetList = readFileBooking(BOOKING_FILE);
        for (Booking list : bookingSetList) {
            System.out.println(list.toString());
        }
    }

    public String chooseIDCustomer() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.display();
        System.out.print("Choose id customer:");
        boolean check = true;
        while (check) {
            int idCustomer = RegexInput.returnOnlyNumber();
            for (Customer list : customerList) {
                if (idCustomer == list.getId()) {
                    check = false;
                    return list.getName();
                }
            }
            if (check) System.err.println("id customer is not in the list");
        }
        return null;
    }

    public Facility chooseService(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.displayFacility();
        System.out.print("Choose id service:");
        boolean check = true;
        while (check) {
            String idService = scanner.nextLine();
            for (Facility facility : facilityService.villaList.keySet()) {
                if (idService.equals(facility.getId())) {
                    check = false;
                    return facility;
                }
            }
            for (Facility facility : facilityService.houseList.keySet()) {
                if (idService.equals(facility.getId())) {
                    check = false;
                    return facility;
                }
            }
            for (Facility facility : facilityService.roomList.keySet()) {
                if (idService.equals(facility.getId())) {
                    check = false;
                    return facility;
                }
            }
            if (check) System.err.println("id facility is not in the list");
        }
        return null;
    }

}
