package com.systex.quiz.ch02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Quiz2_2 {

    public String convertDoubleToCurrency(Double input) {
        // TODO Case 1
        // Case 1: 將 數字 轉換為 貨幣字串
        //12345 -> $12,345.00
        //-12345 -> ($12,345.00)
        // String format中的%代表占位符，%s代表字符串，%d代表整数，%f代表浮点数，%n代表换行符
        if (input < 0) {
            return String.format(Locale.US, "($%,.2f)", -input);
        } else {
            return String.format(Locale.US, "$%,.2f", input);
        }
    }

    public Double convertCurrencyToDouble(String input) {
        // TODO Case 2
        // Case 2: 將 貨幣字串 轉換為 數字 且只留到小數點後一位
        //$12,345.00 -> 12345
        //($12,345.00) -> -12345
        String AfterReplace = input.replace("$", "").replace(",", "");
        if (AfterReplace.contains("(")) {
            AfterReplace = AfterReplace.replace("(", "").replace(")", "");
            return Double.parseDouble(AfterReplace) * -1;
        } else {
            return Double.parseDouble(AfterReplace);
        }
    }

    public String formatDatetime(Date date) {
        // TODO Case 3
        // Case 3: 將 時間戳記 轉換為 時間字串， 時間字串格式為：2021/01/01 12:00:00 AM
        // covert 1630236521413L to 2021/08/29 07:28:41 PM
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a", Locale.ENGLISH);
        return formatTime.format(date);
    }

    public Date parseDatetime(String dateString) {
//        TODO Case 4
//        Case 4: 將 時間字串 轉換為 時間戳記， 時間字串格式為：2021/01/01 12:00:00 AM
//        covert 2021/08/29 07:28:41 PM to 1630236521000L

//        version 1
//        return new Date(dateString);

//        version 2
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a", Locale.ENGLISH);
        try {
            return formatTime.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
