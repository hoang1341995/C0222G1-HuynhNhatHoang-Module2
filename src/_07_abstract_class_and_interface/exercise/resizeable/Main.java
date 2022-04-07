package _07_abstract_class_and_interface.exercise.resizeable;


public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]  = new Circle();
        circles[1]  = new Circle(5);
        circles[2]  = new Circle("red",true,7);
        System.out.println("==Circle==");
        System.out.println("before");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        System.out.println("after");
        for (Circle circle : circles){
            circle.resize(6);
            System.out.println(circle);
        }
        //================================
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(5,7);
        rectangles[2] = new Rectangle("yellow",true,6,9);
        System.out.println("==Rectangle==");
        System.out.println("before");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
        System.out.println("after");
        for (Rectangle rectangle : rectangles){
            rectangle.resize(6);
            System.out.println(rectangle);
        }
        //================================
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(4);
        squares[2] = new Square("blue",true,6);
        System.out.println("==Square==");
        System.out.println("before");
        for (Square square:squares){
            System.out.println(square);
        }
        System.out.println("after");
        for (Square square:squares){
            square.resize(6);
            System.out.println(square);
        }


    }
}
