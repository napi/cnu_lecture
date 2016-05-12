package com.study.week1.quiz;

public class EqualQuiz {
	public int i;
	
	public boolean equals(Object obj) {
		if (obj instanceof EqualQuiz) {
			EqualQuiz quiz = (EqualQuiz)obj;
			if(this.i == quiz.i){
				return true;
			}
		}
		return false;
	}
}
