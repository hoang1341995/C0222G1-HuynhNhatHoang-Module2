package de_kin.models.facility;

public class House extends Facility{
    public House() {
    }

    public House(String id, String name, double price) {
        super(id, name, price);
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
        return "House{ "+super.toString()+" }";
    }

    public String toFile(){
        return super.toFile();
    }

}
