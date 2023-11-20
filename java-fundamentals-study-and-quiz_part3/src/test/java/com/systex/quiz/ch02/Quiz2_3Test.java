package com.systex.quiz.ch02;

import com.systex.quiz.ch02.util.Grade;
import com.systex.quiz.ch02.util.PiggyBank;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz2_3Test {

    static Quiz2_3 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz2_3();
    }

    @Test
    void sumOddNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int res = quiz.sumOddNumbers(input);
        assertEquals(25, res);
    }

    @Test
    void convertListToMap() {
        List<Grade> input = Arrays.asList(
                new Grade("a", 100),
                new Grade("b", 90),
                new Grade("c", 80),
                new Grade("d", 70),
                new Grade("e", 60),
                new Grade("f", 50),
                new Grade("g", 40)
        );
        Map<String, Integer> res = quiz.convertListToMap(input);
        assertEquals(90, res.get("b"));
        assertEquals(40, res.get("g"));
    }

    @Test
    void convertMapToList() {
        Map<String, Integer> input = new HashMap<>();
        input.put("e", 60);
        input.put("f", 50);
        input.put("a", 100);
        input.put("c", 80);
        input.put("b", 90);
        input.put("d", 70);
        input.put("g", 40);
        List<Integer> res =  quiz.convertMapToList((input));
        assertEquals(100, res.get(0));
        assertEquals(50 , res.get(5));
    }

    @Test
    void groupPiggyBankByColor() {
        List<PiggyBank> input = Arrays.asList(
                new PiggyBank(1, "John", "red", 10000),
                new PiggyBank(2, "Andy", "red", 7000),
                new PiggyBank(3, "Max", "yellow", 5000),
                new PiggyBank(4, "John", "green", 1000),
                new PiggyBank(5, "Tom", "red", 12000),
                new PiggyBank(6, "Max", "blue", 20000),
                new PiggyBank(7, "John", "yellow", 2000)
        );
        Map<String, List<PiggyBank>> res = quiz.groupPiggyBankByColor(input);
        assertEquals("Max", res.get("blue").get(0).getOwner());
        assertEquals(12000, res.get("red").get(2).getMoney());
    }

}
