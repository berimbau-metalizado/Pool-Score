package com.project.team.poolscore.domain.model;

/**
 * Created by borelanjo on 24/02/2018.
 */

public class Ball {

    private Integer number;
    private String color;

    public Ball() {
    }

    public Ball(Integer number, String color) {
        this.number = number;
        this.color = color;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
