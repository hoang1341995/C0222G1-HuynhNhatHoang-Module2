package backup_exam_module2.lib.tree_set;

import lib.NameComparator;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // create students object
        TreeSet<Student> treeSet = new TreeSet<>(new NameComparator());
        Student student1 = new Student("Cong", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Aanh", 19, "Danang");
        // add students object to treeSet
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student1);
        // show treeSet
        for (Student student : treeSet) {
            System.out.println(student.toString());
        }
    }
}
