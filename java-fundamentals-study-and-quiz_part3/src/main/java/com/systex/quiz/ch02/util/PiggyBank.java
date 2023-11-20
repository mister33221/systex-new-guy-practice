package com.systex.quiz.ch02.util;

public class PiggyBank {
    private int id;
    private String owner;
    private String color;
    private int money;

    public PiggyBank(int id, String owner, String color, int money) {
        this.id = id;
        this.owner = owner;
        this.color = color;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMoney() {
        return money;
    }

    public void setOwner(int money) {
        this.money = money;
    }

}
