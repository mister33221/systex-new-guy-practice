package com.systex.quiz2.ch04.model.animal.animal.landAnimal;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.place.Land;

public class Elephant implements Animal, Land {

    private String name;

    public Elephant(String name) {
        this.name = name;
    }

    public Elephant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name + " Elephant run");
    }

    public void show() {
        this.run();
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                '}';
    }
}
