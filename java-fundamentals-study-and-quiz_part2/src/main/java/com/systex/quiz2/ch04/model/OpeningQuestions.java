package com.systex.quiz2.ch04.model;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.placeInterface.Place;

import java.util.HashMap;

public class OpeningQuestions {

    private String place;

    //放被選擇的動物
    private Animal selectedAnimal;

    //放被選擇的動物列表(區域)
    private HashMap<String, Animal> animalSelectedMap;

    private Integer countShow;

    public OpeningQuestions() {

    }

    public OpeningQuestions(String place, Animal selectedAnimal, Integer countShow) {
        this.place = place;
        this.selectedAnimal = selectedAnimal;
        this.countShow = countShow;
    }


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Animal getSelectedAnimal() {
        return selectedAnimal;
    }

    public void setSelectedAnimal(Animal selectedAnimal) {
        this.selectedAnimal = selectedAnimal;
    }

    public HashMap<String, Animal> getAnimalSelectedMap() {
        return animalSelectedMap;
    }

    public void setAnimalSelectedMap(HashMap<String, Animal> animalSelectedMap) {
        this.animalSelectedMap = animalSelectedMap;
    }

    public Integer getCountShow() {
        return countShow;
    }

    public void setCountShow(Integer countShow) {
        this.countShow = countShow;
    }

    //toString
    @Override
    public String toString() {
        return "OpeningQuestions{" +
                "place='" + place + '\'' +
                ", selectedAnimal=" + selectedAnimal +
                ", animalSelectedMap=" + animalSelectedMap +
                ", countShow='" + countShow + '\'' +
                '}';
    }
}
