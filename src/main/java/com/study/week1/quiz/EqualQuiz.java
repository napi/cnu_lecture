package com.study.week1.quiz;

public class EqualQuiz{
	public int i;

	public boolean equals(Object j)
	{
		if (j instanceof EqualQuiz)
		{
			int m = ((EqualQuiz)j).i;
			if (i == m)
				return true;
		}
		return false;
	}
}
