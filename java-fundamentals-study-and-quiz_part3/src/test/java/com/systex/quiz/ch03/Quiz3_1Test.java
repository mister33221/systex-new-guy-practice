package com.systex.quiz.ch03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz3_1Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final String newLine = System.getProperty("line.separator");

    static Quiz3_1 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz3_1();
    }

    @BeforeEach
    void setStreams() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void restoreInitialStreams() {
        System.setOut(originalOut);
    }

    @Test
    void printFromThreadByExtend() {
        quiz.printFromThreadByExtend("World");
        System.out.println("Hello");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("Hello"+newLine+"World"+newLine, out.toString());
    }

    @Test
    void printFromThreadByImplement() {
        quiz.printFromThreadByImplement("World");
        System.out.println("Hello");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("Hello"+newLine+"World"+newLine, out.toString());
    }

}
