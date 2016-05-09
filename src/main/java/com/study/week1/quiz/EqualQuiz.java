package com.study.week1.quiz;

public class EqualQuiz {
    public int i;

    @Override
    public boolean equals(Object object) {
        if (object instanceof EqualQuiz) {
            EqualQuiz quiz = (EqualQuiz) object;
            if (this.i == quiz.i) {
                return true;
            }
        }
        return false;
    }

}
