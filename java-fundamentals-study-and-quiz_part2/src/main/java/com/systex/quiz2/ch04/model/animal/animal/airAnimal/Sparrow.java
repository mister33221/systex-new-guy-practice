package com.systex.quiz2.ch04.model.animal.animal.airAnimal;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.place.Air;

public class Sparrow implements Animal, Air {

    private String name;

    public Sparrow(String name) {
        this.name = name;
    }

    public Sparrow() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(this.name + " Sparrow fly");
    }

    @Override
    public void show() {
        this.fly();
    }

    @Override
    public String toString() {
        return "Sparrow{" +
                "name='" + name + '\'' +
                '}';
    }

}
