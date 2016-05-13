package com.study.week1.quiz;

public class EqualQuiz extends Object{
	public int i;
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof EqualQuiz){
			EqualQuiz quiz = (EqualQuiz)obj;
			return (this.i == quiz.i);
		}
		
		return false;
	}
}
