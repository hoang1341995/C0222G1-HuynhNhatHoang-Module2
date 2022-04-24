package case_study_module2.services.Impl;

import case_study_module2.models.Booking;
import case_study_module2.models.person.Customer;
import case_study_module2.services.BookingService;
import case_study_module2.utils.BookingComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList  = new ArrayList<>();

    @Override
    public void addBooking() {

    }

    @Override
    public void displayListBooking() {

    }
}
