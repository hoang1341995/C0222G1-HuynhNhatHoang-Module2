package _11_dsa.exercise.sort_employee_list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static Queue<Person> femade = new LinkedList<>();
    public static Queue<Person> made = new LinkedList<>();
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Manh", 59, true);
        person[1] = new Person("Thao", 49, false);
        person[2] = new Person("Long", 29, true);
        person[3] = new Person("Huong", 19, false);
        person[4] = new Person("Nam", 39, true);
        Arrays.sort(person);
        for (Person persons: person){
            if (persons.isGender()){
                made.add(persons);
            }else{
                femade.add(persons);
            }
        }
        for (Person persons: femade){
            System.out.println(persons);
        }
        for (Person persons: made){
            System.out.println(persons);
        }

    }
}
