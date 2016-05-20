package com.study.week2.quiz;

/**
 * Created by rokim on 2016. 5. 15..
 */
public enum Student {
    FRESHMAN(1),
    JUNIOR(2),
    SENIOR(3);

    private int grade;

    Student(int i) {
        this.grade = i;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
