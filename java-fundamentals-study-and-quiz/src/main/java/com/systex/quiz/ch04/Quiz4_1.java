package com.systex.quiz.ch04;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 未完成
public class Quiz4_1 {


//    public Double calculateFormula(String formula) {
    // TODO
    // 輸入一個四則運算式，包含大中小括號，例如:
    //{1 + [2 * (3 - 1) / (1 + 1)]} / 2
    //calculate a formula with parentheses and return the result

//        System.out.println(formula);
//
//        formula.replace(" ", "");
//
//
//
//        return 0.0;
//    }

// version 2

    public Double calculateFormula(String strExpression) {
        // 簡化、檢查input
        String s = simplify(strExpression);
        if (s == "0.0") {
            return Double.parseDouble(s);
        }

        // 存放計算優先順序的串列
        List<String> list = new ArrayList<>();

        // 排列計算的優先順序到List中
        list = priorityArrangement(s, list);

        System.out.println(list);

        //計算結果
        Double result = calculate(list);

        System.out.println("result: " + result);

        return result;
    }


    /**
     * 化簡表示式
     * 將表示式中的 {}[]替換為()
     * 負數的處理
     * 為了方便將中綴轉換為字尾在字串前後分別加上(,) eg:"1+1" 變為"(1+1)"
     *
     * @param str 輸入的字串
     * @return s 返回簡化完的表示式
     */
    public static String simplify(String str) {
        //去除空白
        str = str.replaceAll(" ", "");
        //負數的處理
        // 處理負數，這裡在-前面的位置加入一個0，如-4變為0-4，
        // 細節：注意-開頭的地方前面一定不能是數字或者反括號，如9-0,(3-4)-5，這裡地方是不能加0的
        // 它的後面可以是數字或者正括號，如-9=>0-9, -(3*3)=>0-(3*3)
        String s = str.replaceAll("(?<![0-9)}\\]])(?=-[0-9({\\[])", "0");
        //計算前後大中小括號數量是否相同
        int preParenthesesCount = 0;
        int postParenthesesCount = 0;
        int preBraceCount = 0;
        int postBraceCount = 0;
        int preBracketCount = 0;
        int postBracketCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                preParenthesesCount++;
            } else if (ch == ')') {
                postParenthesesCount++;
            } else if (ch == '{') {
                preBraceCount++;
            } else if (ch == '}') {
                postBraceCount++;
            } else if (ch == '[') {
                preBracketCount++;
            } else if (ch == ']') {
                postBracketCount++;
            }
        }
        //如果前後括號數量不相等則返回"0.0"
        if (preParenthesesCount != postParenthesesCount || preBraceCount != postBraceCount || preBracketCount != postBracketCount) {
            return "0.0";
        }
        //將表示式中的 {}[]替換為()
        s = s.replace('[', '(');
        s = s.replace(']', ')');
        s = s.replace('{', '(');
        s = s.replace('}', ')');
        //為了方便將中綴轉換為字尾在字串前後分別加上(,)
        s = "(" + s + ")";

        return s;
    }

    /**
     * 優先順序排列
     * @param s
     * @return
     */
    private List<String> priorityArrangement(String s, List<String> list) {

        String numStr = "";//記錄數字
        int l = s.length();//字串長度 l
        Stack<Character> opeStack = new Stack<>();//符號棧
        //遍歷字串，將數字和符號分別存入棧中
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            //如果是運算符號及小括弧
            if (isAllOpe(ch)) {
                //如果numStr不為空，則將數字存入串列中
                if (numStr != "") {
                    list.add(numStr);
                    numStr = "";
                }
                //如果是小括弧，則直接存入符號棧中(不用比較優先級)
                if (ch == '(')
                {
                    opeStack.push(ch);
                }
                // 如果是運算符號，且不是小括號，則比較優先級
                else if (isOpe(ch)) {
                    //查看堆棧頂部的對象，但不從堆棧中移除它。
                    char top = opeStack.peek();
                    //如果當前運算符號的優先級大於棧頂的運算符號
                    if (isGreater(ch, top))
                    // ch優先順序大於top 則直接存入符號棧中
                    {
                        opeStack.push(ch);
                    }
                    //如果當前運算符號的優先級小於等於棧頂的運算符號
                    else {
                        //將棧頂的運算符號存入串列中
                        if (!opeStack.empty() && opeStack.peek() != '(') {
                            list.add(opeStack.pop().toString());
                            opeStack.push(ch);
                        }else {
                            //將當前運算符號存入棧中
                            opeStack.push(ch);
                            break;
                        }
                    }
                }
                //如果是右括弧，則將棧中的運算符號存入串列中，直到遇到左括弧
                else if (ch == ')') {
                    while (opeStack.peek() != '(') {
                        list.add(opeStack.pop().toString());
                    }
                    //將左括弧從棧中移除
                    opeStack.pop();
                }
            }
            //處理數字
            else
            {
                numStr += ch;
            }
        }

        return list;

    }

    /**
     * 處理優先順序
     * @param ch
     */
    public boolean dealPiority(char ch, char top) {
        if (top == '(') {
            return true;
        }
        if (ch == '*' || ch == '/') {
            if (top == '+' || top == '-') {
                return true;
            }
        }
        return false;
    }


    /**
     * 判斷字元c是否為合理(+ - * /)的運算子
     *
     * @param c
     * @return boolean
     */
    public static boolean isOpe(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判斷字元c是否為合理的運算符號或小括弧
     *
     * @param c
     * @return
     */
    public static boolean isAllOpe(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        } else if (c == '(' || c == ')') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 比較字元等級a是否大於b
     *
     * @param a
     * @param b
     * @return 大於返回true 小於等於返回false
     */
    public static boolean isGreater(char a, char b) {
        int a1 = getLevel(a);
        int b1 = getLevel(b);
        if (a1 > b1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 得到一個運算符號的優先順序
     *
     * @param a
     * @return 運算符號的優先順序
     */
    public static int getLevel(char a) {

        if (a == '+') return 0;
        else if (a == '-') return 1;
        else if (a == '*') return 2;
        else if (a == '/') return 3;
        else return -1;

    }

    /**
     * 計算結果
     * @param list
     * @return
     */
    private Double calculate(List<String> list) {

        Stack<Integer> num = new Stack<>(); //數字棧
        for (int i = 0; i < list.size(); i++) { //list : 數字串列
            System.out.println("list.get(i): " + list.get(i));
            String t = list.get(i);
            if (isNumeric(t)) { //如果是數字
                System.out.println("isNumeric(t): " + t);
                num.push(Integer.parseInt(t)); //轉成Integers型別,並入棧
            } else {
                //c : 運算符號
                char c = t.charAt(0);
                int b = num.pop();
                int a = num.pop();
                switch (c) {
                    case '+':
                        num.push(a + b);
                        break;
                    case '-':
                        num.push(a - b);
                        break;
                    case '*':
                        num.push(a * b);
                        break;
                    case '/':
                        if (b == 0) {
                            return Double.POSITIVE_INFINITY;
                        } else {
                            num.push(a / b);
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        return Double.parseDouble(num.pop().toString());
    }

    //判斷是不是數字
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*"); // 正則表達式 [0-9]* 表示0-9的數字可以出現任意次
        Matcher isNum = pattern.matcher(str); // 用正則表達式去匹配字串
        return isNum.matches();
    }
}



