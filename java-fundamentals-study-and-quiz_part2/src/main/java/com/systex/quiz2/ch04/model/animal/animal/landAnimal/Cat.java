package com.systex.quiz2.ch04.model.animal.animal.landAnimal;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.place.Land;

public class Cat implements Animal, Land {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " Cat run");
    }

    @Override
    public void show() {
        this.run();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
