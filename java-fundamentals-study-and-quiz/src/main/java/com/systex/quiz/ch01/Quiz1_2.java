package com.systex.quiz.ch01;

public class Quiz1_2 {

    public Double convertIntegerToDouble(Integer input) {
        // TODO Case 1
        // Case 1: 整數 轉成 浮點數
        return Double.valueOf(input);
    }

    public Integer convertDoubleToInteger(Double input) {
        // TODO Case 2
        // Case 2: 浮點數 轉成 整數
        // https://stackoverflow.com/questions/25159297/casting-double-to-integer
        return input.intValue();
    }

    public Integer roundDoubleToInteger(Double input) {
//        TODO Case 3
//        Case 3: 浮點數 四捨五入成 整數

//        version 1
//        return (int) Math.round(input);

//        version 2
        return Integer.valueOf(String.valueOf(Math.round(input)));

    }

    public String convertNumberToString(Number input) {
        // TODO Case 4
        // Case 4: 數字 轉成 字串 (如果小數點後面是0，則不顯示小數點後面的數字)

//        version 1
//        Double d = (Double) input;

//        version 2
        Double d = input.doubleValue();
        if (d == d.intValue()) {
            return String.valueOf(d.intValue());
        } else {
            return String.valueOf(d);
        }
    }

    public Integer convertStringToInteger(String input) {
        // TODO Case 5
        // Case 5: 字串 轉成 整數，如無法轉換，則回傳 0
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public Double convertStringToDouble(String input) {
        // TODO Case 6
        // Case 6: 字串 轉成 浮點數，如無法轉換，則回傳 0.0
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
