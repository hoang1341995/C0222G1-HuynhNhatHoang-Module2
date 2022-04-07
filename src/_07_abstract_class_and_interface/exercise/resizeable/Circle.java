package _07_abstract_class_and_interface.exercise.resizeable;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                super.toString()+
                '}';
    }

    @Override
    public void resize(double value) {
        setRadius(getRadius()*(value/100));
    }
}
