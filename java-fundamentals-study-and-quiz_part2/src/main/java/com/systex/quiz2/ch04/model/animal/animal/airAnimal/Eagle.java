package com.systex.quiz2.ch04.model.animal.animal.airAnimal;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.place.Air;

public class Eagle implements Animal, Air {

    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    public Eagle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        this.fly();
    }

    @Override
    public void fly() {
        System.out.println(this.name + " Eagle fly");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}

