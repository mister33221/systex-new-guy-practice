package com.systex.quiz.ch03;

import com.systex.quiz.ch03.util.PrinterA;
import com.systex.quiz.ch03.util.PrinterB;

public class Quiz3_1 {

    public void printFromThreadByExtend(String msg) {
        // Todo Case
        // print from thread by extend

        PrinterA printerA = new PrinterA(msg);
        printerA.start();

    }

    public void printFromThreadByImplement(String msg) {
        // Todo Case
        // print from thread by implement

        PrinterB printerB = new PrinterB(msg);
        Thread thread = new Thread(printerB);
        thread.start();

    }

}
