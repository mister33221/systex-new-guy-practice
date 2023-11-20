package com.systex.quiz.ch02;

public class Quiz2_1 {

    public String cutString(String input, int cutIndex){
        // TODO Case 1
        // Case 1: 字串切割
        // If cutIndex < 0, 回傳原字串
        // If cutIndex >= 字串長度, 回傳 null
        if (cutIndex < 0) {
            return input;
        } else if (cutIndex >= input.length()) {
            return null;
        } else {
            return input.substring(cutIndex);
        }
    }

    public String concatString(String string1, String string2){
        // TODO Case 2
        // Case 2: 字串合併
        // 將 string1 與 string2 合併成一個字串
        StringBuilder sb = new StringBuilder(string1);
        sb.append(string2);
        return sb.toString();
    }

    public String replaceAll(String input, String target, String replacement){
        // TODO Case 3
        // Case 3: 字串替換
        return input.replace(target, replacement);
    }

    public String firstLetterUpperCast(String input){
        // TODO Case 4
        // Case 4: 首字母轉大寫
        // 將 input 字串中的每個單字的首字母轉成大寫
        // 從空白的地方切開
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            // 把每個字的第一個字母轉為大寫，然後接上剩下的字母，最後再加上一個空白
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        // 回傳去掉首尾的空白
        return sb.toString().trim();
    }
}
