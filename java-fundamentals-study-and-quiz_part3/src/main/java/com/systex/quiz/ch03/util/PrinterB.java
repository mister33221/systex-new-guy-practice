package com.systex.quiz.ch03.util;

// Todo Case
public class PrinterB implements Runnable {
    private String msg;

    public PrinterB(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(msg);
    }

}
