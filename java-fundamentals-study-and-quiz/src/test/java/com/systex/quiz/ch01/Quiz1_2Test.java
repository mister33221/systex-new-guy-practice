package com.systex.quiz.ch01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_2Test {

    static Quiz1_2 quiz;

    @BeforeAll
    static void setUp() {
        quiz = new Quiz1_2();
    }

    @Test
    void convertIntegerToDouble() {
        Double res = quiz.convertIntegerToDouble(10);
        assertEquals(10.0, res);
    }

    @ParameterizedTest
    @CsvSource({
            "5.0, 5",
            "5.4, 5",
            "5.9, 5"
    })
    void convertDoubleToInteger(Double input, Integer expectedResult) {
        Integer res = quiz.convertDoubleToInteger(input);
        assertEquals(expectedResult, res);
    }

    @ParameterizedTest
    @CsvSource({
            "5.0, 5",
            "5.4, 5",
            "5.9, 6"
    })
    void roundDoubleToInteger(Double input, Integer expectedResult) {
        Integer res = quiz.roundDoubleToInteger(input);
        assertEquals(expectedResult, res);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5",
            "0.99, 0.99",
            "-1.98, -1.98"
    })
    void convertNumberToString(Double input, String expectedResult) {
        String res = quiz.convertNumberToString(input);
        assertEquals(expectedResult, res);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5",
            "-9, -9",
            "hello, 0"
    })
    void convertStringToInteger(String input, Integer expectedResult) {
        Integer res = quiz.convertStringToInteger(input);
        assertEquals(expectedResult, res);
    }

    @ParameterizedTest
    @CsvSource({
            "5.0, 5.0",
            "-9.999, -9.999",
            "hello, 0.0"
    })
    void convertStringToDouble(String input, Double expectedResult) {
        Double res = quiz.convertStringToDouble(input);
        assertEquals(expectedResult, res);
    }
}