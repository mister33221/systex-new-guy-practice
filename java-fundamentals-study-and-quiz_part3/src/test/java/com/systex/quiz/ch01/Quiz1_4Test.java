package com.systex.quiz.ch01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.systex.quiz.ch01.util.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Quiz1_4Test {

    static Quiz1_4 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz1_4();
    }

    @Test
    void getIntersectionFrom2Sets() {
        HashSet<Person> set1 = new HashSet<>();
        set1.add(new Person("張學友"));
        set1.add(new Person("周杰倫"));
        HashSet<Person> origSet1 = new HashSet<>();
        origSet1.add(new Person("張學友"));
        origSet1.add(new Person("周杰倫"));

        HashSet<Person> set2 = new HashSet<>();
        set2.add(new Person("周潤發"));
        set2.add(new Person("周杰倫"));
        HashSet<Person> origSet2 = new HashSet<>();
        origSet2.add(new Person("周潤發"));
        origSet2.add(new Person("周杰倫"));

        HashSet<Person> set = new HashSet<>();
        set.add(new Person("周杰倫"));

        Assertions.assertTrue(set.equals(quiz.getIntersectionFrom2Sets(set1, set2)));
        Assertions.assertTrue(set1.equals(origSet1));
        Assertions.assertTrue(set2.equals(origSet2));
    }

    @Test
    void getUnionFrom2Lists() {
        List<Person> list1 = Arrays.asList(new Person("張學友"), new Person("周杰倫"));
        List<Person> list2 = Arrays.asList(new Person("周潤發"), new Person("周杰倫"));

        HashSet<Person> set = new HashSet<>();
        set.add(new Person("周潤發"));
        set.add(new Person("張學友"));
        set.add(new Person("周杰倫"));

        Assertions.assertTrue(set.equals(quiz.getUnionFrom2Lists(list1, list2)));
        Assertions.assertEquals("[張學友, 周杰倫]", list1.toString());
        Assertions.assertEquals("[周潤發, 周杰倫]", list2.toString());
    }
}
