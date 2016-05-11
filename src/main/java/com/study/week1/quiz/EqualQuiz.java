package com.study.week1.quiz;

public class EqualQuiz {
	public int i;
	
	@Override
    public boolean equals(Object obj){
        if(obj instanceof EqualQuiz){
            EqualQuiz anoter =  (EqualQuiz)obj;
            if(anoter.i  == this.i){
                return true;
            }
        }
        return false;
	}
}
