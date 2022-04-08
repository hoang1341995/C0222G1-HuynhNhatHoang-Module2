package _06_inheritance.exercise.class_triangle;

public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double gP = getPerimeter() / 2;
        return Math.sqrt(gP * (gP - getSide1()) * (gP - getSide2()) * (gP - getSide3()));
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " side1=" + getSide1() +
                ", side2=" + getSide2() +
                ", side3=" + getSide3() +
                ", color=" + getColor() +
                ", filled=" + isFilled() +
                ", getArea=" + getArea() +
                ", getPerimeter=" + getPerimeter() +
                '}';
    }
}
