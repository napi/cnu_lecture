package com.study.week1.quiz;

public class EqualQuiz {
	public int i;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EqualQuiz) {
			EqualQuiz obj2 = (EqualQuiz) obj;
			return i == obj2.i;
		}
		
		return false;
	}

}
