package _06_inhenritance.exercise.class_point_and_class_moveable_point;

public class Main {
    public static void main(String[] args) {
        Point pointDefault = new Point();
        System.out.println(pointDefault);

        Point point = new Point(6.0f,12.0f);
        System.out.println(point);

        MoveablePoint moveablePointDefault = new MoveablePoint();
        System.out.println(moveablePointDefault);

        MoveablePoint moveablePoint = new MoveablePoint(5.0f,10.0f,15.0f,30.0f);
        System.out.println(moveablePoint);

        System.out.println(moveablePoint.move());
    }
}
