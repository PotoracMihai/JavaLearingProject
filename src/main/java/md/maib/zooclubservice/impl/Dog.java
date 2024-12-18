package md.maib.zooclubservice.impl;

import md.maib.zooclubservice.Animal;
import md.maib.zooclubservice.AnimalInterface;

public class Dog extends Animal implements AnimalInterface {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Dog  " + getName() + " is barking");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating bones");
    }
}
