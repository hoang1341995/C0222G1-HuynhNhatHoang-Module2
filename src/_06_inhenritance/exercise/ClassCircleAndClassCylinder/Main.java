package _06_inhenritance.exercise.ClassCircleAndClassCylinder;

public class Main {
    public static void main(String[] args) {
    Circle circleDefault = new Circle();
    Circle circle = new Circle(10, "red");
    Cylinder cylinderDefault = new Cylinder();
    Cylinder cylinder = new Cylinder(15,"green",30);
        System.out.println("circleDefault: "+circleDefault);
        System.out.println("circle: "+circle);
        System.out.println("cylinderDefault: "+cylinderDefault);
        System.out.println("cylinder: "+cylinder);
    }
}
