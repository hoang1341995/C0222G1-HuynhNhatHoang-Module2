package exam_module2.models;

public class Customer {
    private String id;
    private String name;
    private String birthDay;
    private String bookingStatus;

    public Customer() {
    }

    public Customer(String id, String name, String birthDay, String bookingStatus) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.bookingStatus = bookingStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }

    public String toFile(){
        return id+","+
                name+","+
                birthDay+","+
                bookingStatus;
    }

}
