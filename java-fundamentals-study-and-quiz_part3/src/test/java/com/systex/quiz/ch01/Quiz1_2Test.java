package com.systex.quiz.ch01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz1_2Test {

    static Quiz1_2 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz1_2();
    }

    @Test
    void insertValue() {
        Set<String> input = new HashSet<>();
        input.add("Red");
        input.add("Green");
        input.add("Black");
        input.add("White");
        input.add("Pink");
        input.add("Yellow");
        Set<String> res = quiz.insertValue(input, "Purple");
        assertEquals(true, res.contains("Purple"));
    }

    @Test
    void removeValue() {
        Set<String> input = new HashSet<>();
        input.add("Red");
        input.add("Green");
        input.add("Black");
        input.add("White");
        input.add("Pink");
        input.add("Yellow");
        Set<String> res = quiz.removeValue(input, "Black");
        assertEquals("[Red, White, Pink, Yellow, Green]", res.toString());
    }

    @Test
    void checkValueExists() {
        Set<String> input = new HashSet<>();
        input.add("Red");
        input.add("Green");
        input.add("Black");
        input.add("White");
        input.add("Pink");
        input.add("Yellow");
        boolean res1 = quiz.checkValueExists(input, "Black");
        assertEquals(true, res1);
        boolean res2 = quiz.checkValueExists(input, "Purple");
        assertEquals(false, res2);
    }

    @Test
    void checkSetEmpty() {
        Set<String> input = new HashSet<>();
        input.add("Red");
        input.add("Green");
        input.add("Black");
        input.add("White");
        input.add("Pink");
        input.add("Yellow");
        boolean res1 = quiz.checkSetEmpty(input);
        assertEquals(false, res1);
        boolean res2 = quiz.checkSetEmpty(Collections.emptySet());
        assertEquals(true, res2);
    }

    @Test
    void copySet() {
        Set<String> input = new HashSet<>();
        input.add("Red");
        input.add("Green");
        input.add("Black");
        input.add("White");
        input.add("Pink");
        input.add("Yellow");
        Set<String> res = quiz.copySet(input);
        assertEquals("[Red, White, Pink, Yellow, Black, Green]", res.toString());
    }

    @Test
    void covertToList() {
        Set<String> input = new HashSet<>();
        input.add("Red");
        input.add("Green");
        input.add("Black");
        input.add("White");
        input.add("Pink");
        input.add("Yellow");
        List<String> res = quiz.covertToList(input);
        assertEquals("[Red, White, Pink, Yellow, Black, Green]", res.toString());
    }

    @Test
    void maxNumber() {
        Set<Integer> input = new HashSet<>();
        input.add(2);
        input.add(3);
        input.add(5);
        input.add(7);
        input.add(11);
        input.add(13);
        int res = quiz.maxNumber(input);
        assertEquals(13, res);
    }

    @Test
    void sumAllNumbers() {
        Set<Integer> input = new HashSet<>();
        input.add(2);
        input.add(3);
        input.add(5);
        input.add(7);
        input.add(11);
        input.add(13);
        int res = quiz.sumAllNumbers(input);
        assertEquals(41, res);
    }

    @Test
    void itemCounts() {
        Set<Integer> input = new HashSet<>();
        input.add(2);
        input.add(3);
        input.add(5);
        input.add(7);
        input.add(11);
        input.add(13);
        int res = quiz.itemCounts(input);
        assertEquals(6, res);
    }
}
