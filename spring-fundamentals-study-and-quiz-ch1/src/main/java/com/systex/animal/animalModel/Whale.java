package com.systex.animal.animalModel;

import com.systex.animal.Animal;
import com.systex.animal.SeaAnimal;
import org.springframework.stereotype.Component;

@Component
public class Whale implements Animal, SeaAnimal {

    private String name;

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public void move() {
         System.out.println("swiming");
    }

    @Override
    public void swim() {
        System.out.println("hi");
    }


}
