package com.systex.quiz.ch03.util;

import java.util.concurrent.atomic.AtomicInteger;

public class GrabBubble implements Runnable {

//    private static Long bubble = 20000L;

    private AtomicInteger bubbleAtomicInteger = new AtomicInteger(20000);

    private Gamer gamer101 = new Gamer(0L);
    private Gamer gamer278 = new Gamer(0L);

    @Override
    public void run() {
        while (true) {

//            version 1
//            synchronized ("鎖") {
//                if (bubble <= 0) {
//                    break;
//                }
//                bubble--;
//                try {
//                    if (Thread.currentThread().getName().equals("101")) {
//                        gamer101.setTotalBubble(Long.valueOf(gamer101.getTotalBubble() + 1));
//                    } else if (Thread.currentThread().getName().equals("278")) {
//                        gamer278.setTotalBubble(Long.valueOf(gamer278.getTotalBubble() + 1));
//                    }
//                } catch (Exception e) {
//                    System.out.println("錯誤");
//                    System.out.println(e);
//                }
//                System.out.println(Thread.currentThread().getName() + "搶到了第" + (20000 - bubble) + "個彈珠,還剩" + bubble + "個彈珠");
//            }

//            version 2
            if (bubbleAtomicInteger.get() <= 0) {
                break;
            }
            bubbleAtomicInteger.decrementAndGet();
            try {
                if (Thread.currentThread().getName().equals("101")) {
                    gamer101.setTotalBubble(Long.valueOf(gamer101.getTotalBubble() + 1));
                } else if (Thread.currentThread().getName().equals("278")) {
                    gamer278.setTotalBubble(Long.valueOf(gamer278.getTotalBubble() + 1));
                }
            } catch (Exception e) {
                System.out.println("錯誤");
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + "搶到了第" + (20000 - bubbleAtomicInteger.get()) + "個彈珠,還剩" + bubbleAtomicInteger.get() + "個彈珠");
        }
    }

    // 101
    public String getGamer101TotalBubble() {
        return gamer101.getTotalBubble().toString();
    }

    // 278
    public String getGamer278TotalBubble() {
        return gamer278.getTotalBubble().toString();
    }
}
