package case_study_module2.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floor;

    public Villa() {

    }

    public Villa(String id,
                 String nameService,
                 double useArea,
                 double price,
                 int maxPeople,
                 String rentalType,
                 String roomStandard,
                 double poolArea,
                 int floor) {
        super(id, nameService, useArea, price, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getNameService() {
        return super.getNameService();
    }

    @Override
    public void setNameService(String nameService) {
        super.setNameService(nameService);
    }

    @Override
    public double getUseArea() {
        return super.getUseArea();
    }

    @Override
    public void setUseArea(double useArea) {
        super.setUseArea(useArea);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getMaxPeople() {
        return super.getMaxPeople();
    }

    @Override
    public void setMaxPeople(int maxPeople) {
        super.setMaxPeople(maxPeople);
    }

    @Override
    public String getRentalType() {
        return super.getRentalType();
    }

    @Override
    public void setRentalType(String rentalType) {
        super.setRentalType(rentalType);
    }

    @Override
    public String toString() {
        return "Villa{ " +
                super.toString() +
                " roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
    public String toFile(){
        return super.toFile()+
                ","+getRoomStandard()+
                ","+getPoolArea()+
                ","+getFloor();
    }
}
