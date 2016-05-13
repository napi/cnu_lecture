package com.study.week1.quiz;

public class EqualQuiz {
	public int i;

	@Override
	public boolean equals(Object obj) {
		EqualQuiz eq = (EqualQuiz)obj;
		if(eq.i == this.i){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
