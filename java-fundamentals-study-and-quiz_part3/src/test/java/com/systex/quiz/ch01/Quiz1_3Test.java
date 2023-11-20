package com.systex.quiz.ch01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz1_3Test {

    static Quiz1_3 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz1_3();
    }

    @Test
    void getValueByKey() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 100);
        input.put("b", 90);
        input.put("c", 80);
        input.put("d", 70);
        input.put("e", 60);
        input.put("f", 50);
        input.put("g", 40);
        int res = quiz.getValueByKey(input, "c");
        assertEquals(80, res);
    }

    @Test
    void insertValue() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 100);
        input.put("b", 90);
        input.put("c", 80);
        input.put("d", 70);
        input.put("e", 60);
        input.put("f", 50);
        input.put("g", 40);
        Map<String, Integer> res = quiz.insertValue(input, "h", 30);
        assertEquals(30, res.get("h"));
    }

    @Test
    void updateValue() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 100);
        input.put("b", 90);
        input.put("c", 80);
        input.put("d", 70);
        input.put("e", 60);
        input.put("f", 50);
        input.put("g", 40);
        Map<String, Integer> res = quiz.updateValue(input, "c", 85);
        assertEquals(85, res.get("c"));
    }

    @Test
    void removeValueByKey() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 100);
        input.put("b", 90);
        input.put("c", 80);
        input.put("d", 70);
        input.put("e", 60);
        input.put("f", 50);
        input.put("g", 40);
        Map<String, Integer> res = quiz.removeValueByKey(input, "c");
        assertEquals(false, res.containsKey("c"));
    }

    @Test
    void checkKeyExists() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 100);
        input.put("b", 90);
        input.put("c", 80);
        input.put("d", 70);
        input.put("e", 60);
        input.put("f", 50);
        input.put("g", 40);
        boolean res1 = quiz.checkKeyExists(input, "c");
        assertEquals(true, res1);
        boolean res2 = quiz.checkKeyExists(input, "h");
        assertEquals(false, res2);
    }

    @Test
    void checkMapEmpty() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 100);
        input.put("b", 90);
        input.put("c", 80);
        input.put("d", 70);
        input.put("e", 60);
        input.put("f", 50);
        input.put("g", 40);
        boolean res1 = quiz.checkMapEmpty(input);
        assertEquals(false, res1);
        boolean res2 = quiz.checkMapEmpty(Collections.emptyMap());
        assertEquals(true, res2);
    }

    @Test
    void maxNumber() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 2);
        input.put("b", 3);
        input.put("c", 5);
        input.put("d", 7);
        input.put("e", 11);
        input.put("f", 13);
        int res = quiz.maxNumber(input);
        assertEquals(13, res);
    }

    @Test
    void sumAllNumbers() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 2);
        input.put("b", 3);
        input.put("c", 5);
        input.put("d", 7);
        input.put("e", 11);
        input.put("f", 13);
        int res = quiz.sumAllNumbers(input);
        assertEquals(41, res);
    }

    @Test
    void itemCounts() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 2);
        input.put("b", 3);
        input.put("c", 5);
        input.put("d", 7);
        input.put("e", 11);
        input.put("f", 13);
        int res = quiz.itemCounts(input);
        assertEquals(6, res);
    }
}
