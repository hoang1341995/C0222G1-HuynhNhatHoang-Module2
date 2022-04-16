package _12_java_collection_framework.practice.comparable_comparator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hoang1",49,"HN");
        Student student2 = new Student("AHoang2",29,"DN");
        Student student3 = new Student("Hoang3",19,"HCM");
        Student student4 = new Student("bHoang4",39,"LA");
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student st:list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanhs theo tuoi: ");
        for (Student st:list) {
            System.out.println(st.toString());
        }
    }


}
