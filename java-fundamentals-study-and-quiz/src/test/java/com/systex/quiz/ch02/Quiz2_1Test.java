package com.systex.quiz.ch02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Quiz2_1Test {

    static Quiz2_1 quiz;

    @BeforeAll
    static void setUp() {
        quiz = new Quiz2_1();
    }

    @ParameterizedTest
    @CsvSource({
            "Hello, 3, lo",
            "Hello, 1, ello",
            "Hello, 5, ",
            "Hello, 10, ",
            "Hello, -10, Hello"
    })
    void cutString(String input, int cutIndex, String expectedResult) {
        String res = quiz.cutString(input, cutIndex);
        assertEquals(expectedResult, res);
    }

    @Test
    void concatString() {
        String res = quiz.concatString("Hello ", "World");
        assertEquals("Hello World", res);
    }

    @ParameterizedTest
    @CsvSource({
            "1-2-3-4-5, -, _, 1_2_3_4_5",
            "1234-2345, 23, 32, 1324-3245",
    })
    void replaceAll(String input, String target, String replacement, String expectedResult) {
        String res = quiz.replaceAll(input, target, replacement);
        assertEquals(expectedResult, res);
    }

    @Test
    void firstLetterUpperCast() {
        String res = quiz.firstLetterUpperCast("hope all is well.");
        assertEquals("Hope All Is Well.", res);
    }
}