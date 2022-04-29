package case_study_module2.models;

public class Contracts {
    private int idContract;
    private String idBooking;
    private double deposit;
    private double totalPayment;
    private String customer;

    public Contracts() {
    }

    public Contracts(int idContract, String idBooking, double deposit, double totalPayment, String customer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customer = customer;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomer() {
        return customer;
    }

    public void setcustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contracts{" +
                "idContract=" + idContract +
                ", idBooking='" + idBooking + '\'' +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                ", customer=" + customer +
                '}';
    }

    public String toFile() {
        return idContract +
                "," + idBooking +
                "," + deposit +
                "," + totalPayment +
                "," + customer;
    }
}
