package com.systex.quiz.ch03;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Quiz3_1Test {

    static Quiz3_1 quiz;

    @BeforeAll
    static void setUp() {
        quiz = new Quiz3_1();
    }

    @Test
    void appendParentheses() {
        assertAll(
                () -> assertEquals("(((hi)))", quiz.appendParentheses("hi", 3)),
                () -> assertEquals("((((()))))", quiz.appendParentheses("", 5)),
                () -> assertEquals("((((()))))", quiz.appendParentheses("(())", 3))
        );
    }

    @Test
    void sumEven() {
        assertAll(
                () -> assertEquals(6, quiz.sumEven(new int[]{1, 2, 3, 4, 5})),
                () -> assertEquals(20, quiz.sumEven(new int[]{0, 2, 4, 6, 8})),
                () -> assertEquals(0, quiz.sumEven(new int[]{1, 3, 5, 7, 9}))
        );
    }
}