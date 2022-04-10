package _07_abstract_class_and_interface.exercise.resizeable;


public class Main {
    public static void main(String[] args) {
   Shape[] shape = new Shape[3];
   Shape Circle = new  Circle("red",true,7);
   shape[0] = Circle;
   Shape Rectangle = new Rectangle("yellow",true,6,9);
   shape[1] = Rectangle;
   Shape Square = new Square("blue",true,6);
   shape[2] = Square;
   for(Shape shapes: shape){
       System.out.println("before\n"+shapes);
       shapes.resize(6);
       System.out.println("after\n"+shapes+"\n");
   }
    }
}
