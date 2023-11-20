package com.systex.animal.animalModel;

import com.systex.animal.Animal;
import com.systex.animal.LandAnimal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal, LandAnimal {

    private String name;

    @Override
    public void eat() {
        System.out.println("meowing");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }

    @Override
    public void walk() {
          System.out.println("hhhhhh");
    }

}
