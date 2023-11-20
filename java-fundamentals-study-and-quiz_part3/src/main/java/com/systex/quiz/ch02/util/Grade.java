package com.systex.quiz.ch02.util;

public class Grade {

    private String grade;
    private int point;

    public Grade(String grade, int point) {
        this.grade = grade;
        this.point = point;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}
