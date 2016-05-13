package com.study.week1.quiz;

public class EqualQuiz extends Object{
	public int i;
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof EqualQuiz){
			return true;			
		}
		return false;
	}
}
