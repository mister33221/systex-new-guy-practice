package com.systex.quiz.ch02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Quiz2_2 {

    public List<Integer> squareNumbers(Collection<Integer> c) {
        // Todo Case
//        version 1
//        List<Integer> res = new ArrayList<>();
//        for (Integer integer : c) {
//            res.add(integer * integer);
//        }
//        version 2
//        List<Integer> res = new ArrayList<>();
//        c.forEach(integer -> res.add(integer * integer));
//        version 3
        List<Integer> res = new ArrayList<>();
        c.stream().map(integer -> integer * integer).forEach(res::add);
        return res;
    }

    public List<String> filterLongerThan3CharsWords(Collection<String> c) {
        // Todo Case
//        version 1
//        List<String> res = new ArrayList<>();
//        for (String string : c) {
//            if (string.length() > 3) {
//                res.add(string);
//            }
//        }
//        version 2
        List<String> res = new ArrayList<>();
        c.stream().filter(string -> string.length() > 3).forEach(res::add);
        return res;
    }

    public List<String> uniqueValues(Collection<String> c) {
        // Todo Case
//        version 1
//        List<String> res = new ArrayList<>();
//        for (String string : c) {
//            if (!res.contains(string)) {
//                res.add(string);
//            }
//        }
//        version 2
        List<String> res = new ArrayList<>();
        c.stream().distinct().forEach(res::add);
        return res;
    }

    public List<String> getFirst5Words(Collection<String> c) {
        // Todo Case
//        version 1
//        List<String> res = new ArrayList<>();
//        int count = 0;
//        for (String string : c) {
//            if (count < 5) {
//                res.add(string);
//                count++;
//            }
//        }
//        version 2
        List<String> res = new ArrayList<>();
        c.stream().limit(5).forEach(res::add);
        return res;
    }

    public List<String> skipFirstWords(Collection<String> c) {
        // Todo Case
//        version 1
//        List<String> res = new ArrayList<>();
//        int count = 0;
//        for (String string : c) {
//            if (count > 0) {
//                res.add(string);
//            }
//            count++;
//        }
//        version 2
        List<String> res = new ArrayList<>();
        c.stream().skip(1).forEach(res::add);
        return res;
    }

}
