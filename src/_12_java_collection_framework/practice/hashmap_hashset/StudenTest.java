package _12_java_collection_framework.practice.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudenTest {
    public static void main(String[] args) {
        Student student1 = new Student("Hoang1",19,"HN");
        Student student2 = new Student("Hoang2",29,"DN");
        Student student3 = new Student("Hoang3",39,"HCM");
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for(Student student : students){
            System.out.println(student.toString());
        }

    }
}
