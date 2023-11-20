package com.systex.quiz.ch03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz3_2Test {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final String newLine = System.getProperty("line.separator");

    static Quiz3_2 quiz;

    @BeforeAll
    static void beforeAll() {
        quiz = new Quiz3_2();
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
    void happyNewYear() {
        Thread a = quiz.happyNewYear();

        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("3...2...1...Happy New Year!"+newLine, out.toString());
    }

    @Test
    void eatHamburger() throws InterruptedException {
        quiz.eatHamburger();

        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("Tom's burger is done!"+newLine+"*Tom is eating burger, Yum-yum..."+newLine, out.toString());
    }

}
