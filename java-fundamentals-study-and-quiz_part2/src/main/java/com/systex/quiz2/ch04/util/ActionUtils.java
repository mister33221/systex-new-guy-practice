package com.systex.quiz2.ch04.util;

import com.systex.quiz2.ch04.model.OpeningQuestions;
import com.systex.quiz2.ch04.model.Park;
import com.systex.quiz2.ch04.model.animal.animal.AnimalEnum;
import com.systex.quiz2.ch04.model.animal.animal.airAnimal.Eagle;
import com.systex.quiz2.ch04.model.animal.animal.airAnimal.Sparrow;
import com.systex.quiz2.ch04.model.animal.animal.airAnimal.Woodpecker;
import com.systex.quiz2.ch04.model.animal.animal.landAnimal.Cat;
import com.systex.quiz2.ch04.model.animal.animal.landAnimal.Dog;
import com.systex.quiz2.ch04.model.animal.animal.landAnimal.Elephant;
import com.systex.quiz2.ch04.model.animal.animal.seaAnimal.Fish;
import com.systex.quiz2.ch04.model.animal.animal.seaAnimal.Shark;
import com.systex.quiz2.ch04.model.animal.animal.seaAnimal.Whale;
import com.systex.quiz2.ch04.model.animal.animalInterface.Animal;
import com.systex.quiz2.ch04.model.place.PlaceEnum;
import com.systex.quiz2.ch04.model.place.place.Air;
import com.systex.quiz2.ch04.model.place.place.Land;
import com.systex.quiz2.ch04.model.place.place.Sea;


import java.lang.reflect.InvocationTargetException;
import java.util.*;


public class ActionUtils {

    // 列出可出場的動物
    HashMap<String, Animal> offerChoiceAnimal = new HashMap<>();

    /**
     * init park
     *
     * @return park
     */
    public Park createPark() {

        Park park = new Park();

//        set animal count
        park.setAnimalCount(initAnimalInParkList());

//        set animal kind
        park.setAnimalKind(initAnimalKind());

        return park;
    }

    /**
     * init the animal list
     *
     * @param
     * @return
     */
    public List<Animal> initAnimalInParkList() {

        List<Animal> animalInParkList = new ArrayList<>();

//        version 2
//        use reflection to create all the animal object
        Class<?>[] classes = AnimalEnum.getAllAnimalClazz();
        for (Class<?> clazz : classes) {
            try {
                for (int i = 1; i <= 5; i++) {
                    Animal animalInPark = (Animal) clazz.getDeclaredConstructor(String.class).newInstance(clazz.getSimpleName() + i);
                    animalInParkList.add(animalInPark);
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        return animalInParkList;
    }

    /**
     * init the animal list
     *
     * @param
     * @return
     */
    public List<Animal> initAnimalKind() {

        List<Animal> animalKindList = new ArrayList<>();

//        version 2
//        use reflection to create all the animal object
        Class<?>[] classes = AnimalEnum.getAllAnimalClazz();
        for (Class<?> clazz : classes) {
            try {
                Animal animal = (Animal) clazz.getDeclaredConstructor().newInstance();
                animalKindList.add(animal);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        return animalKindList;
    }

    /**
     * Show the opening questions
     *
     * @param park
     */
    public OpeningQuestions showOpeningQuestions(Park park) {

        OpeningQuestions openingQuestions = new OpeningQuestions();

        //Q1
        askFirstQuestion(park, openingQuestions);

        //Q2
        askSecondQuestion(openingQuestions);

        //Q3
        askThirdQuestion(openingQuestions);

        return openingQuestions;

    }

    /**
     * Q1
     *
     * @param park
     * @param openingQuestions
     * @return offerChoiceAnimal
     */
    private void askFirstQuestion(Park park, OpeningQuestions openingQuestions) {

        Scanner scanner = new Scanner(System.in);
        // 選項編號
        int optionNo = 1;

        // 指定查看的表演場域(陸、海、空)
        System.out.println("1. Choose the place (" + PlaceEnum.getQuestion1Options() + "): ");
        // if scanner.hasNextInt() is true, then the input is a number

        int placeNo = scanner.nextInt();
        openingQuestions.setPlace(PlaceEnum.getPlaceNo(placeNo));

        // 列出可出場的動物
        System.out.println("We have " + openingQuestions.getPlace() + " animals: ");
        for (Animal animal : park.getAnimalKind()) {
            if (defineAnimalType(animal).equals(openingQuestions.getPlace())) {
                System.out.println(optionNo + ". " + animal.getClass().getSimpleName());
                offerChoiceAnimal.put(String.valueOf(optionNo), animal);
                optionNo++;
            }
        }
    }

    /**
     * Q2
     *
     * @param openingQuestions
     */
    private void askSecondQuestion(OpeningQuestions openingQuestions) {

        Scanner scanner = new Scanner(System.in);

        // 指定查看的動物
        System.out.println("Choose the target animal (if not, input 0, it will random):");

        int animalNo = scanner.nextInt();
        if (animalNo == 0) {
            int random = (int) (Math.random() * offerChoiceAnimal.size() + 1);
            openingQuestions.setSelectedAnimal(offerChoiceAnimal.get(String.valueOf(random)));
        } else {
            openingQuestions.setSelectedAnimal(offerChoiceAnimal.get(String.valueOf(animalNo)));
        }

        openingQuestions.setAnimalSelectedMap(offerChoiceAnimal);

    }

    /**
     * Q3
     *
     * @param openingQuestions
     */
    private void askThirdQuestion(OpeningQuestions openingQuestions) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many animals will show :");
        int countShow = scanner.nextInt();
        while (countShow < 1) {
            System.out.println("Invalid option, please choose again.");
            countShow = scanner.nextInt();
        }

        openingQuestions.setCountShow(countShow);

    }

    /**
     * define the animal type
     *
     * @param animal
     * @return animal type
     */
    public String defineAnimalType(Animal animal) {

//        version 2
//        getInterfaces()[0] is the animal type
//        getInterfaces()[1] is the animal place
        String type = animal.getClass().getInterfaces()[1].getSimpleName();

        return type;
    }

    /**
     * Show the show
     *
     * @param openingQuestions
     * @param park
     */
    public void startShow(OpeningQuestions openingQuestions, Park park) {
        System.out.println("The show is starting...");
        Animal selectedAnimal = openingQuestions.getSelectedAnimal();

        //表演列表
        List<Animal> showList = new ArrayList();
        //表演次數
        int countShow = openingQuestions.getCountShow();
        //打亂park.getAnimalCount()的順序
        List<Animal> animalCountShuffled = park.getAnimalCount();
        Collections.shuffle(animalCountShuffled);
        for (Animal animal : animalCountShuffled) {
            if (defineAnimalType(animal).equals(defineAnimalType(selectedAnimal)) && !(animal.getClass().equals(selectedAnimal.getClass())) && countShow > 1) {
                animal.show();
                countShow--;
            }
            if (defineAnimalType(animal).equals(defineAnimalType(selectedAnimal)) && animal.getClass().equals(selectedAnimal.getClass()) && countShow > 0) {
                showList.add(animal);
            }
        }

        //表演
        showList.get(0).show();

    }
}
