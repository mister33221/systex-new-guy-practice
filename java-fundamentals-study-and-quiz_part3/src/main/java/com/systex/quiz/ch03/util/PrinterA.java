package com.systex.quiz.ch03.util;

// Todo Case
public class PrinterA extends Thread {
    private String msg;

    public PrinterA(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(msg);
    }

}
