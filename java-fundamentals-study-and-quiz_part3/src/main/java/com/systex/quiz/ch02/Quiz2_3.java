package com.systex.quiz.ch02;

import com.systex.quiz.ch02.util.Grade;
import com.systex.quiz.ch02.util.PiggyBank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz2_3 {

    public int sumOddNumbers(Collection<Integer> c) {
        return c.stream().filter(i -> i % 2 == 1).reduce(0, Integer::sum);
    }

    public Map<String, Integer> convertListToMap(List<Grade> c) {
        // Todo Case
//        version 1
//        Map<String, Integer> res = new HashMap<>();
//        for (Grade grade : c) {
//            res.put(grade.getGrade(), grade.getPoint());
//        }
//        version 2
        Map<String, Integer> res = c.stream().collect(Collectors.toMap(Grade::getGrade, Grade::getPoint));
        return res;
    }

    public List<Integer> convertMapToList(Map<String, Integer> c) {
        // Todo Case
//        version 1
//        List<Integer> res = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : c.entrySet()) {
//            res.add(entry.getValue());
//        }
//        version 2
        List<Integer> res = c.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        return res;
    }

    public Map<String, List<PiggyBank>> groupPiggyBankByColor(Collection<PiggyBank> c) {
        // Todo Case
//        version 1
//        Map<String, List<PiggyBank>> res = new HashMap<>();
//        for (PiggyBank piggyBank : c) {
//            if (res.containsKey(piggyBank.getColor())) {
//                res.get(piggyBank.getColor()).add(piggyBank);
//            } else {
//                List<PiggyBank> list = new ArrayList<>();
//                list.add(piggyBank);
//                res.put(piggyBank.getColor(), list);
//            }
//        }
//        version 2
        Map<String, List<PiggyBank>> res = c.stream().collect(Collectors.groupingBy(PiggyBank::getColor));
        return res;
    }

    // into another stream
    // flatMap

}
