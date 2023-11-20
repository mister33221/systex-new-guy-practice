package com.systex.quiz2.ch04.model.animal.animal.landAnimal;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.place.Land;

public class Dog implements Animal, Land {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " Dog run");
    }

    @Override
    public void show() {
        this.run();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
