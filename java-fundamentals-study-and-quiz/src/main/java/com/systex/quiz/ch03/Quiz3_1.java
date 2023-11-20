package com.systex.quiz.ch03;

public class Quiz3_1 {

    public String appendParentheses(String input, int n){
        // TODO Case 1
        // Case 1: 包括號，將一個字串的左側及右側，附加 n 個小括號，例如:
        //input: hello, n: 2, 結果應為: ((hello))
        String prifix = "";
        String suffix = "";
        for (int i = 0; i < n; i++) {
            prifix += "(";
            suffix += ")";
        }
        return prifix + input + suffix;
    }

    public int sumEven(int[] numbers){
        // TODO Case 2
        // Case 2: 輸入整數陣列，篩選偶數加總，例如:
        //input: [1, 2, 3, 4, 5], 結果應為: 6
        int sum = 0;
        for (int i : numbers) {
           if(i % 2 == 0){
               sum += i;
           }
        }
        return sum;
    }
}
