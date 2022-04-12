package _10_dsa.practice.class_arraylist_easy;

public class MyListTest {
    public static void main(String[] args) {
        MyList listInteger = new MyList();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(true);
        listInteger.add("azx");
        listInteger.add(9);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println(listInteger.getLength());
        listInteger.get(6);
        System.out.println("element 6: "+listInteger.get(6));
        listInteger.getArrayList();
    }
}
