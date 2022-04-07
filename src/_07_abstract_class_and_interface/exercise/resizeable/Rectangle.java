package _07_abstract_class_and_interface.exercise.resizeable;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle() {
        this(1.0,1.0);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " width= " + width +
                ", length= " + length +
                super.toString()+
                '}';
    }

    @Override
    public void resize(double value) {
        setWidth(getWidth()*(value/100));
        setLength(getLength()*(value/100));
        toString();
    }
}
