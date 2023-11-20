package com.systex.quiz.ch03;


import com.systex.quiz.ch03.util.*;

public class Quiz3_3 {

    /**
     * temperatureControl(): 調整冷氣設定溫度，並查看溫度計印出現在幾度
     * 溫度計初始溫度為 28 度
     * 每 5 秒隨機設定一次冷氣溫度 (20~30)
     * 溫度計每秒調節溫度，每次 1 度，與冷氣設定溫度相比做調整
     * 範例
     * 初始查看溫度計顯示為 28，冷氣設定溫度 25
     * 每秒查看溫度計顯示為 27 26 25 25 25
     * 5 秒後，冷氣設定溫度 30
     * 每秒查看溫度計顯示為 26 27 28 29 30
     */
    public static void airConditioner() {
        // Todo Case
        //建立一台冷氣 初始溫度為28度 目標溫度為28
        Aircondition aircondition = new Aircondition(28, 28);
        //建立一個執行緒，每五秒會設定溫度目標，調整介於20-30度間
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    int temperature = (int) (Math.random() * 11 + 20);
                    aircondition.setTargetTemperature(temperature);
                    System.out.println("冷氣目標溫度為：" + temperature);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //建立一個執行緒，每秒將這台冷氣的溫度調整一度至達到設定的目標
        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    if (aircondition.getTemperature() < aircondition.getTargetTemperature()) {
                        aircondition.setTemperature(aircondition.getTemperature() + 1);
                    } else if (aircondition.getTemperature() > aircondition.getTargetTemperature()) {
                        aircondition.setTemperature(aircondition.getTemperature() - 1);
                    }
                    System.out.println("溫度計顯示為：" + aircondition.getTemperature());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread1.start();


    }

    /**
     * 魷魚遊戲的 101 號與 278 號在打彈珠時，兩造同意改用搶彈珠的形式決勝，取得數量最高的人就可以贏得遊戲
     * 建立兩個執行緒分別代表參賽者，在彈珠數量用光前，盡力的搶彈珠，每次只能搶 1 顆
     * 印出 個別搶到的彈珠數量 與 兩人加總的彈珠數量，請確保他們合計不會取得超過 20000 顆彈珠，不然就會被主辦單位淘汰
     * HINT: 使用 java.util.concurrent.atomic 內的 class 做數值運算
     * concurrent.atomic : https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html
     * 建議使用的 class : AtomicInteger
     * 建議使用的 method : get(), incrementAndGet(), getAndIncrement()
     * https://matthung0807.blogspot.com/2019/05/java-javautilconcurrentatomicatomicinte.html
     */
    public static void grabMarbles() {
        // Todo Case

        GrabBubble grabThread = new GrabBubble();
        Thread t1 = new Thread(grabThread,"101");
        Thread t2 = new Thread(grabThread,"278");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("===========================================");
            System.out.println("彈珠已經被搶光了");
            System.out.println("Gamer101搶到了"+grabThread.getGamer101TotalBubble()+"個彈珠");
            System.out.println("Gamer278搶到了"+grabThread.getGamer278TotalBubble()+"個彈珠");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//         For Test Purpose
//         airConditioner();
        grabMarbles();

    }
}
