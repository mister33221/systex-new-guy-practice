package com.systex.quiz.ch03;

import java.util.ArrayList;
import java.util.List;

public class Quiz3_3 {
    public int[] findPrimeNumberLessEqualThan(int n){
        // TODO Case 1
        // Case 1: 列出質數，輸入一個整數 n，回傳小於等於 n 的全部質數，例如:
        //input: 13. result: [2, 3, 5, 7, 13]
        List<Integer> primeNumbers = new ArrayList<>();
        // 從2開始，一直到包含n的數字
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.stream().mapToInt(i -> i).toArray();
    }

    /**
     * 判斷是否為質數
     * @param i
     * @return true: 質數, false: 合數
     */
    private boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
