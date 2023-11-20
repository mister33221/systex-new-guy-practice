package com.systex.quiz2.ch04;

import com.systex.quiz2.ch04.model.OpeningQuestions;
import com.systex.quiz2.ch04.model.Park;
import com.systex.quiz2.ch04.util.ActionUtils;
public class Quiz4_1 {

    public static void main(String[] args) {

//        動物園看表演
//
//        提供輸入介面與使用者互動(例如:Scanner) ，讓使用者回答以下問題，並且顯示輸出結果
//
//        使用者回答問題
//
//        指定查看的表演場域(陸、海、空)
//        指定查看的動物(若有被指定查看的動物會作為壓軸最後登場，如果沒有就隨機選取)
//        動物需存在同物種但有多隻的情況，如：動物園同時存在團團、圓圓兩隻熊貓。
//        指定有多少動物會表演(至少要有一隻)
//        輸出結果1
//
//        動物表演行為
        ActionUtils actionUtils = new ActionUtils();

        // init park
        Park park = actionUtils.createPark();

        System.out.println("Welcome to the zoo!");

        // show opening questions
        OpeningQuestions openingQuestions = actionUtils.showOpeningQuestions(park);

        // start the show
        actionUtils.startShow(openingQuestions, park);


    }


}
