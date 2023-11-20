package com.systex.quiz.ch02;

public class Quiz2_3 {


    public String rotateString(String input, int n) {
//        TODO Case 1
//        Case 1: 字串輪轉，將字串輪轉 n 個次，每輪轉一次，將會把最前面的字元，搬到最後面，例如：
//        字串 12345 ，輪轉 2 次，則變為 34512
//        字串 12345 ，輪轉 5 次，則變為 12345

//        version 1
//        for (int i = 0; i < n; i++) {
//            input = input.substring(1) + input.charAt(0);
//        }

//        version 2
        int len = input.length();
        n = n % len;
        String result = input.substring(n) + input.substring(0, n);

        return result;
    }

}
