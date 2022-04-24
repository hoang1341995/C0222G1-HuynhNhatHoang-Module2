package case_study_module2.models.facility;

public abstract class Facility {
    private String id;
    private String nameService;
    private double useArea;
    private double price;
    private int maxPeople;
    private String rentalType;

    public Facility() {

    }

    public Facility(String id,
                    String nameService,
                    double useArea,
                    double price,
                    int maxPeople,
                    String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.useArea = useArea;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                " nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'';
    }
    public String toFile(){
        return getId()+
                ","+getNameService()+
                ","+getUseArea()+
                ","+getPrice()+
                ","+getMaxPeople()+
                ","+getRentalType();
    }
}
