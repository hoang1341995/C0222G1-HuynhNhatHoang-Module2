package backup_exam_module2.lib;

import lib.tree_set.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if (o1.getAge()> o2.getAge()){
            return 1;
        }else if (o1.getAge() < o2.getAge()){
            return -1;
        }else {
            return 0;
        }
    }


    /*
    public static void listDown(){
        NameComparator listDown = new NameComparator();
        Collections.sort(list,listDown);
        for (Product product:list){
            System.out.println(product.toString());
        }
    }
    */

    /*
    @Override
    public int compare(Subject o1, Subject o2) {

        if (o1.getId().compareTo(o2.getId()) < 0){
            return 1;
        }else if (o1.getId().compareTo(o2.getId()) > 0){
            return -1;
        }else {
            return 0;
        }
    }
    */

    /*
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
            return 1;
        } else if (product1.getPrice() < product2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
    */
}
