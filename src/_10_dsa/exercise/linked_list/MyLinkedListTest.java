package _10_dsa.exercise.linked_list;

public class MyLinkedListTest{
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(199);
        myLinkedList.addFirst(299);
        myLinkedList.addFirst(399);
        myLinkedList.addFirst(499);
        myLinkedList.addFirst(599);
        myLinkedList.addFirst(699);

        System.out.println(myLinkedList.toString());
        myLinkedList.addLast(999); //add element last
        System.out.println(myLinkedList.toString()); // show list
        System.out.println(myLinkedList.remove(2)); //remove element by index
        System.out.println(myLinkedList.toString());  //show list
        System.out.println(myLinkedList.size()); //show size



    }



}
