package com.lasalle.met.quiz.model;

import java.util.Date;

public class Score {

    private int position;
    private String title;
    private int score;
    private Date date;

    public Score(int position, String title, int score) {
        this.position = position;
        this.score = score;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
