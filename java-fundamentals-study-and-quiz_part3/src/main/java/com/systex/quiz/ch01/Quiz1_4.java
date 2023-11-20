package com.systex.quiz.ch01;


import com.systex.quiz.ch01.util.Person;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Quiz1_4 {

    public Set<Person> getUnionFrom2Lists(List<Person> list1, List<Person> list2) {
        // Todo Case
//        version 1
//        Set<Person> set = new HashSet<>();
//        set.addAll(list1);
//        set.addAll(list2);
//        version 2
        Set<Person> set = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet());
        return set;

    }

    public Set<Person> getIntersectionFrom2Sets(Set<Person> set1, Set<Person> set2) {
        // Todo Case
//        version 1
//        Set<Person> set = new HashSet<>();
//        set.addAll(set1);
//        for (Person person : set1) {
//            for (Person person2 : set2) {
//                if (person.equals(person2)) {
//                    set.add(person);
//                }
//            }
//        }

//        version 2
        Set<Person> set = set1.stream().filter(set2::contains).collect(Collectors.toSet());
        return set;
    }

}
