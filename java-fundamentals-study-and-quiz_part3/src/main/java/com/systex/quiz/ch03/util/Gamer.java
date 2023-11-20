package com.systex.quiz.ch03.util;

public class Gamer {
    private Long bubbleTotal;    //彈珠總數

    public Gamer(Long i) {
        this.bubbleTotal = i;
    }

    public void setTotalBubble(Long i) {
        this.bubbleTotal = i;
    }

    public Long getTotalBubble() {
        return bubbleTotal;
    }
}

