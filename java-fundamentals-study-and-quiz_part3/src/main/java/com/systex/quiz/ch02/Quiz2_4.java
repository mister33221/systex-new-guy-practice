package com.systex.quiz.ch02;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Quiz2_4 {
    private List<String> contentWords;

    public Quiz2_4() {
        URL fileURL = this.getClass().getClassLoader().getResource("war-and-peace.txt");
        try {
            String contents = new String(Files.readAllBytes(new File(fileURL.getFile()).toPath()));
            contentWords = Arrays.asList(contents.split("[\\P{L}]+"));
        } catch (IOException e) {
            System.out.println("Can't get resource file");
        }
    }

    public int wordCounts() {
        // Todo Case
        return (int) contentWords.stream().count();

    }

    public int wordCounts(String target) {
        // Todo Case
        return (int) contentWords.stream().filter(s -> s.equalsIgnoreCase(target)).count();
    }

    public List<String> getTopNLongerWords(int n) {
        // Todo Case
        return contentWords.stream()
                .filter(s -> s.length() > 10)
                .distinct()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .limit(n)
                .toList();
    }

}
