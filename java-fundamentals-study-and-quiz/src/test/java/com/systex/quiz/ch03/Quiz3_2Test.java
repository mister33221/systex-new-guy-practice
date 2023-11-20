package com.systex.quiz.ch03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz3_2Test {

    @Test
    void calculateFactorial() {
        Quiz3_2 quiz = new Quiz3_2();
        assertAll(
                () -> assertEquals(120, quiz.calculateFactorial(5)),
                () -> assertEquals(24, quiz.calculateFactorial(4)),
                () -> assertEquals(6, quiz.calculateFactorial(3)),
                () -> assertEquals(2, quiz.calculateFactorial(2)),
                () -> assertEquals(1, quiz.calculateFactorial(1)),
                () -> assertEquals(1, quiz.calculateFactorial(0))
        );
    }
}
