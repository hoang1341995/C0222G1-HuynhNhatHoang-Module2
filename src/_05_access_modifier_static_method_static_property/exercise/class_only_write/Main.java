package _05_access_modifier_static_method_static_property.exercise.class_only_write;

public class Main {
    public static void main(String[] args) {
        Student Test = new Student();
        System.out.println(Test.setName("Hoàng"));
        System.out.println(Test.getName());
    }
}
