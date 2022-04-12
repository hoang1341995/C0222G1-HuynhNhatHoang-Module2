package _10_dsa.practice.class_arraylist_easy;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public int getLength(){
        return elements.length;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public void getArrayList(){
        System.out.println(Arrays.toString(elements));
    }

    public E get(int i) {

        return (E) elements[i];
    }


}
