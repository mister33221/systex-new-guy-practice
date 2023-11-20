package com.systex.quiz.ch01;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quiz1_2 {

    public Set<String> insertValue(Set<String> set, String value) {
        // Todo Case
        set.add(value);
        return set;
    }

    public Set<String> removeValue(Set<String> set, String value) {
        // Todo Case
        set.remove(value);
        return set;
    }

    public boolean checkValueExists(Set<String> set, String value) {
        // Todo Case
        return set.contains(value);
    }

    public boolean checkSetEmpty(Set<String> set) {
        // Todo Case
        return set.isEmpty();
    }

    public Set<String> copySet(Set<String> set) {
        // Todo Case
        Set<String> copySet = new HashSet<String>(set);
        return copySet;
    }

    public List<String> covertToList(Set<String> set) {
        // Todo Case
        List<String> list = Collections.list(Collections.enumeration(set));
        return list;
    }

    public int maxNumber(Set<Integer> list) {
        // Todo Case
        return Collections.max(list);
    }

    public int sumAllNumbers(Set<Integer> list) {
        // Todo Case
//        version 1
//        int sum = 0;
//        for (int i : list) {
//            sum += i;
//        }
//        version 2
        int sum = list.stream().mapToInt(Integer::intValue).sum();
//        version 3
//        int sum = list.stream().reduce(0, Integer::sum);
        return sum;
    }

    public int itemCounts(Set<Integer> set) {
        // Todo Case
        // count item in Set
        return set.size();
    }
}
