package com.systex.quiz.ch02;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Quiz2_5Test {

    @Test
    void mapReduceWordCount() {
        Quiz2_5 quiz = new Quiz2_5();
        String input = "Hi xxx yyy, xxx is not yyy!";
        Map<String, Long> res = quiz.mapReduceWordCount(input);
        Map<String, Long> exp = new HashMap<>();
        exp.put("Hi", 1L);
        exp.put("xxx", 2L);
        exp.put("yyy", 2L);
        exp.put("is", 1L);
        exp.put("not", 1L);
        assertEquals(exp, res);
    }
}