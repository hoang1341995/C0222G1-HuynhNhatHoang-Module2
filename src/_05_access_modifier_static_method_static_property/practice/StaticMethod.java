package _05_access_modifier_static_method_static_property.practice;

public class StaticMethod {
    public static void main(String[] args) {

        Student.change();
        Student student = new Student(111,"Hoàng");
        Student student2 = new Student(222,"Hoàngr");
        student.display();
        student2.display();
    }
    public static class Student{
        private int rollno;
        private String name;
        private static String college = "BBDIT";
        Student(int r,String n){
            this.rollno = r;
            this.name = n;
        }
        static void change(){
            college = "CodeGym";
        }
        void display(){
            System.out.println(rollno+" "+this.name+" "+college);
        }

    }
}
