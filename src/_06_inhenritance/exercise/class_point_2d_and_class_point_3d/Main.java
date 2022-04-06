package _06_inhenritance.exercise.class_point_2d_and_class_point_3d;

public class Main {
    public static void main(String[] args) {
        Point2d point2dDefault = new Point2d();
        Point2d point2d = new Point2d(1.1f,2.2f);
        Point3d point3dDefault = new Point3d();
        Point3d point3d = new Point3d(3.3f,4.4f,5.5f);
        System.out.println(point2dDefault);
        System.out.println(point2d);
        System.out.println(point3dDefault);
        System.out.println(point3d);
    }
}
