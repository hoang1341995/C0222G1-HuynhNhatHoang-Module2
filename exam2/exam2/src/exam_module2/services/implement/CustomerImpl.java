package exam_module2.services.implement;



import exam_module2.models.Customer;
import exam_module2.services.CustomerService;
import exam_module2.utils.ReadAndWrite;
import exam_module2.utils.regex.Regex;

import java.util.ArrayList;
import java.util.List;

import static exam_module2.controllers.DisplayMainMenu.scanner;
import static exam_module2.utils.ReadAndWrite.CUSTOMER_PATH;
import static exam_module2.utils.ReadAndWrite.reWriteList;

public class CustomerImpl implements CustomerService {
        List<Customer> customerList = getCustomerList();
    @Override
    public void display() {
        customerList = getCustomerList();
        for (Customer customers: customerList){
            System.out.println(customers.toString());
        }
    }

    @Override
    public void addNew() {
        Customer customer = new Customer();
        System.out.println("Enter id customer (CUS-XXXX)");
        customer.setId(scanner.nextLine());
        System.out.println("Enter Name customer");
        customer.setName(scanner.nextLine());
        System.out.println("Enter birthDay");
        customer.setBirthDay(scanner.nextLine());
        customer.setBookingStatus("NO");
        ReadAndWrite.write(CUSTOMER_PATH,customer.toFile());
        System.out.println("Add new customer successfull");
    }

    @Override
    public void edit() {
        customerList = getCustomerList();
        display();
        String idEdit;
        System.out.print("Nhập id bạn muốn chỉnh sửa ");
        idEdit = scanner.nextLine();
        boolean check = true;
        for (Customer customers : customerList) {
            if (customers.getId().equals(idEdit)) {
                check = false;
                int choose = 0;
                System.out.println("Editing options\n" +
                        "1. name\n" +
                        "2. birthDay\n" +
                        "3. birthDay\n");
                while (true){
                    try {
                        System.out.print("Choose section you want to edit: ");
                        choose = Regex.regexNumber();
                        break;
                    }catch (NumberFormatException e){
                        System.err.println("Wrong, please re-enter.");
                    }
                }
                switch (choose){
                    case 1:
                        System.out.print("Nhập tên mới");
                        customers.setName(scanner.nextLine());
                        System.out.println("Thêm thành công");
                        break;
                    case 2:
                        System.out.print("Nhập ngày sinh mới");
                        customers.setBirthDay(scanner.nextLine());
                        System.out.println("Thêm thành công");
                        break;
                    default:
                        System.err.println("Số không có trong menu chọn");
                        break;
                }
                reWriteList(customerList,CUSTOMER_PATH);
                break;
            }
        }
        if (check) {
            System.err.println("Id không tồn tại");
        }
    }

    public static List<Customer> getCustomerList(){
        List<Customer> customers = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read(CUSTOMER_PATH);
        for (String[] lists : list){
            customers.add(new Customer(lists[0],
                                    lists[1],
                                    lists[2],
                                    lists[3]));
        }
        return customers;
    }



}
