package com.systex.quiz2.ch04.model.animal.animal.airAnimal;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.place.Air;

public class Woodpecker implements Animal, Air {

    private String name;

    public Woodpecker(String name) {
        this.name = name;
    }

    public Woodpecker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(this.name + " Woodpecker fly");
    }

    @Override
    public void show() {
        this.fly();
    }

    @Override
    public String toString() {
        return "Woodpecker{" +
                "name='" + name + '\'' +
                '}';
    }

}
