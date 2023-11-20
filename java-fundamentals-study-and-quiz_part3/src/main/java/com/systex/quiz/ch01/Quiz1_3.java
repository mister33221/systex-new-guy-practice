package com.systex.quiz.ch01;

import java.util.Collections;
import java.util.Map;

public class Quiz1_3 {

    public Integer getValueByKey(Map<String, Integer> map, String key) {
        // Todo Case
        return map.get(key);
    }

    public Map<String, Integer> insertValue(Map<String, Integer> map, String key, Integer value) {
        // Todo Case
        map.put(key, value);
        return map;
    }

    public Map<String, Integer> updateValue(Map<String, Integer> map, String key, Integer value) {
        // Todo Case
        map.put(key, value);
        return map;
    }

    public Map<String, Integer> removeValueByKey(Map<String, Integer> map, String key) {
        // Todo Case
        map.remove(key);
        return map;
    }

    public boolean checkKeyExists(Map<String, Integer> map, String key) {
        // Todo Case
        return map.containsKey(key);
    }

    public boolean checkMapEmpty(Map<String, Integer> map) {
        // Todo Case
        return map.isEmpty();
    }

    public int maxNumber(Map<String, Integer> map) {
        // Todo Case
        return Collections.max(map.values());
    }

    public int sumAllNumbers(Map<String, Integer> map) {
        // Todo Case
//        version 1
//        int sum = 0;
//        for (Integer value : map.values()) {
//            sum += value;
//        }
//        version 2
        int sum = map.values().stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    public int itemCounts(Map<String, Integer> map) {
        // Todo Case
        return map.size();
    }

}
