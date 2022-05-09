package de_kin.services.implement;

import de_kin.models.booking.Booking;
import de_kin.models.person.Customer;
import de_kin.services.BookingService;
import de_kin.utils.ReadAndWrite;
import de_kin.utils.RegexInput;

import java.util.LinkedHashMap;
import java.util.List;

import static de_kin.controllers.DisplayMainMenu.customerImpl;
import static de_kin.controllers.DisplayMainMenu.facilityService;
import static de_kin.services.implement.CustomerImpl.getCustomerList;
import static de_kin.services.implement.FacilityImpl.getFacilityList;
import static de_kin.utils.ReadAndWrite.BOOKING_PATH;
import static de_kin.utils.ReadAndWrite.CUSTOMER_PATH;
import static de_kin.utils.RegexInput.checkIdCustomerForBooking;
import static de_kin.utils.RegexInput.checkIdFacilityForBooking;

public class BookingImpl implements BookingService {

    @Override
    public void display() {

    }

    @Override
    public void addNew() {
        Booking booking = new Booking();
        customerImpl.display();
        System.out.println("Enter ID customer");
        booking.setIdCustomer(checkIdCustomerForBooking());
        facilityService.display();
        System.out.println("Enter ID facility");
        booking.setIdFacility(checkIdFacilityForBooking());
        System.out.println("Enter start date");
        booking.setDateStart(RegexInput.returnDate());
        System.out.println("Enter end date");
        booking.setDateStart(RegexInput.returnDate());
        ReadAndWrite.write(BOOKING_PATH,booking.toFile());
        updateCustomerListBooking(booking.getIdCustomer());
        updateFacilityListBooking();





    }
    public static void updateCustomerListBooking(String idCustomer){
        List<Customer> customerList = getCustomerList();
        for (Customer customers: customerList){
            if (customers.getId().equals(idCustomer)){
                customers.setBookingStatus("YES");
                ReadAndWrite.write(CUSTOMER_PATH,customers.toFile());
            }else{
                ReadAndWrite.write(CUSTOMER_PATH,customers.toFile());
            }
        }
    }

    public static void updateFacilityListBooking(){
        LinkedHashMap<String,Integer> facilityList = getFacilityList();
            for (String key : facilityList.keySet()) {
                System.out.println(key + " number of uses: " + facilityList.get(key));
            }

    }
}
