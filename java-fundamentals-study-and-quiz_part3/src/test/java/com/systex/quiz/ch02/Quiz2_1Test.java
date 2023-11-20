package com.systex.quiz.ch02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz2_1Test {

    static Quiz2_1 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz2_1();
    }

    @Test
    void maxNumber() {
        List<Integer> input = Arrays.asList(2, 3, 5, 7, 11, 13);
        int res = quiz.maxNumber(input);
        assertEquals(13, res);
    }

    @Test
    void sumAllNumbers() {
        List<Integer> input = Arrays.asList(2, 3, 5, 7, 11, 13);
        int res = quiz.sumAllNumbers(input);
        assertEquals(41, res);
    }

    @Test
    void itemCounts() {
        List<Integer> input = Arrays.asList(2, 3, 5, 7, 11, 13);
        int res = quiz.itemCounts(input);
        assertEquals(6, res);
    }

    @Test
    void allNumbersBiggerThan10() {
        List<Integer> input = Arrays.asList(2, 3, 5, 7, 11, 13);
        boolean res = quiz.allNumbersBiggerThan10(input);
        assertEquals(false, res);

        List<Integer> input2 = Arrays.asList(11, 13, 17, 19, 23, 29);
        boolean res2 = quiz.allNumbersBiggerThan10(input2);
        assertEquals(true, res2);
    }

    @Test
    void anyNumberBiggerThan10() {
        List<Integer> input = Arrays.asList(2, 3, 5, 7);
        boolean res = quiz.anyNumberBiggerThan10(input);
        assertEquals(false, res);

        List<Integer> input2 = Arrays.asList(2, 3, 5, 11, 7);
        boolean res2 = quiz.anyNumberBiggerThan10(input2);
        assertEquals(true, res2);
    }

}
