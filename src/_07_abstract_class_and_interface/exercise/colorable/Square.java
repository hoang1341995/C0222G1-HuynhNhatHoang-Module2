package _07_abstract_class_and_interface.exercise.colorable;

public class Square extends Shape{
    private double side;

    public Square() {
        this(2.0);
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }
    @Override
    public void howToColor() {
        System.out.println("red");
    }
}
