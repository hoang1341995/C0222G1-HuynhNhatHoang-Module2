package de_kin.models.facility;

public class Room extends Facility{
    public Room() {
    }

    public Room(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "Room{ "+super.toString()+" }";
    }

    public String toFile(){
        return super.toFile();
    }
}
