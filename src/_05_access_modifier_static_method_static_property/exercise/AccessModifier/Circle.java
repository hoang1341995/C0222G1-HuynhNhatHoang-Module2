package _05_access_modifier_static_method_static_property.exercise.AccessModifier;

class Circle{
    private double radius = 1.0d;
    private String color = "red";
    Circle(){
    }
    Circle(double Radius){
        this.radius = Radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
}