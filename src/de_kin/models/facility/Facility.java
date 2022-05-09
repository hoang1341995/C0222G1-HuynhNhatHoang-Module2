package de_kin.models.facility;

public abstract class Facility {
    private String id;
    private String name;
    private double price;

    public Facility() {
    }

    public Facility(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
    public String toFile(){
        return id+","+
                name+","+
                price;
    }
}
