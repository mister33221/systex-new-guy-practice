package com.systex.quiz.ch02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz2_2Test {

    static Quiz2_2 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz2_2();
    }

    @Test
    void squareNumbers() {
        List<Integer> input = Arrays.asList(2, 3, 5, 7, 11, 13);
        List<Integer> res = quiz.squareNumbers(input);
        assertEquals("[4, 9, 25, 49, 121, 169]", res.toString());
    }

    @Test
    void filterLongerThan3CharsWords() {
        List<String> input = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox");
        List<String> res = quiz.filterLongerThan3CharsWords(input);
        assertEquals("[apple, banana, elephant]", res.toString());
    }

    @Test
    void uniqueValues() {
        List<String> input = Arrays.asList("microsoft", "apple", "google", "google", "facebook", "apple", "handbook");
        List<String> res = quiz.uniqueValues(input);
        assertEquals("[microsoft, apple, google, facebook, handbook]", res.toString());
    }

    @Test
    void getFirst5Words() {
        List<String> input = Arrays.asList("microsoft", "apple", "google", "google", "facebook", "apple", "handbook");
        List<String> res = quiz.getFirst5Words(input);
        assertEquals("[microsoft, apple, google, google, facebook]", res.toString());
    }

    @Test
    void skipFirstWords() {
        List<String> input = Arrays.asList("microsoft", "apple", "google", "google", "facebook", "apple", "handbook");
        List<String> res = quiz.skipFirstWords(input);
        assertEquals("[apple, google, google, facebook, apple, handbook]", res.toString());
    }

}
