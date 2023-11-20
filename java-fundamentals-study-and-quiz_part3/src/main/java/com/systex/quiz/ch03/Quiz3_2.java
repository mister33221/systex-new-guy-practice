package com.systex.quiz.ch03;

import com.systex.quiz.ch03.util.AteBugerPrinter;
import com.systex.quiz.ch03.util.PrinterHappyNewYear;

public class Quiz3_2 {

    public Thread happyNewYear() {
//        version 1
//        Thread countDown = new Thread(() -> {
//            // Todo Case
//            // 1. 印出 3...2...1...Happy New Year!
//            // 2. 每秒印出一個數字，並且每個數字印出後要有一秒的間隔
//            // 3. 用 Thread.sleep() 來實作
//            Thread t1 = new Thread(() -> {
//                for (int i = 3; i > 0; i--) {
//                    System.out.print(i + "...");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println("Happy New Year!");
//            });
//        });
//        countDown.start();

//        version 2
        Thread countDown = new Thread(new PrinterHappyNewYear());
        countDown.start();

        return countDown;
    }

    public void eatHamburger () throws InterruptedException {
        Thread burgerQueen = new Thread(() -> {
            System.out.println("Tom's burger is done!");
        });
        burgerQueen.start();

        // Todo Case
        AteBugerPrinter ateBugerPrinter = new AteBugerPrinter();
        burgerQueen.join();
        ateBugerPrinter.start();

    }

}


// thread : 一個執行緒
// process : 一個執行緒的集合
// start() : 啟動一個執行緒
// run() : 執行一個執行緒
// join() : 等待一個執行緒結束
// sleep() : 休息一段時間
// yield() : 讓出執行緒的執行權
// interrupt() : 中斷一個執行緒
// isInterrupted() : 檢查一個執行緒是否被中斷
// interrupted() : 檢查目前執行緒是否被中斷
// wait() : 等待一個執行緒
// notify() : 唤醒一個執行緒
// notifyAll() : 唤醒所有執行緒
// synchronized : 同步化
// volatile : 保證變數的可見性


//    為什麼不直接執行run()方法，而要執行start()方法?
//        一、從多執行緒的實現原理分析
//        多執行緒是為了實現執行緒間併發，提高CPU的使用率
//        直接執行 run() 方法，在主執行緒中呼叫 Thread 的 run() 方法，
//        等該 Thread 的 run() 方法執行完畢後才會繼續執行之後的方法，
//        是邏輯上的序列，而沒有實現執行緒的併發
//        執行 start() 則是啟動當前的執行緒，不是立即執行執行緒中的內容，
//        而是讓執行緒處於就緒狀態，等VM（CPU的排程），
//        執行緒得到時間片會自動執行 run() 方法中的內容；
//        執行執行緒的 start() 可以繼續執行呼叫位置之後的程式碼，從而實現啟動多個執行緒的目的，實現併發
