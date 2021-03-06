package _10_dsa.exercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity();
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        Object valueRemove = elements[index];
        for (int i = index; i < size ; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return (E) valueRemove;

    }

    public int size() {
        return size;
    }

    public E clone(Object[] newArray){
        elements = newArray;
        return (E) elements;
    }
    public boolean contains(E o) {
        for ( Object element: elements) {
            if (element == o){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size ; i++) {
            if (elements[i] == o){
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (elements.length * 2));
        }

    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        elements = Arrays.copyOf(elements,0);
        size = 0;
    }

    @Override
    public String toString() {
        String str = "[";
        if (elements.length == 0){
            return "[]";
        }else{
            for (int i = 0; i < size; i++) {
                if (elements[i]==null) continue;
                str += elements[i];
                if (i==(size-1)){
                    break;
                }
                if(elements[i+1]!= null) str += ",";
            }
            str +="]";
            return str;
        }
    }
}
