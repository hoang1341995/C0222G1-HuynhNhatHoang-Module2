package lib;

import _12_java_collection_framework.exercise.product.Product;

import java.util.Comparator;

public class ComparatorDown implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
            return -1;
        } else if (product1.getPrice() < product2.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }

        /*
         public class SubjectComparator implements Comparator<Subject> {
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
    }
    */
}
