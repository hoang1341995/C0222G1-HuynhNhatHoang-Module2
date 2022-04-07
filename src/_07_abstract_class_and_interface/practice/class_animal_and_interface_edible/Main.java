package _07_abstract_class_and_interface.practice.class_animal_and_interface_edible;

import _07_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal.Animal;
import _07_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal.Chicken;
import _07_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal.Tiger;
import _07_abstract_class_and_interface.practice.class_animal_and_interface_edible.edible.Edible;
import _07_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruit.Apple;
import _07_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruit.Fruit;
import _07_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }



    }
}
