package com.systex.quiz.ch03.util;

public class PrinterHappyNewYear extends Thread {

    public void printHappyNewYear() {
        for (int i = 3; i > 0; i--) {
            System.out.print(i + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Happy New Year!");
    }

    @Override
    public void run() {
        printHappyNewYear();
    }

}
