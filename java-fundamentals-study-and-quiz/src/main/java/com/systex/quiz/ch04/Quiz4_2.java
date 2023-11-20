package com.systex.quiz.ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz4_2 {

    public String intToRoman(int n) {
        // TODO
        // input a number, output a roman number
        // Symbol	Value
        //    "M", 1000
        //    "CM", 900
        //    "D", 500
        //    "CD", 400
        //    "C", 100
        //    "XC", 90
        //    "L", 50
        //    "XL", 40
        //    "X", 10
        //    "IX", 9
        //    "V", 5
        //    "IV", 4
        //    "I", 1
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        // Loop through all the roman literals(romanLiterals) and values(values)
        for(int i=0;i<values.length;i++) {
            // While the number is greater than or equal to the value of the roman literal
            while(n >= values[i]) {
                // minus the value of the roman literal from the number
                n -= values[i];
                // append the roman literal to the roman string
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    public int romanToInt(String r) {
        // TODO
        // input a roman number string, output a number
        // Symbol	Value
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int result = 0;

        // Loop through all the roman literals(romanLiterals) and values(values)
        for(int i=0;i<values.length;i++) {
            // While the number is greater than or equal to the value of the roman literal
            while(r.startsWith(romanLiterals[i])) {
                // minus the value of the roman literal from the number
                r = r.substring(romanLiterals[i].length());
                // append the roman literal to the roman string
                result += values[i];
            }
        }
        return result;
    }
}
