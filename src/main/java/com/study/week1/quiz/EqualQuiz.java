package com.study.week1.quiz;

public class EqualQuiz extends Object{
	public int i;
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof EqualQuiz){
			EqualQuiz quiz = (EqualQuiz)obj;
			if(this.i == quiz.i){
				return true;
			}
		}
		return false;
	}
}