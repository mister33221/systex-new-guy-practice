package com.systex.quiz.ch03;

public class Quiz3_2 {
    public int calculateFactorial(int n) {
//        TODO Case 1
//        Case 1: 階乘運算，輸入一個整數 n，回傳 n 階乘計算結果，例如:
//        input: 5, result: 120
//        version 1
//        for(int i = n - 1; i > 0; i--){
//            n *= i;
//        }
//        return n;

//        version 2
        if (n == 0) {
            return 1; //看如果等0想要回傳甚麼
        } else {
//            return n * calculateFactorial(n - 1);
            for (int i = n - 1; i > 0; i--) {
                n *= i;
            }
            return n;
        }
    }
}
