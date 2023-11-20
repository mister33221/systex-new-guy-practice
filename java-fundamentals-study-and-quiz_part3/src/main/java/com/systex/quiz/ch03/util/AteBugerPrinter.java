package com.systex.quiz.ch03.util;

public class AteBugerPrinter extends Thread {

    public void printAteBuger() {
        System.out.println("*Tom is eating burger, Yum-yum...");
    }

    public void run() {
        printAteBuger();
    }


}
