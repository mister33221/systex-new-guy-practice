package com.systex.quiz.ch01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz1_1Test {

    static Quiz1_1 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz1_1();
    }

    @Test
    void getValueByIndex() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        String res1 = quiz.getValueByIndex(input, 1);
        assertEquals("banana", res1);
        String res2 = quiz.getValueByIndex(input, 4);
        assertEquals("elephant", res2);
    }

    @Test
    void insertValueToSpecificIndex() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        List<String> res = quiz.insertValueToSpecificIndex(input, 2, "dodo");
        assertEquals("banana", res.get(1));
        assertEquals("dodo", res.get(2));
        assertEquals("cat", res.get(3));
    }

    @Test
    void updateValueByIndex() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        List<String> res = quiz.updateValueByIndex(input, 2, "dodo");
        assertEquals("banana", res.get(1));
        assertEquals("dodo", res.get(2));
        assertEquals("dog", res.get(3));
    }

    @Test
    void removeValueByIndex() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        List<String> res = quiz.removeValueByIndex(input, 2);
        assertEquals("banana", res.get(1));
        assertEquals("dog", res.get(2));
        assertEquals("elephant", res.get(3));
    }

    @Test
    void checkValueExists() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        boolean res1 = quiz.checkValueExists(input, "dodo");
        assertEquals(false, res1);
        boolean res2 = quiz.checkValueExists(input, "dog");
        assertEquals(true, res2);
    }

    @Test
    void checkListEmpty() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        boolean res1 = quiz.checkListEmpty(input);
        assertEquals(false, res1);
        boolean res2 = quiz.checkListEmpty(Collections.emptyList());
        assertEquals(true, res2);
    }

    @Test
    void sortList() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("cat", "apple", "fox", "dog", "elephant", "banana"));
        List<String> res = quiz.sortList(input);
        assertEquals("[apple, banana, cat, dog, elephant, fox]", res.toString());
    }

    @Test
    void copyList() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        List<String> res = quiz.copyList(input);
        assertEquals("[apple, banana, cat, dog, elephant, fox]", res.toString());
    }

    @Test
    void extractList() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox"));
        List<String> res1 = quiz.extractList(input, 0, 3);
        assertEquals("[apple, banana, cat]", res1.toString());
        List<String> res2 = quiz.extractList(input, 2, 4);
        assertEquals("[cat, dog]", res2.toString());
    }

    @Test
    void concatList() {
        ArrayList<String> input1 = new ArrayList<>(Arrays.asList("apple", "banana", "cat"));
        ArrayList<String> input2 = new ArrayList<>(Arrays.asList("dog", "elephant", "fox"));
        List<String> res1 = quiz.concatList(input1, input2);
        assertEquals("[apple, banana, cat, dog, elephant, fox]", res1.toString());
        assertEquals("[apple, banana, cat]", input1.toString());
        assertEquals("[dog, elephant, fox]", input2.toString());
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

}
