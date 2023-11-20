package com.systex.quiz.ch02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Quiz2_3Test {

    static Quiz2_3 quiz;

    @BeforeAll
    static void setUp() {
        quiz = new Quiz2_3();
    }

    @ParameterizedTest
    @CsvSource({
            "12345, 2, 34512",
            "12345, 5, 12345",
            "12345, 7, 34512",
            "abcdefg, 8, bcdefga",
    })
    void rotateString(String input, int n, String expectedResult) {
        String res = quiz.rotateString(input, n);
        assertEquals(expectedResult, res);
    }
}