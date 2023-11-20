package com.systex.service;

import com.systex.animal.Animal;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ZooService {
    public void sellTicket(){
        System.out.println("執行售票");
        System.out.println("=============");
    }

    public void feedAnimal(List<? extends Animal> animalList){
        for(Animal animal:animalList){
            animal.move();
            animal.eat();
        }
        System.out.println("=============");
    }
}
