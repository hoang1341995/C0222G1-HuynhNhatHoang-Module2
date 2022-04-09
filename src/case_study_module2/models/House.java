package case_study_module2.models;

public class House extends Facility{
    public House() {
    }

    public House(double price, double useArea, int maxPeople, int floor, String nameService, String rentalType, String roomStandard) {
        super(price, useArea, maxPeople, floor, nameService, rentalType, roomStandard);
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
    public double getUseArea() {
        return super.getUseArea();
    }

    @Override
    public void setUseArea(double useArea) {
        super.setUseArea(useArea);
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
    public int getFloor() {
        return super.getFloor();
    }

    @Override
    public void setFloor(int floor) {
        super.setFloor(floor);
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
    public String getRentalType() {
        return super.getRentalType();
    }

    @Override
    public void setRentalType(String rentalType) {
        super.setRentalType(rentalType);
    }

    @Override
    public String getRoomStandard() {
        return super.getRoomStandard();
    }

    @Override
    public void setRoomStandard(String roomStandard) {
        super.setRoomStandard(roomStandard);
    }
}
