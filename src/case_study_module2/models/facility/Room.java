package case_study_module2.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String id,
                String nameService,
                double useArea,
                double price,
                int maxPeople,
                String rentalType,
                String freeService) {
        super(id, nameService, useArea, price, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
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
        return "Room{ " +
                super.toString() +
                " freeService='" + freeService + '\'' +
                '}';
    }
    public String toFile(){
        return super.toFile()+
                ","+getFreeService();
    }
}
