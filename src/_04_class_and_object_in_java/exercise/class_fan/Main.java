package _04_class_and_object_in_java.exercise.class_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(3, false, 5, "blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
