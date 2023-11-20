package com.systex.quiz.ch01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_1Test {

    static Quiz1_1 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz1_1();
    }

    @Test
    void sumNumbersInt() {
        int res = quiz.sumNumbers(1, 2);
        assertEquals(3, res);
    }

    @Test
    void multipleNumbersInt() {
        int res = quiz.multipleNumbers(4, 5);
        assertEquals(20, res);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 2, 2.0",
            "6, 4, 1.5"
    })
    void aDividedByB(int a, int b, double expectedResult) {
        double res = quiz.aDividedByB(a, b);
        assertEquals(expectedResult, res);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 1",
            "3, 2, 1",
            "5, 2, 3"
    })
    void aMinusBInt(int a, int b, int expectedResult) {
        int res = quiz.aMinusB(a, b);
        assertEquals(expectedResult, res);
    }

    @ParameterizedTest
    @CsvSource({
            "2.0, 1.0, 1.0",
            "3.5, 2.5, 1.0",
            "2.0, 1.1, 0.9"
    })
    void aMinusBDouble(double a, double b, double expectedResult) {
        double res = quiz.aMinusB(a, b);
        assertEquals(expectedResult, res);
    }
}