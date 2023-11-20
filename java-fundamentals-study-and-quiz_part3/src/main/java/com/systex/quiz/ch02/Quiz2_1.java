package com.systex.quiz.ch02;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Quiz2_1 {

    public int maxNumber(Collection<Integer> c) {
        // Todo Case
//        version 1
//        int max = 0;
//        for (Integer integer : c) {
//            if (integer > max) {
//                max = integer;
//            }
//        }

//        version 2
        int max = c.stream().max(Integer::compareTo).get();
        return max;
    }

    public int sumAllNumbers(Collection<Integer> c) {
        // Todo Case
//        version 1
//        int sum = 0;
//        for (Integer integer : c) {
//            sum += integer;
//        }

//        version 2
        int sum = c.stream().mapToInt(Integer::intValue).sum();

        return sum;
    }

    public int itemCounts(Collection<Integer> c) {
        // Todo Case
//        version 1
//        int count = 0;
//        for (Integer integer : c) {
//            count++;
//        }

//        version 2
        int count = (int) c.stream().count();


        return count;
    }

    public boolean allNumbersBiggerThan10(Collection<Integer> c) {
        // Todo Case
//        version 1
//        Integer[] array = c.toArray(new Integer[c.size()]);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] <= 10) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//        return false;

//        version 2
        boolean result = c.stream().allMatch(i -> i > 10);
        return result;
    }

    public boolean anyNumberBiggerThan10(Collection<Integer> c) {
        // Todo Case
//        version 1
//        Integer[] array = c.toArray(new Integer[c.size()]);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 10) {
//                return true;
//            }
//        }
//        return false;
//        version 2
        boolean result = c.stream().anyMatch(i -> i > 10);
        return result;
    }

}
