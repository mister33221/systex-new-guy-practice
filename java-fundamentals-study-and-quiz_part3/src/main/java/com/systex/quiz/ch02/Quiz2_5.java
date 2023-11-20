package com.systex.quiz.ch02;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz2_5 {
    public Map<String, Long> mapReduceWordCount(String input) {
        // TODO
        // Hint: use Stream API
//        version 1
//        String[] words = input.split(" ");
//        Map<String, Long> map = new HashMap<>();
//        for (String word : words) {
//            word = word.replaceAll("[^a-zA-Z0-9]", "");
//
////            version 1
//            map.merge(word, 1L, (oldSum, newSum) -> oldSum + 1);
////            version 2
//            map.merge(word, 1L, Long::sum);
//
//        }
//        version 3
//        Map<String, Long> map = Arrays.stream(input.split(" ")).map(s -> s.replaceAll("[^a-zA-Z0-9]", "")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        version 4 use map and reduce to count the number of words
//        Map<String, Long> map = Arrays.stream(input.split(" ")).map(s -> s.replaceAll("[^a-zA-Z0-9]", "")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        version 5 use Stream.reduce
//        //        version 6
//        List<String> list = Arrays.stream(input.split(" ")).map(s -> s.replaceAll("[^a-zA-Z0-9]", "")).reduce(new ArrayList<String>(), (a, b) -> {
//            a.add(b);
//            return a;
//        }, (a, b) -> {
//            a.addAll(b);
//            return a;
//        });
//        System.out.println(list);
//        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        version 6

        Map<String, Long> map = Arrays.stream(input.split(" "))
                .map(s -> s.replaceAll("[^a-zA-Z0-9]", ""))
                .reduce(new HashMap<String, Long>(),
                        (a, b) -> {
                            System.out.println("a1 = " + a);
                            System.out.println("b1 = " + b);
                            a.merge(b, 1L, Long::sum);
                            return a;
                        },
                        (a, b) -> {
                            System.out.println("a2 = " + a);
                            System.out.println("b2 = " + b);
                            b.forEach((k, v) -> a.merge(k, v, Long::sum));
                            return a;
                        });


        return map;
    }
}
