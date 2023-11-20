package com.systex.quiz.ch03;

import com.systex.quiz.ch03.util.HorseRacing;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

import static java.lang.Thread.sleep;

public class Quiz3_4 {

    public static void horseRacing() {
        System.out.println("How many horses are racing?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int horseAmount = scanner.nextInt();
            HorseRacing horseRacing = new HorseRacing(horseAmount);
            horseRacing.setVisible(true);
            AtomicReference<Boolean> isFinish = new AtomicReference<>(false);
            for (int i = 0; i < horseAmount; i++) {
                int horseNumber = i + 1;
                new Thread(() -> {
                    Integer initPosition = (int) (Math.random()*100 + 1);
                    for (int j = initPosition; j < 100; j++) {
                        horseRacing.setHorsePosition(horseNumber, j);
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (!isFinish.get()) {
                        horseRacing.setMessage("Horse " + horseNumber + " is the winner!");
                        isFinish.set(true);
                    }
                }).start();
            }
        }else {
            System.out.println("Please input a number.");
        }
//        int horseAmount = 2;
//        HorseRacing horseRacingUI = new HorseRacing(horseAmount);
//        horseRacingUI.setVisible(true);
//
//        // Todo Case
//        Thread horse1 = new Thread(() -> {
//            try {
//                horseRacingUI.setHorsePosition(1, 50);
//                sleep(2000);
//                horseRacingUI.setHorsePosition(1, 100);
//                horseRacingUI.setMessage("Horse 1 win");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread horse2 = new Thread(() -> {
//            try {
//                horseRacingUI.setHorsePosition(2, 10);
//                sleep(1000);
//                horseRacingUI.setHorsePosition(2, 70);
//                sleep(2000);
//                horseRacingUI.setHorsePosition(2, 100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        horse1.start();
//        horse2.start();
    }

    public static void main(String[] args) {
        horseRacing();
    }

}
