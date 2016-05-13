package com.study.week1.quiz;

public class EqualQuiz {
	public int i;
	
	public boolean equals(EqualQuiz Equlas){
		if(this.getI() == Equlas.getI()){
			return true;
		}
		else return false;
	}

	public int getI() {
		return i;
	}
}
