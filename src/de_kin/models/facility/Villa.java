package de_kin.models.facility;

public class Villa extends Facility{
    private double poolArea;

    public Villa() {
    }

    public Villa(String id, String name, double price, double poolArea) {
        super(id, name, price);
        this.poolArea = poolArea;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
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
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
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
    public String toString() {
        return "Villa{ " +
                super.toString()+
                " poolArea=" + poolArea +
                '}';
    }
    public String toFile(){
        return super.toFile()+","+poolArea;
    }
}
