package com.systex.quiz.ch04;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz4_2Test {

    static Quiz4_2 quiz;

    @BeforeAll
    static void setUp() {
        quiz = new Quiz4_2();
    }

    @Test
    void intToRoman() {
        assertAll(
                () -> assertEquals("II", quiz.intToRoman(2)),
                () -> assertEquals("IV", quiz.intToRoman(4)),
                () -> assertEquals("VI", quiz.intToRoman(6)),
                () -> assertEquals("VIII", quiz.intToRoman(8)),
                () -> assertEquals("X", quiz.intToRoman(10)),
                () -> assertEquals("XIX", quiz.intToRoman(19)),
                () -> assertEquals("XXIX", quiz.intToRoman(29)),
                () -> assertEquals("XCIX", quiz.intToRoman(99))
        );
    }

    @Test
    void romanToInt() {
        assertAll(
                () -> assertEquals(2, quiz.romanToInt("II")),
                () -> assertEquals(4, quiz.romanToInt("IV")),
                () -> assertEquals(6, quiz.romanToInt("VI")),
                () -> assertEquals(8, quiz.romanToInt("VIII")),
                () -> assertEquals(10, quiz.romanToInt("X")),
                () -> assertEquals(19, quiz.romanToInt("XIX")),
                () -> assertEquals(29, quiz.romanToInt("XXIX")),
                () -> assertEquals(99, quiz.romanToInt("XCIX"))
        );
    }
}