package com.study.week1.quiz;

public class EqualQuiz {
	public int i;

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof  EqualQuiz) {
			return this.i == ((EqualQuiz)obj).i;
		}

		return false;
	}
}
