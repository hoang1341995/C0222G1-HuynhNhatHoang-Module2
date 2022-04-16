package _11_dsa.exercise.demerging;

import java.rmi.Naming;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static Queue<Person> NU = new LinkedList<>();
    public static Queue<Person> NAM = new LinkedList<>();
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
                NAM.add(persons);
            }else{
                NU.add(persons);
            }
        }
        for (Person persons: NU){
            System.out.println(persons);
        }
        for (Person persons: NAM){
            System.out.println(persons);
        }

    }
}
