package com.systex.quiz2.ch04.model.animal.animal.seaAnimal;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.place.Sea;

public class Whale  implements Animal, Sea {

    private String name;


    public Whale(String name) {
        this.name = name;
    }


    public Whale() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(this.name + " Whale swim");
    }

    @Override
    public void show() {
        this.swim();
    }



    @Override
    public String toString() {
        return "Whale{" +
                "name='" + name + '\'' +
                '}';
    }
}
