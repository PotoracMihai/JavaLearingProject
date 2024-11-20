package md.maib.zooclubservice;

import md.maib.zooclubservice.impl.Cat;
import md.maib.zooclubservice.impl.Dog;

public class ZooService {
    public static void main(String[] args) {
        Animal animal = new Cat("Tom");
        Cat cat = new Cat("Tommy");
        Dog dog = new Dog("Rex");

        cat.makeSound();
        cat.eat();

        dog.makeSound();
        dog.eat();
    }
}
