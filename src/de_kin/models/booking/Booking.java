package de_kin.models.booking;

public class Booking {
    private int id;
    private String idCustomer;
    private String idFacility;
    private String dateStart;
    private String dateEnd;

    public Booking() {
    }

    public Booking(int id, String idCustomer, String idFacility, String dateStart, String dateEnd) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idFacility = idFacility;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", idCustomer='" + idCustomer + '\'' +
                ", idFacility='" + idFacility + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                '}';
    }
    public String toFile(){
        return id+","+
                idCustomer+","+
                idFacility+","+
                dateStart+","+
                dateEnd;
    }
}
