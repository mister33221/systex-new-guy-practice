package com.systex.quiz.ch03.util;

public class Aircondition {

    private int temperature;

    private int targetTemperature;

    public Aircondition(int temperature, int targetTemperature) {
        this.temperature = temperature;
        this.targetTemperature = targetTemperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(int targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

}
