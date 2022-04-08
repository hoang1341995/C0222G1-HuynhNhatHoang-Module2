package _06_inheritance.exercise.class_circle_and_class_cylinder;

public  class Cylinder extends Circle{
        private double height;
        public Cylinder(){
            this(8.0,"black",20);
        }
        public Cylinder(double radius,String color,double height){
            super(radius,color);
            this.height = height;
        }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " radius=" + getRadius() +
                " color=" + getColor() +
                " height=" + getHeight() +
                '}';
    }
}