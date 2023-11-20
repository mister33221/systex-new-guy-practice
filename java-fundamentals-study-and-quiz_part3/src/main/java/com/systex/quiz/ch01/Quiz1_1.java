package com.systex.quiz.ch01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz1_1 {

    public String getValueByIndex(List<String> list, int index) {
        // Todo Case
        return list.get(index);
    }

    public List<String> insertValueToSpecificIndex(List<String> list, int index, String value) {
        // Todo Case
        List<String> newList = list;
        newList.add(index, value);
        return newList;
    }

    public List<String> updateValueByIndex(List<String> list, int index, String value) {
        // Todo Case
        List<String> newList = list;
        newList.set(index, value);
        return newList;
    }

    public List<String> removeValueByIndex(List<String> list, int index) {
        // Todo Case
        List<String> newList = list;
        newList.remove(index);
        return newList;
    }

    public boolean checkValueExists(List<String> list, String value) {
        // Todo Case
        return list.contains(value);
    }

    public boolean checkListEmpty(List<String> list) {
        // Todo Case
        return list.isEmpty();
    }

    public List<String> sortList(List<String> list) {
        // Todo Case
        Collections.sort(list);
        return list;
    }

    public List<String> copyList(List<String> list) {
        // Todo Case
//        version 1
//        List<String> newList = list;
//        version 2
        List<String> newList = new ArrayList<>(list);
        return newList;
    }

    public List<String> extractList(List<String> list, int fromIndex, int toIndex) {
        // Todo Case
        List<String> newList = list.subList(fromIndex, toIndex);
        return newList;
    }

    public List<String> concatList(List<String> list1, List<String> list2) {
        // Todo Case
        List<String> newList = new ArrayList<>(list1);
        newList.addAll(list2);
        return newList;
    }

    public int maxNumber(List<Integer> list) {
        // Todo Case
        return Collections.max(list);
    }

    public int sumAllNumbers(List<Integer> list) {
        // Todo Case
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public int itemCounts(List<Integer> list) {
        // Todo Case
        return list.size();
    }

}
