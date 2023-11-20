package com.systex.quiz.ch02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Quiz2_2Test {

    static Quiz2_2 quiz;

    @BeforeAll
    static void setUp() {
        quiz = new Quiz2_2();
    }

    @ParameterizedTest
    @CsvSource({
            "123.0, $123.00",
            "12345.0, '$12,345.00'",
            "12345.67, '$12,345.67'",
            "12345.678, '$12,345.68'",
            "-12345.678, '($12,345.68)'"
    })
    void convertDoubleToCurrency(Double input, String expectedResult) {
        String res = quiz.convertDoubleToCurrency(input);
        assertEquals(expectedResult, res);
    }

    @ParameterizedTest
    @CsvSource({
            "'$123.00', 123.0",
            "'$1,234.50', 1234.5",
            "'($1,234.50)', -1234.5"
    })
    void convertCurrencyToDouble(String input, Double expectedResult) {
        Double res = quiz.convertCurrencyToDouble(input);
        assertEquals(expectedResult, res);
    }

    @Test
    void formatDatetime() {
        String res = quiz.formatDatetime(new Date(1630236521413L));
        assertEquals("2021/08/29 07:28:41 PM", res);
    }

    @Test
    void parseDatetime() {
        Date res = quiz.parseDatetime("2021/08/29 07:28:41 PM");
        assertEquals(1630236521000L, res.getTime());
    }
}