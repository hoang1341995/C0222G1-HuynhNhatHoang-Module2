package _07_abstract_class_and_interface.exercise.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0]= new Circle("black",true,4.6);
        shape[1] = new Square(5);
        shape[2] = new Rectangle("red",true,5,10);

        for (Shape shapes: shape){
            System.out.println(shapes);
            if (shapes instanceof Square){
                ((Square)shapes).howToColor();
            }
        }
    }
}
