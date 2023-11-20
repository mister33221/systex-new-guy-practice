package com.systex.quiz2.ch04.model;

import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Animal> animalCount = new ArrayList<>();

    private List<Animal> animalKind = new ArrayList<>();

    // List 跟 ArrayList 的差別是什麼？
    // List 是介面，ArrayList 是實作介面的類別
    // List 可以用來宣告變數，ArrayList 則是實作 List 的類別，可以用來實作 List 的方法

    // Array
    //是一個有固定大小的Array。
    //每次創建一個新的Array時，都需要為它設定一個大小。
    //而且在創建後，是不能再更改大小。
    //int arr[] = new int[10]
    //
    //ArrayList
    //是一個有浮動大小的Array。
    //每次創建一個新的Array時，不需要為它設定大小。
    //因為在創建後，你可以隨意更改它的大小。
    //另外，它是List interface的實作。
    //ArrayList arrL = new ArrayList();

    // constructor with all parameters
    public Park(List<Animal> animalCount, List<Animal> animalKind) {
        this.animalCount = animalCount;
        this.animalKind = animalKind;
    }

    public Park() {
    }

    public List<Animal> getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(List<Animal> animalCount) {
        this.animalCount = animalCount;
    }

    public List<Animal> getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(List<Animal> animalKind) {
        this.animalKind = animalKind;
    }


}
