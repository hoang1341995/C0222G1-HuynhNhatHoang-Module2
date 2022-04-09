package case_study_module2.models;

public abstract class Facility {
    private double price;
    private double useArea;
    private int maxPeople;
    private int floor;
    private String nameService;
    private String rentalType;
    private String roomStandard;

    public Facility() {
    }

    public Facility(double price, double useArea, int maxPeople, int floor, String nameService, String rentalType, String roomStandard) {
        this.price = price;
        this.useArea = useArea;
        this.maxPeople = maxPeople;
        this.floor = floor;
        this.nameService = nameService;
        this.rentalType = rentalType;
        this.roomStandard = roomStandard;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }
}
