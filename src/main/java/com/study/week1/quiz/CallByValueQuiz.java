package com.study.week1.quiz;

import com.study.week1.grammer.Person;

public class CallByValueQuiz {
	public void convert(int i) {
		i += 10;
	}

	public void convert(String s) {
		s.replace("L", "l");
	}
	
	public void convert(Integer i) {
		i.valueOf(100);
	}

	public void convert(Person p) {
		p.setAge(19);
		
		p = new Person(50, "albert");
	}
}
