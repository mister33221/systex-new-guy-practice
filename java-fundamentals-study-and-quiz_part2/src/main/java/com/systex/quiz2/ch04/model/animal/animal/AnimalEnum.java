package com.systex.quiz2.ch04.model.animal.animal;

import com.systex.quiz2.ch04.model.animal.animal.airAnimal.Eagle;
import com.systex.quiz2.ch04.model.animal.animal.airAnimal.Sparrow;
import com.systex.quiz2.ch04.model.animal.animal.airAnimal.Woodpecker;
import com.systex.quiz2.ch04.model.animal.animal.landAnimal.Cat;
import com.systex.quiz2.ch04.model.animal.animal.landAnimal.Dog;
import com.systex.quiz2.ch04.model.animal.animal.landAnimal.Elephant;
import com.systex.quiz2.ch04.model.animal.animal.seaAnimal.Fish;
import com.systex.quiz2.ch04.model.animal.animal.seaAnimal.Shark;
import com.systex.quiz2.ch04.model.animal.animal.seaAnimal.Whale;

import java.util.Arrays;

public enum AnimalEnum {

   EAGLE(Eagle.class), SPARROW(Sparrow.class), WOODPECKER(Woodpecker.class), CAT(Cat.class), DOG(Dog.class), ELEPHANT(Elephant.class), FISH(Fish.class), SHARK(Shark.class), WHALE(Whale.class);

    private final Class<?> clazz;

    AnimalEnum(Class<?> clazz) {
        this.clazz = clazz;
    }

    public static Class<?>[] getAllAnimalClazz() {
        // return all animal class
        return Arrays.stream(AnimalEnum.values()).map(AnimalEnum::getClazz).toArray(Class<?>[]::new);
    }

    private <R> R getClazz() {
        return (R) clazz;
    }

}
