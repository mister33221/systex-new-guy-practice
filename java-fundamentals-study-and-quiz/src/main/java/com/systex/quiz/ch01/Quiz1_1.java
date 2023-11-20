package com.systex.quiz.ch01;

import java.math.BigDecimal;

public class Quiz1_1 {


    public int sumNumbers(int a, int b) {
//        TODO Case 1
//        Case 1: 整數相加
        return a + b;
    }

    public int multipleNumbers(int a, int b) {
//        TODO Case 2
//        Case 2: 整數相乘
        return a * b;
    }

    public int aMinusB(int a, int b) {
//        TODO Case 4
//        Case 4: 整數 A 減 B
        return a - b;
    }

    public double aMinusB(double a, double b) {
//        TODO Case 5
//        Case 5: 浮點數 A 減 B
//        https://stackoverflow.com/questions/9911016/double-subtraction-precision-issue
        BigDecimal c = BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
        return c.doubleValue();
    }

    public double aDividedByB(int a, int b) {
//        TODO Case 3
//        A 除以 B

//        version 1
//        return (double) a / b;

//        version 2

        Double c = Double.valueOf(a) / Double.valueOf(b);
        return c;
    }
}
