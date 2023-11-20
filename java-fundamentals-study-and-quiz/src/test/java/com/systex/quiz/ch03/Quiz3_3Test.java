package com.systex.quiz.ch03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz3_3Test {

    @Test
    void findPrimeNumberLessEqualThan() {
        Quiz3_3 quiz = new Quiz3_3();
        assertAll(
                () -> assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13}, quiz.findPrimeNumberLessEqualThan(13)),
                () -> assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29}, quiz.findPrimeNumberLessEqualThan(30)),
                () -> assertArrayEquals(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}, quiz.findPrimeNumberLessEqualThan(100))
        );
    }
}