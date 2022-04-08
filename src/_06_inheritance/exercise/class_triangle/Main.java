package _06_inheritance.exercise.class_triangle;

public class Main {
    public static void main(String[] args) {
        Shape shapeDefault = new Shape();
        System.out.println(shapeDefault);

        Shape shape = new Shape("yellow", false);
        System.out.println(shape);

        Triangle triangleDefault = new Triangle();
        System.out.println(triangleDefault);

        Triangle triangle = new Triangle(2.0, 2.3, 2.6);
        System.out.println(triangle);

        Triangle triangle1 = new Triangle("green",true,3.1,3.2,3.3);
        System.out.println(triangle1);
    }
}
