package com.systex.quiz.ch04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz4_1Test {

    Quiz4_1 quiz;

    @BeforeEach
    void setUp() {
        quiz = new Quiz4_1();
    }

    @Test
    void calculateFormula() {
        assertAll(
                () -> assertEquals(2.0, quiz.calculateFormula("1 + 1")),
                () -> assertEquals(4.0, quiz.calculateFormula("2 * 2")),
                () -> assertEquals(2.0, quiz.calculateFormula("3 - 1")),
                () -> assertEquals(2.0, quiz.calculateFormula("4 / 2")),
                () -> assertEquals(-2.0, quiz.calculateFormula("4 - 3 * 2")),
                () -> assertEquals(2.0, quiz.calculateFormula("(4 - 3) * 2")),
                () -> assertEquals(-2.0, quiz.calculateFormula("(4 - 2) - 2 * 2")),
                () -> assertEquals(2.0, quiz.calculateFormula("{[(4 - 3) * 2] * (2 + 2)} / (2 + 2)")),
                () -> assertEquals(Double.POSITIVE_INFINITY, quiz.calculateFormula("(2 + 2) / (2 - 2)")),
                () -> assertEquals(0.0, quiz.calculateFormula("{[(4 - 3) * 2) * (2 + 2)} / (2 + 2)"))
        );
    }
}
