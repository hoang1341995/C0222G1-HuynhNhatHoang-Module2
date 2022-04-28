package case_study_module2.models;


public class Booking {
    private String idBooking;
    private String startDate;
    private String endDate;
    private String customer;
    private String facility;
    private String typeService;

    public Booking() {
    }

    public Booking(String idBooking,
                   String startDate,
                   String endDate,
                   String customer,
                   String facility,
                   String typeService) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
        this.typeService = typeService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                ", typeService=" + typeService +
                '}';
    }

    public String toFile() {
        return idBooking +
                "," + startDate +
                "," + endDate +
                "," + customer +
                "," + facility +
                "," + typeService;
    }
}
