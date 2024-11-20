package md.maib.zooclubservice.impl;

import md.maib.zooclubservice.Animal;
import md.maib.zooclubservice.AnimalInterface;

public class Cat extends Animal implements AnimalInterface {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat  " + getName() + " is meowing");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating fish");
    }
}
